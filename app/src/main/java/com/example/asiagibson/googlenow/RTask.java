package com.example.asiagibson.googlenow;

/**
 * Created by asiagibson on 11/7/16.
 */

public class RTask {
    private String title;
    private String textEdit;
    private int imageView;
    private Integer hexColor;


    public RTask(String title, String edit, int img, Integer hex) {
        this.title = title;
        this.textEdit = edit;
        this.imageView = img;
        this.hexColor = hex;

    }

    public String getTitle() {
        return title;
    }
  /*  public void setTitle(){
        this.title = title;
    }*/


    public String getTextEdit() {
        return textEdit;
    }

    public int getImageView() {
        return imageView;
    }

    public Integer getHexColor() {
        return hexColor;
    }
}
