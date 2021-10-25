package com.example.mvvmbasicstut.utilities

import com.example.mvvmbasicstut.data.FakeDatabase
import com.example.mvvmbasicstut.data.QuoteRepository
import com.example.mvvmbasicstut.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}