package com.example.newstab.repository

import com.example.newstab.api.RetrofitInstance
import com.example.newstab.db.ArticleDataBase
import com.example.newstab.models.Article

class NewsRepository(val db: ArticleDataBase){

    suspend fun getHeadlines(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getHeadLines(countryCode,pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery,pageNumber)

    suspend fun upsert(article: Article)=
        db.getArticleDao().upsert(article)

    fun getFavouriteNews() =
        db.getArticleDao().getAllArticles()

    suspend fun deleteArt(article: Article) =
        db.getArticleDao().deleteArticle(article)

}