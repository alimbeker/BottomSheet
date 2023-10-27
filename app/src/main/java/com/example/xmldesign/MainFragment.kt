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

        bottomSheetFragment.show(childFragmentManager, bottomSheetFragment.tag)

//        findNavController().navigate(R.id.action_mainFragment2_to_chargeStation)
//
//        val action = MainFragmentDirections.actionChargeStationFragment(arg1, arg2, arg3, arg4)
//        findNavController().navigate(action)

    }


}



