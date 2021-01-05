package com.example.android.miwok;

public class Word {
    private String miwok_translation, default_translation;
    public Word(){
        miwok_translation = default_translation = "";
    }
    public Word(String default_translation, String miwok_translation){
        this.miwok_translation = miwok_translation;
        this.default_translation = default_translation;
    }
    public String getMiwokTranslation(){
        return this.miwok_translation;
    }
    public String getDefaultTranslation(){
        return this.default_translation;
    }
}
