package com.example.hackathon;

public class cardview {
    private final int mImageResource;
    private final String mText1;

    public cardview(int imageResource, String text1) {
        mImageResource = imageResource;
        mText1 = text1;

    }
    public int getImageResource() {
        return mImageResource;
    }
    public String getText1() {
        return mText1;
    }

}
