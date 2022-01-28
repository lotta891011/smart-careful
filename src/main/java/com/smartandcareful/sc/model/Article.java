package com.smartandcareful.sc.model;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Article {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    @Lob
    @Column
    private String content;

    @ManyToMany(mappedBy = "articles")
    private Set<Author> authors = new HashSet<>();

    public Article() {
    }

    public Article(String title, String content) {
        this.title = title;
        this.content = content;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", authors=" + authors +
                '}';
    }
}

