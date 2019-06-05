package Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "userBook")
public class UserBook {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUserBook;

    @ManyToOne
    @JoinColumn(name = "basicUser")
    @NotNull
    private BasicUser basicUser;

    @ManyToOne
    @JoinColumn(name = "book")
    @NotNull
    private Book book;

    public int getIdUserBook() {
        return idUserBook;
    }

    public void setIdUserBook(int idUserBook) {
        this.idUserBook = idUserBook;
    }

    public BasicUser getBasicUser() {
        return basicUser;
    }

    public void setBasicUser(BasicUser basicUser) {
        this.basicUser = basicUser;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
