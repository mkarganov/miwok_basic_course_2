package com.example.android.miwok;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    /**
     * Creat a new Word object
     * @param miwokTranslation Miwok meaning
     * @param defaultTranslation English word
     */
    public Word (String miwokTranslation, String defaultTranslation) {
        this.mMiwokTranslation = miwokTranslation;
        this.mDefaultTranslation = defaultTranslation;
    }

    /**
     * Creat a new Word object
     * @param miwokTranslation Miwok meaning
     * @param defaultTranslation English word
     * @param imgResId resource id of related image
     */
    public Word (String miwokTranslation, String defaultTranslation, int imgResId) {
        this.mMiwokTranslation = miwokTranslation;
        this.mDefaultTranslation = defaultTranslation;
        mImageResourceId = imgResId;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    /* Checks if word has an image
     *
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
