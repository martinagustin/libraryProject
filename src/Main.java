//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book libro1=new Book("100 anos de soledad","Borges","0001",1);
        Book libro2=new Book("soledad y castigo","Carton F.","0002",0);
        Book libro3=new Book("Rayuela","Cortazar","0003",1);
        Library list1=new Library();
        list1.addBook(libro1);
        list1.addBook(libro2);
        list1.addBook(libro3);
        System.out.println();
        //System.out.println(list1.searchBook("0001"));
        list1.listBooks();
        list1.removeBook("0001");
        list1.listBooks();


    }
}