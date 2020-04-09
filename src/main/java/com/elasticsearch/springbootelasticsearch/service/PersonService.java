package com.elasticsearch.springbootelasticsearch.service;

import com.elasticsearch.springbootelasticsearch.model.Person;
import com.elasticsearch.springbootelasticsearch.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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
    public List<Person> getPersonAll() {
        //default iterator döner.biz listeye çevirdik
        return StreamSupport.stream(personRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    //kişi oluşturduk
    public void createPerson(Person person) {
        personRepository.save(person);
    }
}
