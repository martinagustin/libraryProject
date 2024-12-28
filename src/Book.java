public class Book {
    private String title;
    private String author;
    private String idOfBook; //idOfBook
    private boolean available;

    public Book(String title, String author, String idOfBook, int available) {
        this.title = title;
        this.author = author;
        this.idOfBook = idOfBook;

        // Validación del valor de "available"
        if (available == 1) {
            this.available = true; // Disponible
        } else if (available == 0) {
            this.available = false; // No disponible
        } else {
            throw new IllegalArgumentException("El valor de 'available' debe ser 1 (disponible) o 0 (no disponible)");
        }
    }
    //getters & setters
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIdOfBook() {
        return idOfBook;
    }

    public void setIdOfBook(String idOfBook) {
        this.idOfBook = idOfBook;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    //toStirng
    @Override
    public String toString() {
        return "{"+
                "title='"+title+'\''+
                ", autor='"+author+'\''+
                ", idOfBook='" + idOfBook + '\'' +
                ", available=" + (available ? "'Yes'" : "'No'") +
                '}';
    }
    public void toRender(){
        if(this.available){
            this.available= false;
            System.out.println("rented with success");
        } else{
            System.out.println("I'm sorry, it has already been rented");
        }
    }
    public void toReturn(){
        this.available=true;
        System.out.println("thanks for returning it");

    }
}