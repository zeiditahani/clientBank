package tn.isetmd.Ecommerce.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue
    Long code;
    String nom;
    String prenom;
    String numTel;
    String mail;
    String password;
    String numCarte;
    @CreatedDate
    Date dateCarte;
}
