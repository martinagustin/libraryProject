import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

public class Library {
    private List<Book> books;

    public Library(){
        this.books=new ArrayList<>();
    }
    //add book
    public void addBook(Book book){
        if (book!= null){
            books.add(book);
            System.out.println("Book added: "+book.getTitle());
        }else {
            System.out.println("The book cannot be null");
        }
    }
    public void listBooks(){
        if(books.isEmpty()){
            System.out.println("The collection of books is empty");
        }else {
            System.out.println("List of books:"+"\n{total quantity}: "+books.size());
            for(Book book : books){//tipodato dato in lista
                System.out.println(book);
            }
        }
    }
    public Book searchBook(String idOfBook){
        for(Book book: books) {
            if (book.getIdOfBook().equals(idOfBook)) {
                return book;
            }
        }
        System.out.println("the book with id"+idOfBook+"could not be found");
        return null;
    }
    public void removeBook(String idOfBook){
        Book bookToRemove=searchBook(idOfBook);
        if(bookToRemove != null){
            books.remove(bookToRemove);
            System.out.println("book eliminated: "+bookToRemove.getTitle());
        }
    }

}
