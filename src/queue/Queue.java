
package queue;

public class Queue {

    private int[] arr;
    private int front;
    private int rear;

    private int size;

    public Queue(int capacity) {
        this.arr = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int data) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full.");
        }
        rear = (rear + 1) % arr.length;
        arr[rear] = data;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        int data = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return (size == arr.length);
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s += " " + i;
        }
        s += "\n";
        for (int i = 0; i < arr.length; i++) {
            s += " " + arr[i];
        }
        s += "\n";
        s += "size=" + size + ", front=" + front + ", rear=" + rear;
        return s;
    }


}
