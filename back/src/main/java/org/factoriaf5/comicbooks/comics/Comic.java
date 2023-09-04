package org.factoriaf5.comicbooks.comics;

// import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
// import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="comics")
@Getter
@Setter
public class Comic {
    @Id
    private String isbn;
    private String title;
    private String author;
    private boolean hardcover;
    private String photo;
    private float price;
    private String synopsis;
    private int stock;






    // @JsonIgnore
    // @ManyToMany(mappedBy = "comics")
    // List<Genre> genres;

}
