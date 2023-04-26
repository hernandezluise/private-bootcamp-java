package com.luishernandez.books.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.luishernandez.books.models.Book;
import com.luishernandez.books.repositories.BookRepository;

@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    // updates a book
    public Book updateBook(Book b) {
    	return bookRepository.save(b);
    }
    
    // delete a book
    public void deleteBook(Book b) {
    	bookRepository.deleteById(b.getId());
    }
    
    // Searches for book containing given search
    public List<Book> bookContaining(String search){
    	return bookRepository.findByDescriptionContaining(search);
    }
}
