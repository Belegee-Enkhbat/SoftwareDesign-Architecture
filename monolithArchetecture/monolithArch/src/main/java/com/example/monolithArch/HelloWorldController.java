package com.example.monolithArch;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    private final ImplBookService bookService;

      @Autowired
    public HelloWorldController(ImplBookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/myFirstFunction2")
    public String helloWorld() {
        return "hello";
    }

    @RequestMapping({"/bookExpAll"})
        String listBooks(Model model){
            model.addAttribute("bookExpAll", bookService.getAllExpensive());
            return "booksExpAll";
        }

    @RequestMapping("/bookTitle")
    String listTitles(Model model) {
        model.addAttribute("Book", bookService.getTitleBooks()); // Change attribute name to "books"
        return "bookTitle";
    }
}
