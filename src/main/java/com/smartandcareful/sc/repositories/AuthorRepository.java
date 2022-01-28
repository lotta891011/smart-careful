package com.smartandcareful.sc.repositories;

import com.smartandcareful.sc.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
