package gr.aueb.cf.ch17.builder;

public class Book {

    private final long id;
    private final String isbn;
    private final String author;
    private final String title;

    public static class Builder {

        //Required fields
        private final long id;
        private final String isbn;

        //Optional fields -- init to default values
        private String author = "";
        private String title = "";

        public Builder(long id, String isbn) {
            this.id = id;
            this.isbn = isbn;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }

    public Book(Builder builder) {
        this.id = builder.id;
        this.isbn = builder.isbn;
        this.author = builder.author;
        this.title = builder.title;
    }
}
