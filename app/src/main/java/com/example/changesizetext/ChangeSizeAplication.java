package com.example.changesizetext;

import android.app.Application;

import com.example.changesizetext.data.model.User;

public class ChangeSizeAplication extends Application {

    private User user;
    @Override
    public void onCreate() {
        super.onCreate();
        user=new User("Xavier", "xavistiles@gmail.com");
    }

    public User getUser() {
        return user;
    }
}
