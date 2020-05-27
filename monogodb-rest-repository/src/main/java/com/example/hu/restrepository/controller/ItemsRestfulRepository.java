package com.example.hu.restrepository.controller;

import com.example.hu.restrepository.domain.Item;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "items")
public interface ItemsRestfulRepository extends PagingAndSortingRepository<Item, Long> {

}
