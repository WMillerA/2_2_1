package hiber.service;

import hiber.model.User;
<<<<<<< HEAD
=======
import org.springframework.transaction.annotation.Transactional;
>>>>>>> 75ff48a (Initial commit)

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
<<<<<<< HEAD
=======

    @Transactional(readOnly = true)
    User getUserByCar(String model, int series);
>>>>>>> 75ff48a (Initial commit)
}
