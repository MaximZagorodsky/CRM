package com.transport.model;

import lombok.Data;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by 1 on 6/9/2016.
 */
@Entity
@Table(name = "client_entity")
@Data
public class Client {
    @Id
    @GeneratedValue
    private Integer id;
    private boolean enabled;
    @Column(name="first_name")
    private String firstName;

    @Email
    @Column(name="mail", unique = true)
    private String mail;
    private String phone;
    @OneToMany(targetEntity = com.transport.model.Address.class)
    @JoinColumn(name="client_address", referencedColumnName="id")
    private Set<Address> address;
    private String mailMessage;
    private Double rate;
    private Double workTime;


}
