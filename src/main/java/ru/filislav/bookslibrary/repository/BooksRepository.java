package ru.filislav.bookslibrary.repository;

import org.springframework.data.repository.CrudRepository;
import ru.filislav.bookslibrary.domain.Book;

public interface BooksRepository extends CrudRepository<Book,Long> {

}
