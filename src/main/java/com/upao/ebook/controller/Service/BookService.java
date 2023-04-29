package com.upao.ebook.controller.Service;


import com.upao.ebook.domain.Book;

import java.util.List;

public interface BookService {
    Book createBook(Book book);
    List<Book> getAllBooks();
}
