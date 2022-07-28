package com.app.viewpager.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.app.viewpager.databinding.ThreeFragmentBinding

class FragmentThree: Fragment() {
    lateinit var binding: ThreeFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = ThreeFragmentBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

}