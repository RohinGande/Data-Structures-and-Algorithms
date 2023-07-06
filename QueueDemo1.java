import java.util.*;
import java.io.*;

class QueueUsingArray { // Initializing the front and rear pointers for the created queue
    int frontofQueue, rearofQueue;
    int capacityOfQueue; // size of the queue
    int[] q1; // creating array and kepping the reference as q1

    QueueUsingArray(int size) { // Constructor for knowing the size of the queue
        capacityOfQueue = size;
        q1 = new int[capacityOfQueue];
    }

    void enqueue(int value) {
        if (rearofQueue == capacityOfQueue)
            System.out.println("Queue is full"); // For checking whether the queue is full
        else {
            q1[rearofQueue] = value; // This works when queue is empty. if queue is empty the elements will be
                                     // inserted
            rearofQueue++;
        }
    }

    void dequeue() {
        if (rearofQueue == 0)
            System.out.println("Queue is empty"); // if rear pointer points to 0 that epresents queue is empty
        else {
            for (int i = 0; i < rearofQueue - 1; rearofQueue++) {
                q1[i] = q1[i + 1];
            }
            rearofQueue--;
        }
    }

    void display() { // this is the display function which displays the elements in the queue
        if (rearofQueue == 0) // if rear pointer points to 0 index then queue is empty
            System.out.println("Queue is empty nothing to display");
        else {
            for (int i = 0; i < rearofQueue; i++) {
                System.out.println(q1[i]);
            }
        }
    }
}

public class QueueDemo1 {
    public static void main(String[] args) {
        QueueUsingArray q2 = new QueueUsingArray(5); // creating the object
        q2.enqueue(2); // enqueue() used for inserting the elements into the queue
        q2.enqueue(4);
        q2.enqueue(8);
        q2.display(); // display() used to display the elements in the queue
        q2.dequeue(); // dequeue() is used to remove the top element from the queue
        q2.display();
    }

}
