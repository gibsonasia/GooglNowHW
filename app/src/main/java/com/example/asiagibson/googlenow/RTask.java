package com.example.asiagibson.googlenow;

/**
 * Created by asiagibson on 11/7/16.
 */

public class RTask {
    private String title;
    private String textEdit;
    private int imageView;


    public RTask(String title, String edit, int img) {
        this.title = title;
        this.textEdit = edit;
        this.imageView = img;

    }

    public String getTitle() {
        return title;
    }

    public String getTextEdit() {
        return textEdit;
    }

    public int getImageView() {
        return imageView;
    }

}
