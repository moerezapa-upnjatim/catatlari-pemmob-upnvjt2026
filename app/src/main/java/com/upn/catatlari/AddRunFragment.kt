package com.upn.catatlari

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.upn.catatlari.databinding.FragmentAddRunBinding

class AddRunFragment : Fragment() {

    private lateinit var binding: FragmentAddRunBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        binding = FragmentAddRunBinding.inflate(inflater, container, false)

        return binding.root
    }

}