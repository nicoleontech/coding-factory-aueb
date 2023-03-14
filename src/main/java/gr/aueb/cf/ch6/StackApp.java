package gr.aueb.cf.ch6;

/**
 * Arrays είναι στατικές δομές, οπότε σε εμπορικές εφαρμογές δεν χρησιμοποιούνται
 * LIFO
 * 2 main functions: push -εισαγωγή στοιχείου στο τέλος (isFull() )
 * pop -αφαίρεση στοιχείου από το τέλος (isEmpty() )
 */
public class StackApp {

    static int[] stack = new int[50];
    static int top = -1; //δείχνει στο πάνω μέρος της στοίβας, τώρα που δεν έχει τίποτα δείχνει στο -1

    public static void main(String[] args) {

        int num = 0;

        push(1);
        push(2);
        push(10);
        push(50);
        push(20);
        push(3);
        num = pop();
        num = pop();
        System.out.println("Num= "+num);  //expected = 3;

        printStack();
    }

    public static void push(int num) {
        if (!isFull()) {
            //ή
            //top ++;
            //stack [top] = num;
            stack[++top] = num;
        } else {
            System.out.println("Stack is full");
            throw new RuntimeException();
        }
    }

    public static boolean isFull() {
        //δε χρειάζεται να περάσω την arr ως παράμετρο γιατί είναι declared σε επίπεδο κλάσης
        return (top == stack.length - 1);
    }

    public static int pop() {
        if (!isEmpty()) {
            return stack[top--];
            //ή int lastElem =  stack[top];
            // top--;
            // return lastElem;
        } else {
            System.out.println("Stack is empty");
            throw new RuntimeException();
        }
    }

    public static boolean isEmpty() {
        return (top == -1);
    }

    public static void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return; // επειδή έχω εδώ το return, δεν χρειάζεται else
        }

        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

}
