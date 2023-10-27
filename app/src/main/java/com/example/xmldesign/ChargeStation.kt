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
        val dialog = BottomSheetDialog(requireContext(), R.style.AppBottomSheetDialogTheme)

        dialog.setOnShowListener { dialogInterface ->
            val bottomSheetDialog = dialogInterface as BottomSheetDialog

            val parentLayout = bottomSheetDialog.findViewById<View>(com.google.android.material.R.id.design_bottom_sheet)

            parentLayout?.let {
                val behavior = BottomSheetBehavior.from(it)

                behavior.state = BottomSheetBehavior.STATE_EXPANDED
            }
        }

        return dialog
    }


}
