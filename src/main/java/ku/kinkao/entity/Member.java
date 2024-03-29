package ku.kinkao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Member {


    @Id
    @GeneratedValue
    private int id;


    private String username;
    private String password;
    private String firstName;
    private String lastName;
}
