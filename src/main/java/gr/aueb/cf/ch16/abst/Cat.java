package gr.aueb.cf.ch16.abst;

public class Cat extends Animal {

    //should be overriden
    @Override
    public void speak() {
        System.out.println("Meow");
    }

    //can be overriden
    @Override
    public void eat() {
        super.eat();
        System.out.println("she ate all her food");
    }
}
