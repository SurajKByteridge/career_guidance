package com.example.carrerguidance.Model;

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
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String imageUrl;
    private String exams;
    private String duration;
    private String description;
    @OneToMany(cascade = CascadeType.ALL)
    private List<OnlineCourses> onlineCourses = new ArrayList<>();
    @OneToMany
    private List<Career> careers = new ArrayList<>();
    @OneToMany
    private List<University> universities = new ArrayList<>();
}
