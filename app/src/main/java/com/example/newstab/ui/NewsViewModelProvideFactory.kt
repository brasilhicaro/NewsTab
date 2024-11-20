package com.example.newstab.ui

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.newstab.repository.NewsRepository

class NewsViewModelProvideFactory(val app: Application,
                                  val newsRepository: NewsRepository): ViewModelProvider.Factory{
    override fun <T: ViewModel> create(modelClass: Class<T>): T{
        return NewsViewModel(app, newsRepository) as T
    }


}