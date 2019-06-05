package Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "userMessage")
public class UserMessage {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUserMessage;

    @ManyToOne
    @JoinColumn(name = "basicUser")
    @NotNull
    private BasicUser basicUser;

    @ManyToOne
    @JoinColumn(name = "message")
    @NotNull
    private Message message;

    public int getIdUserMessage() {
        return idUserMessage;
    }

    public void setIdUserMessage(int idUserMessage) {
        this.idUserMessage = idUserMessage;
    }

    public BasicUser getBasicUser() {
        return basicUser;
    }

    public void setBasicUser(BasicUser basicUser) {
        this.basicUser = basicUser;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
