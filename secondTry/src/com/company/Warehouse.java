package com.company;
import java.awt.*;

public class Warehouse {
    private Box[] arrayBox;
    private int counter = 0;
    private int size;

    public Warehouse(int size) {
        arrayBox = new Box[size];
        this.size = size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCounter() {
        return counter;
    }

    public int getSize() {
        return size;
    }

    public void addBox(Box box){
        if (counter < size) {
            arrayBox[counter] = box;
            counter++;
        } else {
            System.out.println("warehouse if full");
        }
    }

    public void addBox(ColorBox colorBox){
        if (counter < size) {
            arrayBox[counter] = colorBox;
            counter++;
        } else {
            System.out.println("warehouse is full");
        }
    }

    public String toString(int position){
        return arrayBox[position].toString();
    }
}
