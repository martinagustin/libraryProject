Library Management System

A simple object-oriented system to manage books in a library. This project demonstrates basic concepts of Object-Oriented Programming (OOP), including encapsulation, classes, and methods.
Features

    Book Class:
        Stores details of a book (title, author, ISBN, availability).
        Allows lending and returning of books.
        Displays book information.
    Library Class:
        Manages a catalog of books.
        Supports adding, removing, and searching for books.
        Displays the entire catalog with availability status.

How It Works

    Book Class:
        Represents a single book in the library.
        Attributes:
            title: The title of the book.
            author: The author of the book.
            isbn: A unique identifier for the book.
            available: Indicates if the book is available for lending.
        Methods:
            lend(): Marks the book as not available.
            return_book(): Marks the book as available.
            display_info(): Prints the details of the book.

    Library Class:
        Represents the library's collection of books.
        Attributes:
            catalog: A list that stores all books in the library.
        Methods:
            add_book(book): Adds a new book to the catalog.
            remove_book(isbn): Removes a book by its ISBN.
            find_book(title): Searches for a book by title.
            display_catalog(): Shows all books with their availability.
1. Clona el repositorio:
   ```bash
   git clone https://github.com/martinagustin/libraryProjec.git