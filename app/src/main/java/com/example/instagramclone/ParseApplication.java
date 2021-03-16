package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ntM4xTwzuf41fBIlPsmKoRGkNioRXMxKDoO7rcKE")
                .clientKey("9NuQQW7ALqt6A5JtYMYaYOrFNZXDowL7CGvWpKlx")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
