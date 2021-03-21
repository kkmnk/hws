package com.company;

public class ColorBox extends Box{
    private String color;

    public ColorBox(EnumColor color){
        this.color = color.getDescription();
    }

    public ColorBox(int height, int length, int width, EnumMaterial material, EnumColor color) {
        super(height, length, width, material);
        this.color = color.getDescription();
    }

    public String getColor() {
        return color;
    }

    public void setColor(EnumColor color) {
        this.color = color.getDescription();
    }

    public String toString(){
        return "\nheight: " + height +
                "\nlength: " +  width +
                "\nwidth: " + length +
                "\nmaterial: " + material +
                "\ncolor: " + color;
    }
}