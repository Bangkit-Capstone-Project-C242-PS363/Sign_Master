package com.adira.signmaster.ui.profile

import com.adira.signmaster.R

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment

class EditProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_edit_profile, container, false)

        // Initialize views
        val backButton = view.findViewById<ImageView>(R.id.back_button)
        val saveButton = view.findViewById<Button>(R.id.save_button)
        val genderSpinner = view.findViewById<Spinner>(R.id.gender_spinner)

        // Set up gender spinner
        val genderOptions = arrayOf("Male", "Female", "Other")
        val adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_spinner_dropdown_item,
            genderOptions
        )
        genderSpinner.adapter = adapter

        // Back button click listener
        backButton.setOnClickListener {
            // Handle back navigation
            requireActivity().onBackPressed()
        }

        // Save button click listener
        saveButton.setOnClickListener {
            Toast.makeText(requireContext(), "Profile saved!", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}
