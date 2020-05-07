package com.launchacademy.giantleap.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "reviews")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Review {
    @Id
    @SequenceGenerator(name="review_generator", sequenceName="reviews_id_seq", allocationSize = 1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="review_generator")
    @Column(name="id", nullable=false, unique=true)
    private Integer id;

    @NotBlank
    @Column(name="title")
    private String title;

    @NotNull
    @Column(name="date", columnDefinition = "DATE")
    private Date date;

    @NotBlank
    @Column(name="review")
    private String review;

    @NotNull
    @Column(name="cleanliness")
    @Range(min=1, max=5)
    private Integer cleanliness;

    @NotNull
    @Column(name="on_time")
    @Range(min=1, max=5)
    private Integer onTime;

    @NotNull
    @Column(name="capacity")
    @Range(min=1, max=5)
    private Integer capacity;

    @NotNull
    @Column(name="overall_rating")
    @Range(min=1, max=5)
    private Integer overallRating;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="station_id", nullable = false)
    @JsonIgnoreProperties("review")
    private Station station;
    @JsonBackReference
    public Station getStation() {
        return station;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id", nullable = false)
    @JsonIgnoreProperties("review")
    private User user;
    @JsonBackReference
    public  User getUser() {
        return user;
    }
}