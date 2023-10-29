package com.example.xmldesign

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
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
        val arg1 = arguments?.getString("arg1")
        val arg2 = arguments?.getString("arg2")
        val arg3 = arguments?.getString("arg3")
        val arg4 = arguments?.getString("arg4")


        binding.station.text = arg1.toString()
        binding.street.text = arg2.toString()
        binding.country.text = arg3.toString()

        if (arg1.equals("ChargePoint Station 2")) {
            binding.numberOfPorts.text = arg4.toString()
            binding.numberOfPorts.setTextColor(ContextCompat.getColor(requireContext(), R.color.gold))
        } else {
            binding.numberOfPorts.text = arg4.toString()
        }








        return binding.root
    }




    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = BottomSheetDialog(requireContext(), R.style.CustomBottomSheetDialog)

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
