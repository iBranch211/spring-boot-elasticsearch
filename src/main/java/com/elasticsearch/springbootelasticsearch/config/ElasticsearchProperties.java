package com.elasticsearch.springbootelasticsearch.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

//cluster adını,hostname ve portu alıyoruz
//@ConfigurationProperties(prefix = "elasticsearch") application.propertiesden elasticsearch ile başlayan değerleri aldık
@Configuration
@ConfigurationProperties(prefix = "elasticsearch")
@Data
public class ElasticsearchProperties {

    private String clusterName;
    private String host;
    private Integer port;

}