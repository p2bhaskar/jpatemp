package com.pb.auth_service.auth_model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "login_user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    private String name;
    private String email;


   // @JsonIgnore
    @OneToMany(mappedBy = "loginUser",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Set<Hobby> hobbies = new HashSet<>();

}
