package Business;

import Data.Book;
import Data.BookRepository;

import javax.inject.Inject;

public class BookBusiness {

    @Inject
    BookRepository bookRepository;

    public Book findBook(String name){
        return bookRepository.findByBookName(name);
    }


}
