package com.example.xmldesign

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.xmldesign.databinding.FragmentChargeStationBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class ChargeStation : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentChargeStationBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //binding
        binding = FragmentChargeStationBinding.inflate(inflater, container, false)


        return binding.root
    }




    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // Create a new BottomSheetDialog with the specified theme.
        val dialog = BottomSheetDialog(requireContext(), R.style.AppBottomSheetDialogTheme)

        // Set an OnShowListener for the dialog to perform custom actions when shown.
        dialog.setOnShowListener { dialogInterface ->
            // Cast the dialog to a BottomSheetDialog to access its features.
            val bottomSheetDialog = dialogInterface as BottomSheetDialog

            // Find the root layout of the BottomSheetDialog.
            val parentLayout = bottomSheetDialog.findViewById<View>(com.google.android.material.R.id.design_bottom_sheet)

            // Make sure the layout is not null before proceeding.
            parentLayout?.let {
                // Get the BottomSheetBehavior associated with the layout.
                val behavior = BottomSheetBehavior.from(it)

                // Set the state of the BottomSheetBehavior to STATE_EXPANDED to fully show the dialog.
                behavior.state = BottomSheetBehavior.STATE_EXPANDED
            }
        }

        // Return the customized BottomSheetDialog.
        return dialog
    }


}
