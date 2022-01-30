package com.smartandcareful.sc.controllers;

import com.smartandcareful.sc.repositories.ArticleRepository;
import com.smartandcareful.sc.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArticleController {

    private ArticleRepository articleRepository;

    public ArticleController(ArticleRepository articleRepository){
        this.articleRepository=articleRepository;
    }

    @RequestMapping("/articles")
    public String getArticles(Model model){
        model.addAttribute("articles", articleRepository.findAll());
        return "articles";
    }

    @RequestMapping("/article1")
    public String getArticle1(){
        return "article1";
    }

    @RequestMapping("/article2")
    public String getArticle2(){
        return "article2";
    }

}
