package com.example.hu.restrepository.controller;

import com.example.hu.restrepository.domain.UserProfile;
import org.bson.types.ObjectId;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource(path = "userProfile")
public interface UserProfileRestfulRepository extends CrudRepository<UserProfile, ObjectId>{

    List<UserProfile> findByFirstNameLike(String firstName);

}
