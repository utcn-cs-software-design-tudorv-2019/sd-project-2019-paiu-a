package Data;

import javax.persistence.*;

@Entity
@Table(name = "basicUser")
public class BasicUser {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser;

    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String information;

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
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
