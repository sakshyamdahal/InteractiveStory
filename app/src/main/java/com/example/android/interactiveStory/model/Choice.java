package com.example.android.interactiveStory.model;

/**
 * Created by sakshyamdahal on 1/16/15.
 */
public class Choice {
    private String mText;
    private int mNextPage;

    public Choice(String text, int nextPage)
    {
        this.setText(text);
        this.setNextPage(nextPage);
    }
    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }


}
