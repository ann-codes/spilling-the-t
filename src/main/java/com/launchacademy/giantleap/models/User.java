package com.launchacademy.giantleap.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Table;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@Component
@Entity
@Table(name = "users")
@Data
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User {

  @Id
  @SequenceGenerator(name = "user_generator", sequenceName = "users_id_seq", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_generator")
  @Column(name = "id", nullable = false, unique = true)
  private Integer id;

  @NotBlank
  @Column(name = "username")
  private String username;

  @NotBlank
  @Column(name = "password")
  private String password;

  @NotBlank
  @Email
  @Column(name = "email")
  private String email;

  @NotBlank
  @Column(name = "first_name")
  private String firstName;

  @NotBlank
  @Column(name = "last_name")
  private String lastName;

  @NotBlank
  @Column(name = "location")
  private String location;

  @NotBlank
  @Column(name = "image_url")
  private String imageUrl;

  @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, orphanRemoval = false)
  @JsonIgnoreProperties("user")
//  @LazyCollection(LazyCollectionOption.FALSE) // new
  private List<Review> reviews = new ArrayList<>();
//  @JsonManagedReference
//  public List<Review> getReviews() {
//    return reviews;
//  }

}
