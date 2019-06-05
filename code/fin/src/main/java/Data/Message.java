package Data;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "message")
public class Message {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMessage;

    @Column
    private String text;

    @OneToMany(mappedBy = "message", fetch = FetchType.EAGER)
    private List< UserMessage > userMessageList;

    public List<UserMessage> getUserMessageList() {
        return userMessageList;
    }

    public void setUserMessageList(List<UserMessage> userMessageList) {
        this.userMessageList = userMessageList;
    }

    public int getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(int idMessage) {
        this.idMessage = idMessage;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
