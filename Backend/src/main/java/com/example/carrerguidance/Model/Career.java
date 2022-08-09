package com.example.carrerguidance.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Career
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cid", nullable = false)
    private Long id;
    private String name;
    private String description;
    private String imageUrl;
    @ManyToOne
    @JsonBackReference
    private Interests interests;
    @OneToMany
    @JsonManagedReference
    @JsonProperty(  access = JsonProperty.Access.WRITE_ONLY)
    private List<OnlineCourses> onlineCourses = new ArrayList<>();
}
