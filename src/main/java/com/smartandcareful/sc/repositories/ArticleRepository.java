package com.smartandcareful.sc.repositories;

import com.smartandcareful.sc.model.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {
}
