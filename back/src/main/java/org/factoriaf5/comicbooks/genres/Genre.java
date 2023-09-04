package org.factoriaf5.comicbooks.genres;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
import org.factoriaf5.comicbooks.comics.Comic;


@Entity
@Table(name = "genres")
public class Genre {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id")
    private  Long id;
    @Column(name = "name")
    private String name;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="comics", joinColumns={@JoinColumn(name="isbn")}, inverseJoinColumns={@JoinColumn(name="id")})
    Set<Comic> comics;
}


