package com.elasticsearch.springbootelasticsearch.service;

import com.elasticsearch.springbootelasticsearch.model.Person;
import com.elasticsearch.springbootelasticsearch.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

//Elasitc search queryden yada spring datadan query oluşturup,elasticde sorgulayabiliriz
@Service
@RequiredArgsConstructor
public class PersonService {

    //person repositoryiyi çağırdık
    private final PersonRepository personRepository;

    //querydeki kişi listesinin döndük
    public List<Person> getPersonFromQuery(String search) {

        return personRepository.findByFirstNameLikeOrLastNameLike(search,search);
    }

    //tüm kişi listesini döndük
    public Iterable<Person> getPersonAll() {
        return personRepository.findAll();
    }

    //kişi oluşturduk
    public void createPerson(Person person) {
        personRepository.save(person);
    }
}
