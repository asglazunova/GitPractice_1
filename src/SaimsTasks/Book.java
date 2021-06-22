package SaimsTasks;

public class Book {
    static String author = " j.k ";

    static {
        author = "stiven king ";
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.author ="Chr";
        Book b2 = new Book();
        System.out.println(b1.author.equals(b2.author));

    }
}
