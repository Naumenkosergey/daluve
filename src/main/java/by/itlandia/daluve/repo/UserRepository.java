package by.itlandia.daluve.repo;

import by.itlandia.daluve.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByLogin(String login);


}
