package hiber.dao;

<<<<<<< HEAD
import hiber.model.User;
=======
import hiber.model.Car;
import hiber.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
>>>>>>> 75ff48a (Initial commit)

import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> listUsers();
<<<<<<< HEAD
}
=======

   @SuppressWarnings("unchecked")
   User getUserByCar(String model, int series);
}

>>>>>>> 75ff48a (Initial commit)
