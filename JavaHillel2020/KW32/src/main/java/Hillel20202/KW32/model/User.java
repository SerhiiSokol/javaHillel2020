package Hillel20202.KW32.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * -- auto-generated definition
 * CREATE TABLE user
 * (
 * id          INT(10) UNSIGNED AUTO_INCREMENT
 * PRIMARY KEY,
 * first_name  VARCHAR(20)            NULL,
 * second_name VARCHAR(30)            NULL,
 * email       VARCHAR(40)            NULL,
 * phone       VARCHAR(13)            NULL,
 * address_id  INT(10) UNSIGNED       NULL,
 * login       VARCHAR(15)            NOT NULL,
 * is_deleted  TINYINT(1) DEFAULT '0' NULL,
 * pass        VARCHAR(255)           NOT NULL,
 * CONSTRAINT user_ibfk_1
 * FOREIGN KEY (address_id) REFERENCES address (id)
 * ON UPDATE CASCADE
 * );
 * CREATE INDEX address_id
 * ON user (address_id);
 */
@Setter
@Getter
@Entity
@Table(name = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "second_name")
    private String lastName;

    private String email;

    private String phone;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "address_id")
    private Address address;

    private String login;
    @Column(name = "pass")
    private String password;

    @Column(name = "is_deleted")
    private boolean deleted;

}