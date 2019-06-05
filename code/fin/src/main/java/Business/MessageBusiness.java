package Business;

import Data.BasicUserRepository;
import Data.Message;
import Data.MessageRepository;
import Data.UserMessageRepository;

import javax.inject.Inject;

public class MessageBusiness {

    @Inject
    MessageRepository messageRepository;
    @Inject
    UserMessageRepository userMessageRepository;
    @Inject
    BasicUserRepository basicUserRepository;

    public Message findTextbyUser(String userName){
        return userMessageRepository.findByUserName(basicUserRepository.findByBasicUserEmail(userName).getName()).getMessage();
    }
}
