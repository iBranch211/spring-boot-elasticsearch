package com.elasticsearch.springbootelasticsearch.controller;

import com.elasticsearch.springbootelasticsearch.model.Person;
import com.elasticsearch.springbootelasticsearch.service.PersonService;
import com.elasticsearch.springbootelasticsearch.shared.GenericResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PersonController {

    //person servisi çağırdık
    private final PersonService personService;

    //search paramatresi alıp query yapıyor
    @GetMapping("/api/v1/people/{search}")
    public ResponseEntity<?> getPerson(@PathVariable String search){
        List<Person> people = personService.getPersonFromQuery(search);//kişi listesini aldık
        return ResponseEntity.ok(people);//kişi listesini döndük 200 status ile.
    }

    //tüm kişi listesini döndürür
    @GetMapping("/api/v1/people")
    public ResponseEntity<?> getPersonAll(){
        List<Person> people = personService.getPersonAll();//kişi listesini aldık
        return ResponseEntity.ok(people);//kişi listesini döndük 200 status ile.
    }

    //kisi oluşturur
    @PostMapping("/api/v1/people")
    public ResponseEntity<?> createPerson(@RequestBody Person person){
        personService.createPerson(person);//kişiyi oluşturduk
        GenericResponse response = new GenericResponse("person created");//oluşturulma mesajını döndük
        return ResponseEntity.status(HttpStatus.CREATED).body(response);//201 statüsü ile mesajı döndük
    }
}
