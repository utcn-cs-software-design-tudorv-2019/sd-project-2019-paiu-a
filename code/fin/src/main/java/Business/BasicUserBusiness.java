package Business;

import Data.BasicUser;
import Data.BasicUserRepository;
import Data.UserMessageRepository;

import javax.inject.Inject;

public class BasicUserBusiness {
    @Inject
    BasicUserRepository basicUserRepository;

    public BasicUser findBasicUser(String email){
        return basicUserRepository.findByBasicUserEmail(email);
    }

    @Inject
    UserMessageRepository userMessageRepository;


}
