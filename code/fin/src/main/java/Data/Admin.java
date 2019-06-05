package Data;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class Admin {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAdmin;

    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String information;

    public Integer getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Integer idAdmin) {
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
