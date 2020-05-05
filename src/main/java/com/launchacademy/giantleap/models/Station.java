package com.launchacademy.giantleap.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "stations")
@Getter
@Setter
@NoArgsConstructor
public class Station {

  @Id
  @SequenceGenerator(name = "stations_generator", sequenceName = "stations_id_seq", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stations_generator")
  @Column(name = "id", nullable = false, unique = true)
  private Integer id;

  @NotBlank(message = "Must include Train System")
  @Column(name = "network")
  private String network;

  @NotBlank(message = "Must include name of Station")
  @Column(name = "name")
  private String name;

  @NotBlank(message = "Must include line name")
  @Column(name = "line_name")
  private String lineName;

  @NotBlank(message = "Must include address")
  @Column(name = "address")
  private String address;

  @NotBlank(message = "Must include city")
  @Column(name = "city")
  private String city;

  @NotBlank(message = "Must include state/province/canton/region")
  @Column(name = "state")
  private String state;

  @NotBlank(message = "Must include zip code")
  @Column(name = "zip")
  private String zip;

  @NotBlank(message = "Must include country")
  @Column(name = "country")
  private String country;

  @NotBlank(message = "Must include image url")
  @Column(name = "image_url")
  private String imageUrl;

  @NotBlank(message = "Must include description")
  @Column(name = "description")
  private String description;

  @NotBlank(message = "Must include if you pay per fare or distance")
  @Column(name = "calculated_cost")
  private String calculatedCost;

  @NotNull(message = "If its not admn approved you are not seeing this")
  @Column(name = "admin_approved")
  private Boolean adminApproved;

}