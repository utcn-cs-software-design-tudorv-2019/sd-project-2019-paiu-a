package Data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{

    public List<Book> findAll();
    public Book findByBookName(String bookName);
    public <S extends Book> S save(S entity);
    public Optional<Book> findById(Integer integer);
    public void deleteById(Integer integer);
    public void delete(Book entity);
}

