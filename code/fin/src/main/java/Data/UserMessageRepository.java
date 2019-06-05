package Data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserMessageRepository extends JpaRepository<UserMessage, Integer> {

    List<UserMessage> findAll();
    <S extends UserMessage> S save(S entity);
    public UserMessage findByUserName(String message);
    Optional<UserMessage> findById(Integer integer);
}
