package com.sg.hjs.driveapp.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sg.hjs.driveapp.controller.ExamFragmentController;
import com.sg.hjs.driveapp.databinding.FragmentExamBinding;
import com.sg.hjs.driveapp.model.Data;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ExamFragment extends Fragment {
    public static final String NAME = "ExamFragment";
    private FragmentExamBinding binding;
    private ExamFragmentController controller;

//    private


    public ExamFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


//        XmlPullParser xp = Xml.newPullParser();
//        try {
//            InputStream is = getContext().getAssets().open("data.xml");//设置数据源
//            xp.setInput(is, "utf-8");
//            int type = xp.getEventType();
//
//            while (type != XmlPullParser.END_DOCUMENT) {//表示这个类型是结束标签
//
//                switch (type) {
//                    case XmlPullParser.START_TAG:
//                        //如果是开始标签
//                        if ("data".equals(xp.getName())) {
//                            list = new ArrayList<Data>();
//                        } else if ("quest".equals(xp.getName())) {
//                            data = new Data();
//                        } else if ("title".equals(xp.getName())) {
//                            data.setTitle(xp.nextText());
//                        } else if ("answer".equals(xp.getName())) {
//                            data.setAnswer(xp.nextText());
//                        } else if ("A".equals(xp.getName())) {
//                            data.setA(xp.nextText());
//                        } else if ("B".equals(xp.getName())) {
//                            data.setB(xp.nextText());
//                        } else if ("C".equals(xp.getName())) {
//                            data.setC(xp.nextText());
//                        } else if ("D".equals(xp.getName())) {
//                            data.setD(xp.nextText());
//                        } else if ("desc".equals(xp.getName())) {
//                            data.setDesc(xp.nextText());
//                        }
//                        break;
//                    case XmlPullParser.END_TAG:   //结束标签
//                        if ("quest".equals(xp.getName())) {
//                            list.add(data);                    //对象加入集合
//                        }
//                        break;
//                }
//                type = xp.next();//移动到下一个节点
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (XmlPullParserException e) {
//            e.printStackTrace();
//        }
//
//
//        System.out.println("list size " + list.size());
//        System.out.println("list a" + data.getA());
//        new Thread() {
//            @Override
//            public void run() {
//                super.run();
//                try {
//                    Document doc = Jsoup.connect("http://mnks.jxedt.com/ckm1/sxlx/").get();
//                    System.out.println(doc.body().text());
//                    Elements links = doc.select("examone");
//                    Elements select = doc.select("lx main");
//                    System.out.println(select.text() + ">>>>>");
//                    Element link = doc.select("a").first();
//                    String relHref = link.attr("href"); // == "/"
//                    String absHref = link.attr("abs:href"); // "http://jsoup.org/"
//                    Log.e("examone", ">>>" + relHref + "," + absHref + "," + link.tagName());
//                    for (Element e : links) {
//
//                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//            }
//        }.start();
//
        click("http://mnks.jxedt.com/ckm1/sxlx/");

        binding = FragmentExamBinding.inflate(inflater);
        controller = new ExamFragmentController(binding, this);
        binding.setController(controller);
        return binding.getRoot();
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
//                setText();

            }
        });
    }

//    private void setText() {
//        binding.tvExam.setText(data.getTitle());
//        binding.cbA.setText(data.getA());
//        binding.cbB.setText(data.getB());
//        binding.cbC.setText(data.getC());
//        binding.rbD.setText(data.getD());
//        binding.tvDesc.setText(data.getDesc());
//        binding.tvDesc.setVisibility(View.GONE);
//    }


    private void click(final String path) {
        new Thread() {

            @Override
            public void run() {
                super.run();
                try {
                    URL url = new URL(path);
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.setRequestMethod("GET");
                    int code = conn.getResponseCode();
                    if (code == 200) {
                        InputStream is = conn.getInputStream();
                        ByteArrayOutputStream bos = new ByteArrayOutputStream();
                        byte[] buffer = new byte[1024];
                        int len = -1;

                        while ((len = is.read(buffer)) != -1) {
                            bos.write(buffer, 0, len);
                        }

                        is.close();
                        bos.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
