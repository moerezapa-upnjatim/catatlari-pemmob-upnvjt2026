package com.upn.catatlari

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.upn.catatlari.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var  binding: FragmentHomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        val user = (activity as MainActivity).user
        binding.welcomingTxt.text = "Halo, ${user?.email}"

        binding.floatingBtnAddRun.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToAddRunFragment())
        }

        val runList = listOf(
            Run(runDate = "22 Mei 2026", runDistance = 1, runDuration = 3),
            Run(runDate = "23 Mei 2026", runDistance = 1, runDuration = 3),
            Run(runDate = "24 Mei 2026", runDistance = 1, runDuration = 3)
        )

        val runAdapter = RunAdapter()

        binding.rvRunList.layoutManager = LinearLayoutManager(requireContext())
        runAdapter.setData(runList)
        binding.rvRunList.adapter = runAdapter

        return binding.root
    }

}