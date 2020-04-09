package com.elasticsearch.springbootelasticsearch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

//Document tipinde tanımılıyoruz.
//type alanını tablomuz olarak düşünebiliriz.person tanımladık
@Document(indexName = "people",type = "person")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    //Id tanımladık
    @Id
    private String id;

    //Her bir property field tanımladık
    @Field(name = "firstName",type = FieldType.Text)
    private String firstName;

    @Field(name = "lastName",type = FieldType.Text)
    private String lastName;

    @Field(name = "birthDate",type = FieldType.Date)
    private Date birthDate;
}
