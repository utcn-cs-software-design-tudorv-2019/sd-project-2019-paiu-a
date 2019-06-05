package Data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BasicUserRepository extends JpaRepository<BasicUser, Integer> {

    List<BasicUser> findAll();
    <S extends BasicUser> S save(S entity);
    public BasicUser findByBasicUserEmail(String basicUserEmail);
    public BasicUser findByBasicUserName(String basicUserName);
    void deleteById(int id);
    void delete(BasicUser entity);
}
