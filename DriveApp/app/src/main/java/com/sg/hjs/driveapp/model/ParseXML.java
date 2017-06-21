package com.sg.hjs.driveapp.model;

import android.content.Context;
import android.util.Xml;

import org.w3c.dom.Document;
import org.w3c.dom.NameList;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xmlpull.v1.XmlPullParser;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 * Created by hjs on 17-6-20.
 */

public class ParseXML {
    private Context context;

    XmlPullParser xp = Xml.newPullParser();
    InputStream is = getContext().getAssets().open("info.xml");//设置数据源


    public ParseXML() throws IOException {
    }

    public Context getContext() {
        return context;
    }

    //    private String uri;
//
//    public ParseXML(String uri) throws ParserConfigurationException, SAXException, IOException {
//        this.uri = uri;
//
//        System.out.println(">>>>>>>>>>>" + body);
//    }
//
//    Document document = DocumentBuilderFactory.
//            newInstance().newDocumentBuilder()
//            .parse(uri);
//
//    NodeList body = document.getElementsByTagName("body");
//
//    Node root = document.getFirstChild();
//    Node node = root.getFirstChild();

}
