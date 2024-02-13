package com.android.instarreplica.item;

public class Sentence {

    private String msg;
    private String writer;
    private int likeCnt;
    private int answerCnt;

    public Sentence() {
        this.msg = "";
        this.writer = "";
        this.likeCnt = 0;
        this.answerCnt = 0;
    }

    public Sentence(String msg, String writer, int like, int answer) {
        this.msg = msg;
        this.writer = writer;
        this.likeCnt = like;
        this.answerCnt = answer;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getLikeCnt() {
        return likeCnt;
    }

    public void setLikeCnt(int likeCnt) {
        this.likeCnt = likeCnt;
    }

    public int getAnswerCnt() {
        return answerCnt;
    }

    public void setAnswerCnt(int answerCnt) {
        this.answerCnt = answerCnt;
    }
}
