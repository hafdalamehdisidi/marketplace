package org.factoriaf5.comicbooks.comics;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComicController {
    private ComicService comicService;
    public ComicController(ComicService service){
        this.comicService = service;
    }
    @GetMapping(path = "/comics")
    public List<Comic> index(){
        List<Comic> comics = comicService.getAll();
        return comics;
    }
    @GetMapping(path = "/comics/{isbn}")
    public ResponseEntity<Comic> getComicByIsbn(@PathVariable String isbn){
        Optional<Comic> optionalComic = comicService.getComicByIsbn(isbn);
        if(optionalComic.isPresent()){
            Comic comic = optionalComic.get();
            return ResponseEntity.ok(comic);
        }else{
            return ResponseEntity.notFound().build();
        }        
    }
}
