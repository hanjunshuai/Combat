package com.sg.hjs.driveapp.controller;

import android.os.Handler;
import android.os.Message;
import android.util.Xml;
import android.view.View;
import android.widget.Toast;

import com.sg.hjs.driveapp.databinding.FragmentExamBinding;
import com.sg.hjs.driveapp.fragments.ExamFragment;
import com.sg.hjs.driveapp.model.Data;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.LogRecord;

/**
 * Created by hjs on 17-6-21.
 */

public class ExamFragmentController {
    private FragmentExamBinding binding;
    private ExamFragment fragment;
    private List<Data> list;
    private Data data;
    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

        }
    };
    int i = 0;

    public ExamFragmentController(FragmentExamBinding binding, ExamFragment fragment) {
        this.binding = binding;
        this.fragment = fragment;

        parseXml();
        fragment.getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                setText();
                System.out.println(list.get(i).getA().charAt(0));
            }
        });
    }

    public void isCheckBox(View v) {
        if (i < list.size() - 1) {
            i++;
        } else {
            i = 0;
        }
//        char b = list.get(i).getB().charAt(0);
//        char c = list.get(i).getC().charAt(0);
//        char d = list.get(i).getD().charAt(0);
        String a = String.valueOf(list.get(i).getA().charAt(0));
        String answer = list.get(i).getAnswer();

        System.out.println(i + ">>>>>>>");
        if (binding.cbA.isChecked() && a.equals(answer)) {
            Toast.makeText(fragment.getContext(),
                    "正确" + list.get(i).getA().charAt(0) + "<" + list.get(i).getAnswer(),
                    Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(fragment.getContext(), "错误", Toast.LENGTH_SHORT).show();
        }

    }

    /**
     * 解析xml
     */
    private void parseXml() {

        XmlPullParser xp = Xml.newPullParser();
        try {
            InputStream is = fragment.getContext().getAssets().open("data.xml");//设置数据源
            xp.setInput(is, "utf-8");
            int type = xp.getEventType();

            while (type != XmlPullParser.END_DOCUMENT) {//表示这个类型是结束标签

                switch (type) {
                    case XmlPullParser.START_TAG:
                        //如果是开始标签
                        if ("data".equals(xp.getName())) {
                            list = new ArrayList<Data>();
                        } else if ("quest".equals(xp.getName())) {
                            data = new Data();
                        } else if ("title".equals(xp.getName())) {
                            data.setTitle(xp.nextText());
                        } else if ("answer".equals(xp.getName())) {
                            data.setAnswer(xp.nextText());
                        } else if ("A".equals(xp.getName())) {
                            data.setA(xp.nextText());
                        } else if ("B".equals(xp.getName())) {
                            data.setB(xp.nextText());
                        } else if ("C".equals(xp.getName())) {
                            data.setC(xp.nextText());
                        } else if ("D".equals(xp.getName())) {
                            data.setD(xp.nextText());
                        } else if ("desc".equals(xp.getName())) {
                            data.setDesc(xp.nextText());
                        }
                        break;
                    case XmlPullParser.END_TAG:   //结束标签
                        if ("quest".equals(xp.getName())) {
                            list.add(data);                    //对象加入集合
                        }
                        break;
                }
                type = xp.next();//移动到下一个节点
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }


        System.out.println("list size " + list.size());
        System.out.println("list a" + list.get(i).getA());
    }

    /**
     * 设置文本
     */
    private void setText() {
        binding.tvExam.setText(list.get(i).getTitle());
        binding.cbA.setText(list.get(i).getA());
        binding.cbB.setText(list.get(i).getB());
        binding.cbC.setText(list.get(i).getC());
        binding.rbD.setText(list.get(i).getD());
        binding.tvDesc.setText(list.get(i).getDesc());
        binding.tvDesc.setVisibility(View.GONE);
    }
}
