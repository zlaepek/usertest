package zlaepek.city.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import zlaepek.city.models.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAll();
}
