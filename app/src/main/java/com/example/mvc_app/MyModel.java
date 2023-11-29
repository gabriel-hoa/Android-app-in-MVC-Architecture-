package com.example.mvc_app;

//MVC- Model/View/Controller
// Model - Is the application backend. Acts like the Database or Network(Cloud store)
public class MyModel {

    String appName;
    int appDownloads;
    int appRating;

    public MyModel(String appName, int appDownloads, int appRating) {
        this.appName = appName;
        this.appDownloads = appDownloads;
        this.appRating = appRating;
    }

    public String getAppName() {
        return appName;
    }

    public void getAppName(String appName) {
        this.appName = appName;
    }

    public int getAppDownloads() {
        return appDownloads;
    }

    public void setAppDownloads(int appDownloads){
        this.appDownloads = appDownloads;
    }

    public int getAppRating(){
        return appRating;
    }

    public void setAppRating(int appRating) {
        this.appRating = appRating;
    }

}
