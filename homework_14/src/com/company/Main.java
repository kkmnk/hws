package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int counter;
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите размер очереди: ");
        Queue queue = new Queue(scanner.nextInt());
        do{
            System.out.print("""
                    1. добавить
                    2. удалить\s
                    3. вывести кол-во элементов в очереди
                    4. извлечь элемент
                    5. выход
                    -""");
            counter = scanner.nextInt();
            switch (counter){
                case 1: {
                    System.out.print("введите элемент: ");
                    queue.insert(scanner.nextInt());
                    break;
                }
                case 2: {
                    queue.remove();
                    break;
                }
                case 3: {
                    System.out.println("размер очереди: " + queue.getSize());
                    break;
                }
                case 4: {
                    System.out.println(queue.remove());
                    break;
                }
                case 5: {
                    break;
                }
                default: {
                    System.out.println("введите корректное значение!");
                }
            }
        } while(counter != 5);
    }
}
