package com.adira.signmaster.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.adira.signmaster.R
import com.adira.signmaster.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Navigasi ketika cardStudy ditekan
        binding.cardStudy.setOnClickListener {
            findNavController().navigate(R.id.navigation_study)
        }


        // Data untuk card items
        val cardItems = listOf(
            CardItem("Card 1", R.drawable.placeholder_image),
            CardItem("Card 2", R.drawable.placeholder_image),
        )

        // Menghubungkan RecyclerView dengan adapter
        val cardAdapter = CardAdapter(cardItems)
        binding.rvNews.apply {
            adapter = cardAdapter
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}