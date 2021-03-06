package com.example.jeff.yueli;

import android.graphics.Bitmap;

import java.io.Serializable;

/**
 * Created by xumuxin on 2018/3/3.
 */

public class User implements Serializable {
    private int user_id;
    private Bitmap bitmap;
    private String nickname;
    private String signature;
    private boolean followed;

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public String getnickname() {
        return nickname;
    }
    public String getSignature() {
        return signature;
    }
    public int getuserid() {
        return user_id;
    }
    public boolean getfollowd() {return followed;}
    public void setnickname(String name) {
        this.nickname = name;
    }
    public void setSignature(String name) {
        this.signature = name;
    }
    public void setuserid(int id) {
        this.user_id = id;
    }
    public void setFollowed(boolean b) {followed=b;}
}
