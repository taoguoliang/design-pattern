package com.taogl.create.prototype;

public class ShallowCopy extends WordDocument implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ShallowCopy shallowCopy = null;
        try {
            shallowCopy = (ShallowCopy) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return shallowCopy;
    }
}
