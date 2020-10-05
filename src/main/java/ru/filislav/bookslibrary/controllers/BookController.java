package ru.filislav.bookslibrary.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.filislav.bookslibrary.domain.Book;
import ru.filislav.bookslibrary.repository.BooksRepository;

@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BooksRepository booksRepository;

    @GetMapping
    public String index(Model model){
        Iterable<Book> books = booksRepository.findAll();
        model.addAttribute("books",books);
        return "index";
    }
}
