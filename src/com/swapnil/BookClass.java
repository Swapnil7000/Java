package src.com.swapnil;

class Book {
    private String Title;
    private String author;

    public void setBookTitle(String Title) {
        this.Title = Title;
    }

    public void setBookAuthor(String Author) {
        this.author = Author;
    }

    public String getBookAuthor() {
        return author;
    }

    public String getBook() {
        return Title;
    }
};

class BookClass {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setBookTitle(" In Search of Lost Time ");
        b1.setBookAuthor("Marcel Proust");
        System.out.println("Book title: " + b1.getBook());
        System.out.println("Book author: " + b1.getBookAuthor());

    }
}