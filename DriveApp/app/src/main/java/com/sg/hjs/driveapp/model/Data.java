package com.sg.hjs.driveapp.model;

/**
 * Created by hjs on 17-6-20.
 */

public class Data {
    private String quest;
    private String title;
    private String answer;
    private String A;
    private String B;
    private String C;
    private String D;
    private String desc;


    @Override
    public String toString() {
        return "Data{" +
                "quest='" + quest + '\'' +
                ", title='" + title + '\'' +
                ", answer='" + answer + '\'' +
                ", A='" + A + '\'' +
                ", B='" + B + '\'' +
                ", C='" + C + '\'' +
                ", D='" + D + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public String getQuest() {
        return quest;
    }

    public void setQuest(String quest) {
        this.quest = quest;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public String getB() {
        return B;
    }

    public void setB(String b) {
        B = b;
    }

    public String getC() {
        return C;
    }

    public void setC(String c) {
        C = c;
    }

    public String getD() {
        return D;
    }

    public void setD(String d) {
        D = d;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
