package gr.aueb.cf.ch19.dequeapp;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);

        int popped = integerStack.pop();
        System.out.println("Returned from item is " + popped);

        integerStack.forEach(System.out::println);

        //Queue
        Queue<String> garage = new Queue<>();

        garage.enQueue("White car");
        garage.enQueue("Blue car");
        garage.enQueue("Black car");

        String car = garage.deQueue();
        System.out.println("FIFO car returned " + car);
        garage.forEach(System.out::println);
    }
}
