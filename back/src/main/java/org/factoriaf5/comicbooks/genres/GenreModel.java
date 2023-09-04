package org.factoriaf5.comicbooks.genres;

import jakarta.persistence.*;


@Entity
@Table(name = "genres")
public class GenreModel {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_genre")
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
}


