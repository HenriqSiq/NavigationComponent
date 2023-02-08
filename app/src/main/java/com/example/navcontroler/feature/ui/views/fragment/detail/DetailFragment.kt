package com.example.navcontroler.feature.ui.views.fragment.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.navcontroler.databinding.FragmentDetailBinding
import com.example.navcontroler.feature.ui.base.BaseFragment

class DetailFragment : BaseFragment<FragmentDetailBinding, DetailViewModel>() {
    override val viewModel: DetailViewModel by lazy { ViewModelProvider(this)[DetailViewModel::class.java] }

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentDetailBinding = FragmentDetailBinding.inflate(inflater, container, false)

}