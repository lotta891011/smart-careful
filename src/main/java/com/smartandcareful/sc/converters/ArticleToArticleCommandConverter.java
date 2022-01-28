package com.smartandcareful.sc.converters;

import com.smartandcareful.sc.commands.ArticleCommand;
import com.smartandcareful.sc.model.Article;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class ArticleToArticleCommandConverter implements Converter<Article, ArticleCommand> {
    @Nullable
    @Synchronized
    @Override
    public ArticleCommand convert(Article source){
        if (source == null){
            return null;
        }
        final ArticleCommand articleCommand= new ArticleCommand();
        articleCommand.setContent(source.getContent());
        articleCommand.setAuthors(source.getAuthors());
        articleCommand.setTitle(source.getTitle());
        return articleCommand;

    }
}
