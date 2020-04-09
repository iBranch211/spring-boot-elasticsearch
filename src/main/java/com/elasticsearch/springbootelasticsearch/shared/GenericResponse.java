package com.elasticsearch.springbootelasticsearch.shared;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class GenericResponse {

    @NonNull
    private String message;
}
