package org.factoriaf5.comicbooks.genres;

import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/genres")
public class GenresController {
    private GenresService service;

    @GetMapping
    public ResponseEntity<List<GenreModel>>  findAll(){
        List<GenreModel> serviceGetAll = service.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(serviceGetAll);
    }
    @PostMapping
    public ResponseEntity<GenreModel> create(@RequestBody GenreModel genre){
        GenreModel serviceSaved = service.create(genre);
        return ResponseEntity.status(HttpStatus.OK).body(serviceSaved);
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<GenreModel> findOne(@PathVariable("id") Long id){
        GenreModel findbyid = service.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(findbyid);
    }
}