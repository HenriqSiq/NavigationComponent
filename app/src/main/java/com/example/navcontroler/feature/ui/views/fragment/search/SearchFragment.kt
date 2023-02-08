package com.example.navcontroler.feature.ui.views.fragment.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.navcontroler.databinding.FragmentSearchBinding
import com.example.navcontroler.feature.ui.base.BaseFragment

class SearchFragment : BaseFragment<FragmentSearchBinding, SearchViewModel>() {
    override val viewModel: SearchViewModel by lazy { ViewModelProvider(this)[SearchViewModel::class.java] }

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSearchBinding = FragmentSearchBinding.inflate(inflater, container, false)

}