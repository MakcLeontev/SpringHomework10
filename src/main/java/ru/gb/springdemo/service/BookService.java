package ru.gb.springdemo.service;

import org.springframework.stereotype.Service;
import ru.gb.springdemo.model.Book;
import ru.gb.springdemo.repository.BookRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class BookService {
    private final BookRepository bookRepository;


    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book getBookById(long id){
        Book book = bookRepository.getBookById(id);
        if (book != null){
            return book;
        }else {
            throw new NoSuchElementException("не найдена книга с id: "+ id);
        }
    }
    public Book delBookById(long id){
        Book book = bookRepository.delBookById(id);
        if (book != null){
            return book;
        }else {
            throw new NoSuchElementException("не найдена книга с id: "+ id);
        }
    }
    public Book createBook(String name){
        return bookRepository.createBook(name);
    }

}
