package com.company;

public class Box {
    protected int height;
    protected int length;
    protected int width;
    protected String material;

    public Box() {
    }

    public Box(int height, int length, int width) {
        if (height > 0 && length > 0 && width > 0) {
            this.length = length;
            this.height = height;
            this.width = width;
        }

    }

    public Box(int height, int length, int width, EnumMaterial material) {
        if (height > 0 && length > 0 && width > 0) {
            this.length = length;
            this.height = height;
            this.width = width;
        }
        this.material = material.getDescription();
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        }

    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        }

    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        }

    }

    public String getMaterial() {
        return this.material;
    }

    public int getWidth() {
        return this.width;
    }

    public int getLength() {
        return this.length;
    }

    public int getHeight() {
        return this.height;
    }

    public int calculateVolume() {
        return this.height * this.length * this.width;
    }

    public String toString(){
        return "\nheight: " + height +
                "\nlength: " + length +
                "\nwidth: " + width +
                "\nmaterial: " + material;
    }
}