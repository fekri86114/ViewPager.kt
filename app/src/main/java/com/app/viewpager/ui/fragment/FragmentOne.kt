package com.app.viewpager.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.app.viewpager.databinding.OneFragmentBinding

class FragmentOne: Fragment() {
    lateinit var binding: OneFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = OneFragmentBinding.inflate(layoutInflater, container, false)

        return binding.root
    }
}