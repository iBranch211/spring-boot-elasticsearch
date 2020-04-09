package com.elasticsearch.springbootelasticsearch.repository;

import com.elasticsearch.springbootelasticsearch.model.Person;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

//ElasticsearchRepository repositoryden extend alarak repository snıfımızı oluşturduk
public interface PersonRepository extends ElasticsearchRepository<Person,String> {

    @Query("{\"bool\": {\"must\": [{\"match\": {\"firstName\": \"?0\"}}]}}")
    List<Person> getPersonFromQuery(String search);

    List<Person> findByFirstNameLikeOrLastNameLike(String firstName,String lastName);
}
