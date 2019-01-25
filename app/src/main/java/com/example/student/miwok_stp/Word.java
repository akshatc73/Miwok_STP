package com.example.student.miwok_stp;

/**
 * Created by Student on 11-01-2019.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    /** Image resource ID for the word */
    private int mImageId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;



    public Word(int imageId,String englishTranslation, String miwokTranslation,int audioResourceId) {

        mImageId=imageId;
        mDefaultTranslation = englishTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId=audioResourceId;

    }
  //this constructor is for phrases activity since we are not using any image in phrases activity
    public Word(String englishTranslation, String miwokTranslation) {

        mDefaultTranslation = englishTranslation;
        mMiwokTranslation = miwokTranslation;

    }
    //word constructor for pohrases activity
    public Word(String englishTranslation, String miwokTranslation,int audioResourceId) {

        mDefaultTranslation = englishTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId=audioResourceId;

    }


    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
public int getImageId() {
        return mImageId;
    }


    public boolean hasImage() {
        return mImageId != NO_IMAGE_PROVIDED;
    }
public int getAudioResourceId(){
        return mAudioResourceId;
}

}
