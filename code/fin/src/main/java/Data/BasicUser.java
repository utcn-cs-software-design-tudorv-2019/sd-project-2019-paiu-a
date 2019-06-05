package Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "basicUser")
public class BasicUser {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;

    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String information;

    @OneToMany(mappedBy = "basicUser", fetch = FetchType.EAGER)
    private List< UserMessage > userMessageList;

    @OneToMany(mappedBy = "basicUser", fetch = FetchType.EAGER)
    private List< UserBook > userBookList;

    @ManyToOne
    @JoinColumn(name = "admin")
    @NotNull
    private Admin admin;


    public List<UserBook> getUserBookList() {
        return userBookList;
    }

    public void setUserBookList(List<UserBook> userBookList) {
        this.userBookList = userBookList;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public List<UserMessage> getUserMessageList() {
        return userMessageList;
    }

    public void setUserMessageList(List<UserMessage> userMessageList) {
        this.userMessageList = userMessageList;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
