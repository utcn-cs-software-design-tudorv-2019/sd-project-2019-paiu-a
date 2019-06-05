package Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "admin")
public class Admin {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdmin;

    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String information;

    @OneToMany(mappedBy = "admin", fetch = FetchType.EAGER)
    private List< UserMessage > userMessageList;

    public List<UserMessage> getUserMessageList() {
        return userMessageList;
    }

    public void setUserMessageList(List<UserMessage> userMessageList) {
        this.userMessageList = userMessageList;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
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
