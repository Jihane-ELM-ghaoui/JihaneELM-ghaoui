package ma.DevSecOpsExam.JihaneELM.ghaoui.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Entity
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private Date birthday;
    private String email;
    private String phone;
    private String address;
    private String major;
    private String level;
}
