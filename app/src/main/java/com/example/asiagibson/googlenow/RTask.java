package com.example.asiagibson.googlenow;

/**
 * Created by asiagibson on 11/7/16.
 */

public class RTask {
    private String title;
    private String textEdit;

    public RTask(String title,String edit){
        this.title = title;
        this.textEdit = edit;
    }

    public String getTitle(){
        return title;
    }
  /*  public void setTitle(){
        this.title = title;
    }*/


    public String getTextEdit(){
        return textEdit;
    }
}
