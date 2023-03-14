package gr.aueb.cf.ch17.builder;

public class Main {

    Book book1 = new Book.Builder(1, "123").build();

    Book book2 = new Book.Builder(2, "3456")
            .setAuthor("NS")
            .setTitle("Java")
            .build();
}
