package com.company;

public class Queue {
    private final int[] queue;
    private final int maximum;
    private int amount;
    private int front;
    private int rear;

    public Queue(int maximum){
        this.maximum = maximum;
        queue = new int[maximum];
        rear = -1;
        front = 0;
        amount = 0;
    }

    public void insert(int element){
        if (rear == maximum - 1){
            rear = -1;
        }
        rear++;
        queue[rear] = element;
        amount++;
    }

    public int remove(){
        int t = queue[front++];

        if (front == maximum){
            front = 0;
        }
        amount--;
        return t;
    }

    public int getFront() {
        return queue[front];
    }

    public int getRear() {
        return queue[rear];
    }

    public boolean isFull() {
        return (amount == maximum - 1);
    }

    public boolean isEmpty() {
        return (amount == 0);
    }

    public int getSize() {
        return amount;
    }
}
