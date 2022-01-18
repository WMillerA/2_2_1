package hiber.service;

import hiber.dao.UserDao;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

   @Autowired
   private UserDao userDao;

<<<<<<< HEAD
   @Transactional
   @Override
   public void add(User user) {
=======
   public UserServiceImp(UserDao userDao) {
      this.userDao = userDao;
   }

   @Transactional
   @Override
   public void add(User user) {

>>>>>>> 75ff48a (Initial commit)
      userDao.add(user);
   }

   @Transactional(readOnly = true)
   @Override
   public List<User> listUsers() {
<<<<<<< HEAD
      return userDao.listUsers();
   }

}
=======

      return userDao.listUsers();
   }

   @Transactional(readOnly = true)
   @Override
   public User getUserByCar(String model, int series) {
      return userDao.getUserByCar(model, series);
   }

}



>>>>>>> 75ff48a (Initial commit)
