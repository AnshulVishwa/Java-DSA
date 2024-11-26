class QueueClass {
    int queue[];
    int front, rear, size;
    QueueClass(int len) {
        queue = new int[len];
        front = -1;
        rear = -1;
        size = len;
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        if (front == -1) front = 0; // Initialize front on first enqueue
        rear = (rear + 1) % size; // Circular increment
        queue[rear] = data;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        if (front == rear) {
            // Queue becomes empty after removing the last element
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size; // Circular increment
        }
    }

    boolean isEmpty() {
        return front == -1;
    }

    boolean isFull() {
        return (rear + 1) % size == front;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) break; // Stop when we reach the rear
            i = (i + 1) % size; // Circular increment
        }
        System.out.println();
    }
}

public class CircularQueueDemo {
    public static void main(String[] args) {
        QueueClass line = new QueueClass(5);
        line.enqueue(10);
        line.enqueue(20);
        line.enqueue(30);
        line.enqueue(40);
        line.enqueue(50);
        line.enqueue(60); // Should display "Queue is full!"

        line.display(); // Display the queue

        line.dequeue();
        line.dequeue();
        line.enqueue(60);
        line.enqueue(70);

        line.display(); // Display after some operations
    }
}
