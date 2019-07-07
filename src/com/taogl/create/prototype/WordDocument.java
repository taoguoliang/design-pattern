package com.taogl.create.prototype;

import java.util.ArrayList;

public class WordDocument {
    private String text;

    private ArrayList<String> images = new ArrayList<>();

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }

    public WordDocument() {
        System.out.println("构造函数调用");
    }

    public void addImage(String image) {
        this.images.add(image);
    }

    public void showDocument() {
        System.out.println("--------- Word Content Start -----------");
        System.out.println("Text :" + text);
        System.out.println("Images list :");
        for (String imName : images){
            System.out.println("image name :" + imName);
        }
        System.out.println("============= word content end =======");
    }
}
