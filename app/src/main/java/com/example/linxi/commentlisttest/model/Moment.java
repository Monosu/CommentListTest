package com.example.linxi.commentlisttest.model;

/**
 * Created by linxi on 2017/3/4.
 */

import java.util.ArrayList;

/**
 * 动态
 */
public class Moment {
    public String mContent;
    public ArrayList<Comment> mComment;

    public Moment(String mContent, ArrayList<Comment> mComment) {
        this.mContent = mContent;
        this.mComment = mComment;
    }
}
