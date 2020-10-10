package it.vscalcione.springboot.angular.userregistration.dao;

import it.vscalcione.springboot.angular.userregistration.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByEmail(String email);
}
