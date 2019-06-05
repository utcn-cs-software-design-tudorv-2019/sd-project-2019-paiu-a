package Data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {
     <S extends Admin> S save(S entity);
     void deleteById(Integer integer);
     void delete(Admin entity);
}
