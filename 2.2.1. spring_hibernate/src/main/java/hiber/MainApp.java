package hiber;

import hiber.config.AppConfig;
<<<<<<< HEAD
=======
import hiber.model.Car;
>>>>>>> 75ff48a (Initial commit)
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);

<<<<<<< HEAD
      userService.add(new User("User1", "Lastname1", "user1@mail.ru"));
      userService.add(new User("User2", "Lastname2", "user2@mail.ru"));
      userService.add(new User("User3", "Lastname3", "user3@mail.ru"));
      userService.add(new User("User4", "Lastname4", "user4@mail.ru"));
=======
      Car car1 = new Car("model1", 22);
      Car car2 = new Car("model2", 54);
      Car car3 = new Car("model3", 99);
      Car car4 = new Car("model4", 8);

      userService.add(new User("User1", "Lastname1", "user1@mail.ru",car1));
      userService.add(new User("User2", "Lastname2", "user2@mail.ru", car2));
      userService.add(new User("User3", "Lastname3", "user3@mail.ru", car3));
      userService.add(new User("User4", "Lastname4", "user4@mail.ru", car4));
>>>>>>> 75ff48a (Initial commit)

      List<User> users = userService.listUsers();
      for (User user : users) {
         System.out.println("Id = "+user.getId());
         System.out.println("First Name = "+user.getFirstName());
         System.out.println("Last Name = "+user.getLastName());
         System.out.println("Email = "+user.getEmail());
<<<<<<< HEAD
         System.out.println();
      }

=======
         System.out.println("Car = "+user.getCar());
         System.out.println();
      }


>>>>>>> 75ff48a (Initial commit)
      context.close();
   }
}
