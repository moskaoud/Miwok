package com.example.android.miwok;

/**
 * Created by mukao on 1/5/2018.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mAudioResourceID ;
    private int mImageResourceId = NO_IMAGE_PROVIDED;;
    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation,String miwokTranslation,int imageResourceId,  int audioResourceId) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceID = audioResourceId;

    }
    Word(String defaultTranslation,String miwokTranslation) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    Word(String defaultTranslation,String miwokTranslation,int audioResourceID) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceID = audioResourceID;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getAudioResourceID()
    {
        return mAudioResourceID;
    }
    public int getImageResourceId() {
        return mImageResourceId;
    }
    //Returns whether or not there is an image for this word.
    public boolean hasImage() {
                return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
