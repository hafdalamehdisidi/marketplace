package org.factoriaf5.comicbooks.genres;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class GenresService {
    GenresRepository  repository;

    @Autowired
    public GenresService(GenresRepository repository) {
        this.repository = repository;
    }
 
       public GenreModel create(GenreModel genre){
         GenreModel genreSaved = repository.save(genre);
        return genreSaved;
    }
    public List<GenreModel> getAll() {
        List<GenreModel> genre = repository.findAll();
        return genre;
    }
    public GenreModel findById(Long id) {
     GenreModel genre =  repository.findById(id).orElseThrow();
        return genre;
    }
  
 
}
