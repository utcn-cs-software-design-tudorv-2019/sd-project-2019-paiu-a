package Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "book")
public class Book {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBook;

    @Column
    private String name;
    @Column
    private String author;
    @Column
    private String aboutTheBook;

    @OneToMany(mappedBy = "book", fetch = FetchType.EAGER)
    private List< UserBook > userBookList;

    public List<UserBook> getUserBookList() {
        return userBookList;
    }

    public void setUserBookList(List<UserBook> userBookList) {
        this.userBookList = userBookList;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAboutTheBook() {
        return aboutTheBook;
    }

    public void setAboutTheBook(String aboutTheBook) {
        this.aboutTheBook = aboutTheBook;
    }
}
