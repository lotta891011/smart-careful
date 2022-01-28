package com.smartandcareful.sc.commands;

import com.smartandcareful.sc.model.Author;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class ArticleCommand {
    private Long id;
    private String title;
    private String content;
    private Set<Author> authors;
}
