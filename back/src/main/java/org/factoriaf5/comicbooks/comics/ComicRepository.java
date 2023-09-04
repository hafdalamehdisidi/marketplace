package org.factoriaf5.comicbooks.comics;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ComicRepository extends JpaRepository<Comic,String>{
    Optional<Comic> findByComicIsbn(String isbn);
}
