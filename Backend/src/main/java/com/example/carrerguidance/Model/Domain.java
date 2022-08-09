package com.example.carrerguidance.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@ToString
@Entity
public class Domain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String duration;
    private String exams;
    private String imageUrl;
    private String description;
    @ManyToOne
    @JsonBackReference
    private Interests interests;
    @OneToMany(cascade = CascadeType.ALL)
    @JsonManagedReference
    @JsonProperty(  access = JsonProperty.Access.WRITE_ONLY)
    private List<OnlineCourses> onlineCourses = new ArrayList<>();
//    @OneToMany(cascade = CascadeType.ALL)
////    @JsonManagedReference
//    @JsonProperty(  access = JsonProperty.Access.WRITE_ONLY)
//    private List<University> uni = new ArrayList<>();

}
