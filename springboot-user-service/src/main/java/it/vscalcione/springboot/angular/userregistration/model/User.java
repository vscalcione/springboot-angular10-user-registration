package it.vscalcione.springboot.angular.userregistration.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="USER")
public class User {

    @Id
    @GeneratedValue
    private int id;

    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private int experience;
    private String domain;
}
