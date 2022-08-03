package com.codingdojo.test.services;
import org.springframework.stereotype.Service;
import com.codingdojo.test.repo.Bookrepo;
import com.codingdojo.test.model.Book;
import java.util.List;
import java.util.Optional;
@Service
public class BookService {
	private final Bookrepo bookrepo;
	
public BookService(Bookrepo bookrepo) {
	this.bookrepo = bookrepo;
}
public List <Book> allBooks() {
    return bookrepo.findAll();
}
// creates a book
public Book createBook(Book b) {
    return bookrepo.save(b);
}
// retrieves a book
public Book findBook(Long id) {
    Optional<Book> optionalBook = bookrepo.findById(id);
    if(optionalBook.isPresent()) {
        return optionalBook.get();
    } else {
        return null;
    }

}
public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
	// TODO Auto-generated method stub
	Book b =findBook(id);
	b.setTitle(title);
	b.setDescription(desc);
	b.setLanguage(lang);
	b.setNumberOfPages(numOfPages);
	bookrepo.save(b);
	return null;
}
public void deleteBook(Long id) {
	// TODO Auto-generated method stub
	Book b =findBook(id);
	bookrepo.delete(b);
}
}
