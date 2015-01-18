package com.example.android.interactiveStory.model;

/**
 * Created by sakshyamdahal on 1/16/15.
 */
public class Page
{
    private int mImageId;
    private String mText;
    private Choice mChoice1;
    private Choice mChoice2;
    private boolean mIsFinal = false;

    public Page(int imageId, String text, Choice choice1, Choice choice2)
    {
        this.setImageId(imageId);
        this.setText(text);
        this.setChoice1(choice1);
        this.setChoice2(choice2);
    }

    public Page(int imageId, String text)
    {
        this.setImageId(imageId);
        this.setText(text);
        this.setChoice1(null);
        this.setChoice2(null);
        this.setFinal(true);

    }


    // code generate
    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }

    public boolean isFinal() {
        return mIsFinal;
    }

    public void setFinal(boolean isFinal) {
        mIsFinal = isFinal;
    }

}
