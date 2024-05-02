package com.example.review.dto;

import com.example.review.domain.Article;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class ArticleResponse {
    private final String title;
    private final String content;
    public ArticleResponse(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
