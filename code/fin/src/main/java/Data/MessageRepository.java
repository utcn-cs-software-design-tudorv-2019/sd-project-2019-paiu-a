package Data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MessageRepository extends JpaRepository<Message,Integer> {

    List<Message> findAll();
    <S extends Message> S save(S entity);
    Optional<Message> findById(Integer integer);
}
