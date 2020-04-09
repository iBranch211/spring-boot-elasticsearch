package com.elasticsearch.springbootelasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

//@EnableElasticsearchRepositories anatasyonu ile elastic search repositorileri enabled ettik
@SpringBootApplication
@EnableElasticsearchRepositories
public class SpringBootElasticsearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootElasticsearchApplication.class, args);
    }

}
