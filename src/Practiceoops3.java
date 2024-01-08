import java.sql.SQLOutput;
import java.util.ArrayList;

public class Practiceoops3 {
    public static void main(String[] args) {
        Book b1= new Book("b1","A",1);
        Book b2= new Book("b2","B",11);
        Book b3= new Book("b3","C",111);
        System.out.println("------------------------");
        Book.addBook(b1);
        Book.addBook(b2);
        Book.addBook(b3);
        ArrayList<Book> l= Book.getList();
        for (Book book : l) {
            System.out.println(book.getBookName()+","+book.bookAuthor+","+ book.getISBN());
        }

       Book.removeBook(b2);
        System.out.println("---------------B2 removed---------");
        for (Book book : l) {
            System.out.println(book.getBookName()+","+book.bookAuthor+","+ book.getISBN());
        }

    }



}
class Book{
    String bookName;
    String bookAuthor;
    int ISBN;
    public static ArrayList<Book> list= new ArrayList<Book>();
    public Book(String bookName, String bookAuthor, int ISBN) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.ISBN = ISBN;
    }

    public  String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public static ArrayList<Book> getList() {
        return list;
    }

//    public static void setList(ArrayList<Book> list) {
//        this.list = list;
//    }
    public static void addBook(Book book){
        list.add(book);
    }
    public static void removeBook(Book book){
        list.remove(book);
    }
}