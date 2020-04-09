package com.elasticsearch.springbootelasticsearch.bootstrap;

import com.elasticsearch.springbootelasticsearch.model.Person;
import com.elasticsearch.springbootelasticsearch.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Calendar;

@Component
@RequiredArgsConstructor
public class PersonLoader implements CommandLineRunner {

    //person repositoryi çağırdık
    private final PersonRepository personRepository;

    //kayıtları initalize ettik
    @Override
    public void run(String... args) throws Exception {
        Person person1 = new Person("test1","ahmet","gülmez", Calendar.getInstance().getTime());
        Person person2 = new Person("test2","mehmet","ağlamaz", Calendar.getInstance().getTime());

        personRepository.save(person1);//kişiler elasticsearcheye kaydedildi
        personRepository.save(person2);

    }
}
