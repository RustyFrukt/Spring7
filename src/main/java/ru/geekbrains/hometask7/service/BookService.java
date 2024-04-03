package ru.geekbrains.hometask7.service;

import ru.geekbrains.hometask7.entity.BookEntity;
import java.util.List;
import java.util.Optional;

public interface BookService {

    Optional<BookEntity> getBookById(long id);

    BookEntity addBook(BookEntity book);

    void deleteBook(long id);

    List<BookEntity> getAllBooks();

}
