package com.example.xmldesign

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.xmldesign.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private val bottomSheetFragment = ChargeStation()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMainBinding.inflate(inflater, container, false)


        binding.chargeStation1.setOnClickListener {
            showBottomScreen("ChargePoint Station 1", "street pulo 25", "amesterdam, netherlands", "8 ports available")
        }

        binding.chargeStation2.setOnClickListener {
            showBottomScreen("ChargePoint Station 2","street srna 74", "amesterdam, netherlands", "2 ports available")
        }

        binding.chargeStation3.setOnClickListener {
            showBottomScreen("ChargePoint Station 3","street adas 123 123", "amesterdam, netherlands", "5 ports available")
        }



        return binding.root
    }

    private fun showBottomScreen(arg1: String, arg2: String,arg3: String, arg4: String) {

        val bottomSheetFragment = ChargeStation()

        val args = Bundle()
        args.putString("arg1", arg1)
        args.putString("arg2", arg2)
        args.putString("arg3", arg3)
        args.putString("arg4", arg4)

        bottomSheetFragment.arguments = args
        bottomSheetFragment.show(childFragmentManager, bottomSheetFragment.tag)
    }


}



