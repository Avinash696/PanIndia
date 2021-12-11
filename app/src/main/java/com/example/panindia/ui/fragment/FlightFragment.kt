package com.example.panindia.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.panindia.R
import com.example.panindia.databinding.FragmentFlightBinding
import com.getbase.floatingactionbutton.FloatingActionButton




// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class FlightFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var TAG = "rawat"
    lateinit var flightFragment: FragmentFlightBinding
     lateinit var fbOneWay :FloatingActionButton
     lateinit var fbRoundTrip :FloatingActionButton
//     lateinit var fbMultiShop :FloatingActionButton
//     lateinit var fbMultiShop :FloatingActionButton
//     lateinit var fbMultiShop :FloatingActionButton
     lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        flightFragment.btCheck.setOnClickListener(View.OnClickListener {
            Toast.makeText(context, "flight test", Toast.LENGTH_SHORT).show()
        })
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_flight, container, false)
        fbOneWay = view.findViewById(R.id.fbOneWay)

        return view
        
//        fbOneWay.setOnClickListener(.OnClickListener {
////            Toast.makeText(, "fbOne", Toast.LENGTH_SHORT).show()
////            Toast.makeText(view.context ,"Fb Clicked", Toast.LENGTH_SHORT).show()
//            Log.d(TAG, "onCreateView: fab Button Check")
//        })
//        view.findViewById<Button>(R.id.btCheck).setOnClickListener(View.OnClickListener {
//            Log.d(TAG, "onCreateView: ")
//        })
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        button = view.findViewById(R.id.btCheck)
        button.setOnClickListener{view->
            Toast.makeText(context, "Check Button", Toast.LENGTH_SHORT).show()
            Log.d(TAG, "onCreateView: Button Check")
        }
    }
    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FlightFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}