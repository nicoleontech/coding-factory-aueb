package gr.aueb.cf.ch6;

import java.util.Arrays;

public class QueueApp {

    static int[] queue = new int[50];
    static int top = -1; //δείχνει την αρχή του queue

    public static void main(String[] args) {

        int num = 0;

        enqueue(1);
        enqueue(2);
        enqueue(3);
        num = dequeue();

        System.out.println("Num = "+num);
    }

    public static void enqueue(int val) {
        if (!isFull()) {
            top++;
            queue[top] = val;

            //ή queue[++top] = val;
        } else {
            System.out.println("Queue is full");
        }
    }

    public static int dequeue() {
        int num = 0;
        if (!isEmpty()) {
            num = queue[0]; //εξάγω το 1ο στοιχείο
            //Απ' το 1 μέχρι το length+1 άρα πάλι θα έχω 50 θέσεις, απλά τώρα στην 1η θέση θα είναι το 2ο στοιχείο
            //και το τελευταίο θα το κάνει αυτόματα pad με 0
            queue = Arrays.copyOfRange(queue, 1, queue.length + 1);
            top--;
            return num;
        } else {
            throw new RuntimeException();
        }


    }

    public static boolean isFull() {
        //δε χρειάζεται να περάσω την arr ως παράμετρο γιατί είναι declared σε επίπεδο κλάσης
        return (top == queue.length - 1);
    }

    public static boolean isEmpty() {
        return (top == -1);
    }
}
