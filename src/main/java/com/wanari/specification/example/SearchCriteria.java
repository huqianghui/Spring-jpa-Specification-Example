package com.wanari.specification.example;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NonNull
@NoArgsConstructor
public class SearchCriteria {

    public SearchCriteria(String key, String operation, Object value) {
        this.key = key;
        this.operation = operation;
        this.value = value;
    }

    private String key;
    private String operation;
    private Object value;
    private Boolean orPredicate = false;
}
