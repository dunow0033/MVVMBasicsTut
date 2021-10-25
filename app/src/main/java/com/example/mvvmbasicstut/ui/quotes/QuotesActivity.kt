package com.example.mvvmbasicstut.ui.quotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmbasicstut.R
import androidx.fragment.app.activityViewModels
import com.example.mvvmbasicstut.data.QuoteRepository
import com.example.mvvmbasicstut.utilities.InjectorUtils
import com.google.android.ads.mediationtestsuite.viewmodels.ViewModelFactory

class QuotesActivity : AppCompatActivity() {

    private val viewmodel: QuotesViewModel by activityViewModels {
        QuotesViewModel.Factory(QuoteRepository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quotes)
        initializeUi()
    }

    private fun initializeUi() {
        val factory = InjectorUtils.provideQuotesViewModelFactory()
    }
}