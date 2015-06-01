package com.demo.android.huiming.geoquiz;

/**
 * Created by huiming on 15-5-27.
 */
public class TrueFalse {
    private int mQuestion;
    private boolean mTrueQuestion;

    public TrueFalse(int question,boolean trueQuestion){
        mQuestion =question;
        mTrueQuestion=trueQuestion;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int mQuestion) {
        this.mQuestion = mQuestion;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }
}
