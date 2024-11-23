package com.adira.signmaster.ui.study

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.adira.signmaster.R
import com.adira.signmaster.databinding.FragmentStudyBinding

class StudyFragment : Fragment() {

    private var _binding: FragmentStudyBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStudyBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val learnMaterialItems = listOf(
            LearnMaterialItem("Study Material 1", R.drawable.introduction_icon),
            LearnMaterialItem("Study Material 2", R.drawable.introduction_icon),
            LearnMaterialItem("Study Material 3", R.drawable.introduction_icon),
            LearnMaterialItem("Study Material 4", R.drawable.introduction_icon),
            LearnMaterialItem("Study Material 5", R.drawable.introduction_icon),
            LearnMaterialItem("Study Material 6", R.drawable.introduction_icon),
            LearnMaterialItem("Study Material 7", R.drawable.introduction_icon),
            LearnMaterialItem("Study Material 8", R.drawable.introduction_icon),
            // Tambahkan lebih banyak item sesuai kebutuhan
        )

        val learnMaterialAdapter = LearnMaterialAdapter(learnMaterialItems) { learnMaterialItem ->

        }

        binding.rvLearnMaterial.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = learnMaterialAdapter
        }

        return root
    }

}