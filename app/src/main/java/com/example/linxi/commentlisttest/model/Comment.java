package com.example.linxi.commentlisttest.model;

/**
 * Created by linxi on 2017/3/4.
 */

public class Comment {
    public String mContent;
    public User mCommentator;
    public User mReceiver;

    public Comment(String mContent, User mCommentator, User mReceiver) {
        this.mContent = mContent;
        this.mCommentator = mCommentator;
        this.mReceiver = mReceiver;
    }
}
