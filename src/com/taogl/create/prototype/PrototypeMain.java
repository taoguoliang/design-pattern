package com.taogl.create.prototype;

import java.util.ArrayList;
import java.util.Arrays;

public class PrototypeMain {
    public static void main(String[] args) {
        shallowCopy();
        deepCopy();
    }

    private static void shallowCopy() {
        ShallowCopy shallowCopy = new ShallowCopy();
        shallowCopy.setText("ZL LOVE TGL");
        shallowCopy.setImages(new ArrayList<>(Arrays.asList("1.png", "2.gif", "3.jpg")));
        shallowCopy.showDocument();

        try {
            ShallowCopy newShallowCopy = (ShallowCopy) shallowCopy.clone();
            newShallowCopy.setText("TGL LOVE ZL TOO");
            newShallowCopy.addImage("4.svg");
            newShallowCopy.showDocument();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        shallowCopy.showDocument();
    }

    private static void deepCopy() {
        System.out.println();
        System.out.println("****深拷貝****");
        DeepCopy deepCopy = new DeepCopy();
        deepCopy.setText("ZL LOVE TGL");
        deepCopy.setImages(new ArrayList<>(Arrays.asList("1.png", "2.gif", "3.jpg")));
        deepCopy.showDocument();

        try {
            DeepCopy newDeepCopy = (DeepCopy) deepCopy.clone();
            newDeepCopy.setText("TGL LOVE ZL TOO");
            newDeepCopy.addImage("4.svg");
            newDeepCopy.showDocument();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        deepCopy.showDocument();
    }
}
