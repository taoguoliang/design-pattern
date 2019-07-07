package com.taogl.create.prototype;

import java.util.ArrayList;

public class DeepCopy extends WordDocument implements Cloneable{
    @SuppressWarnings("unchecked")
    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepCopy deepCopy = (DeepCopy) super.clone();
        this.setImages((ArrayList<String>)this.getImages().clone());
        return deepCopy;
    }
}
