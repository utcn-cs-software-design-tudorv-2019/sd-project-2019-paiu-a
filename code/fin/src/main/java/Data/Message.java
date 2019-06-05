package Data;

import javax.persistence.*;

@Entity
@Table(name = "message")
public class Message {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;

    @Column
    private String text;

    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
