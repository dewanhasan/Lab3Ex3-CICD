package ie.atu.lab3ex3cicd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        this.addBook(book);

        System.out.println("tittle " +book.getTittle());
        System.out.println("author " +book.getAuthor());
        System.out.println("isbn" +book.getIsbn());
        System.out.println(("publishedYear" +book.getPublishedYear()));
    }

    public List<Book> getBooks(){
        return books;
    }
}
