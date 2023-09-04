package org.factoriaf5.comicbooks.comics;

import java.util.List;
import java.util.Optional;

public class ComicService {
    ComicRepository comicRepository;
    public ComicService(ComicRepository repository){
        this.comicRepository = repository;
    }
    public List<Comic> getAll(){
        List<Comic> comics = comicRepository.findAll();
        return comics;
    }
    public Optional<Comic> getComicByIsbn(String isbn){
        return comicRepository.findByIsbn(isbn);
    }
}
