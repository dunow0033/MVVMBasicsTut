package com.example.mvvmbasicstut.ui.quotes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmbasicstut.data.Quote
import com.example.mvvmbasicstut.data.QuoteRepository
import java.lang.IllegalArgumentException

class QuotesViewModel(
    private val quoteRepository: QuoteRepository
) : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)

    class Factory (
        private val quoteRepository: QuoteRepository
        ) : ViewModelProvider.Factory {
            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                if (modelClass.isAssignableFrom(QuotesViewModel::class.java)) {
                    return QuotesViewModel(quoteRepository) as T
                } else {
                    throw IllegalArgumentException("Cannot create instance")
                }
        }
    }
}