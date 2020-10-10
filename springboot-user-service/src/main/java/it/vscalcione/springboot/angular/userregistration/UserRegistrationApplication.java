package it.vscalcione.springboot.angular.userregistration;

import it.vscalcione.springboot.angular.userregistration.dao.UserRepository;
import it.vscalcione.springboot.angular.userregistration.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@CrossOrigin(origins="*")
public class UserRegistrationApplication {

    private final UserRepository userRepository;

    public UserRegistrationApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public String registerUser(@RequestBody User user) {
        userRepository.save(user);
        return "Hi" + user.getFirstName() + "your registration process successfully completed! ";
    }

    @GetMapping("/getAllUsers")
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/findUser/{email}")
    public List<User> findUser(@PathVariable String email) {
        return userRepository.findByEmail(email);
    }

    @DeleteMapping("/delete/{id}")
    public List<User> deleteRegistration(@PathVariable int id) {
        userRepository.deleteById(id);
        return userRepository.findAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(UserRegistrationApplication.class, args);
    }

}
