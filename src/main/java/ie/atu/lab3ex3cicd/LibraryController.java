package ie.atu.lab3ex3cicd;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {

    @Autowired
    private  LibraryService libraryService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public LibraryService addBookstoLib(@RequestBody LibraryService libraryService){
        return libraryService;
    }

    @GetMapping("/get")
    public List<Book> getBooks(){
        return libraryService.getBooks();
    }

}
