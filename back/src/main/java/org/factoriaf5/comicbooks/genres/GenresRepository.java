package org.factoriaf5.comicbooks.genres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.factoriaf5.comicbooks.genres.GenreModel;
@Repository
public interface GenresRepository extends JpaRepository<GenreModel,Long>{
    
}
