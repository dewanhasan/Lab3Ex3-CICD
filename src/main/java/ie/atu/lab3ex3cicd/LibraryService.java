package ie.atu.lab3ex3cicd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {
    private ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book book){
        books.add(book);

        System.out.println("tittle " +book.getTitle());
        System.out.println("author " +book.getAuthor());
        System.out.println("isbn" +book.getIsbn());
        System.out.println(("publishedYear" +book.getPublishedYear()));
    }

    public ArrayList<Book> getBooks(){
        System.out.println("returning books");
        return books;
    }
}
