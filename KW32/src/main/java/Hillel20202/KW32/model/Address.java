package Hillel20202.KW32.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * -- auto-generated definition
 * CREATE TABLE address
 * (
 *   id      INT(10) UNSIGNED AUTO_INCREMENT
 *     PRIMARY KEY,
 *   pcode   VARCHAR(255) NULL,
 *   country VARCHAR(255) NULL,
 *   city    VARCHAR(255) NULL,
 *   street  VARCHAR(255) NULL,
 *   house   VARCHAR(255) NULL,
 *   flat    VARCHAR(255) NULL
 * );
 */
@Setter
@Getter
@Entity
@Table(name = "address")
public class Address implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "pcode")
    private String postalCode;
    private String country;
    private String city;
    private String street;
    private String house;
    private String flat;
}
