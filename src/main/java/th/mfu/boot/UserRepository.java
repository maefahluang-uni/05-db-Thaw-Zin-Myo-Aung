package th.mfu.boot;

import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.springframework.data.repository.CrudRepository;

import com.fasterxml.jackson.annotation.JsonManagedReference;

public interface UserRepository extends CrudRepository<User, Long> {

    
    public List<User> findAll();
    public User findByUsername(String username);
}
