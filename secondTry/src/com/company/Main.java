package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height, length, width;
        String material, color;

        System.out.print("write size of warehouse: ");
        int size = scanner.nextInt();
        Warehouse warehouse = new Warehouse(size);
        Box box;
        ColorBox colorBox;
        EnumMaterial material1;
        EnumColor enumColor;

        int counter;
        do{
            System.out.print("\n1. add box" +
                    "\n2. show whole warehouse" +
                    "\n3. show amount of boxes"+
                    "\n4. show max size of warehouse" +
                    "\n5. exit" +
                    "\n-");
            counter = scanner.nextInt();
            switch (counter){
                case 1: {
                    System.out.print("выберите тип коробки: 1 - без цвета, 2 - с цветом" +
                            "\n-");
                    int t = scanner.nextInt();
                    if (t == 1){
                        System.out.print("высота: ");
                        height = scanner.nextInt();
                        System.out.print("ширина: ");
                        width = scanner.nextInt();
                        System.out.print("длина: ");
                        length = scanner.nextInt();
                        System.out.print("материал(доступные: металл, дерево, пластик, бумага, картон, пластилин): ");
                        material = scanner.next();

                        if (material.equals(EnumMaterial.METAL.getDescription())){
                            material1 = EnumMaterial.METAL;
                        } else if (material.equals(EnumMaterial.WOOD.getDescription())){
                            material1 = EnumMaterial.WOOD;
                        } else if (material.equals(EnumMaterial.CARDBOARD.getDescription())){
                            material1 =  EnumMaterial.CARDBOARD;
                        } else if (material.equals(EnumMaterial.PAPER.getDescription())){
                            material1 = EnumMaterial.PAPER;
                        } else if (material.equals(EnumMaterial.PLASTICINE.getDescription())){
                            material1 = EnumMaterial.PLASTICINE;
                        } else if (material.equals(EnumMaterial.PLASTIC.getDescription())){
                            material1 = EnumMaterial.PLASTIC;
                        } else {
                            System.out.println("шото ты не то ввел");
                            material1 = EnumMaterial.NOUN;
                        }

                        box = new Box(height, length, width, material1);
                        warehouse.addBox(box);
                    } else if (t == 2 ){
                        System.out.print("высота: ");
                        height = scanner.nextInt();
                        System.out.print("ширина: ");
                        width = scanner.nextInt();
                        System.out.print("длина: ");
                        length = scanner.nextInt();
                        System.out.print("материал(доступные: металл, дерево, пластик, бумага, картон, пластилин): ");
                        material = scanner.next();

                        if (material.equals(EnumMaterial.METAL.getDescription())){
                            material1 = EnumMaterial.METAL;
                        } else if (material.equals(EnumMaterial.WOOD.getDescription())){
                            material1 = EnumMaterial.WOOD;
                        } else if (material.equals(EnumMaterial.CARDBOARD.getDescription())){
                            material1 =  EnumMaterial.CARDBOARD;
                        } else if (material.equals(EnumMaterial.PAPER.getDescription())){
                            material1 = EnumMaterial.PAPER;
                        } else if (material.equals(EnumMaterial.PLASTICINE.getDescription())){
                            material1 = EnumMaterial.PLASTICINE;
                        } else if (material.equals(EnumMaterial.PLASTIC.getDescription())){
                            material1 = EnumMaterial.PLASTIC;
                        } else {
                            System.out.println("шото ты не то ввел");
                            material1 = EnumMaterial.NOUN;
                        }

                        System.out.print("ЦВЕТ(доступные: красный, синий, желтый, черный, белый, розовый): ");
                        color = scanner.next();

                        if (color.equals(EnumColor.YELLOW.getDescription())){
                            enumColor = EnumColor.YELLOW;
                        } else if (color.equals(EnumColor.WHITE.getDescription())){
                            enumColor = EnumColor.WHITE;
                        } else if (color.equals(EnumColor.RED.getDescription())){
                            enumColor = EnumColor.RED;
                        } else if (color.equals(EnumColor.BLUE.getDescription())){
                            enumColor = EnumColor.BLUE;
                        } else if (color.equals(EnumColor.PINK.getDescription())){
                            enumColor = EnumColor.PINK;
                        } else if (color.equals(EnumColor.BLACK.getDescription())){
                            enumColor = EnumColor.BLACK;
                        } else {
                            System.out.println("шото ты опять не то ввел");
                            enumColor = EnumColor.NOUN;
                        }

                        colorBox = new ColorBox(height, length, width, material1, enumColor);
                        warehouse.addBox(colorBox);

                    }
                    else {
                        System.out.println("введите корректное значение!");
                    }



                    break;
                }   //add box
                case 2: {
                    for (int c = 0; c < warehouse.getCounter(); c++){
                        System.out.println(warehouse.toString(c));
                    }
                    break;
                }   //show whole warehouse
                case 3: {
                    System.out.println("amount boxes in warehouse: " + warehouse.getCounter());
                    break;
                }   //show amount of boxes
                case 4: {
                    System.out.println("capacity of warehouse: " + warehouse.getSize());
                    break;
                }   //show capacity of warehouse (getSize)
                case 5: {
                    break;
                }   //exit
                default: {
                    System.out.println("error! write correct variable!");
                }
            }
        } while(counter!=5);
    }
}