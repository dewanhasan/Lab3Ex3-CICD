package ie.atu.lab3ex3cicd;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LibraryController {
    private  LibraryService libraryService;
    @Autowired
    public void injectedConstructor(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void addBookstoLib(@RequestBody Book book){
        libraryService.addBook(book);
    }

    @GetMapping("/get")
    public ArrayList<Book> getBooks(){
        return libraryService.getBooks();
    }

}
