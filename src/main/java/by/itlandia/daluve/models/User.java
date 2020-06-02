package by.itlandia.daluve.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String login;
    private String password;
    private String email;
    private boolean active;
//    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
//            @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
//            @Enumerated(EnumType.STRING)
//    Set<Role> roles;

    public User(String name, String surname, String login, String password, String email) {
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
        this.email = email;
    }
}
