package com.example.myflexiblefragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentDua.newInstance] factory method to
 * create an instance of this fragment.
 */

class FragmentDua : Fragment() {
    lateinit var tvName : TextView
    lateinit var tvDesc : TextView
    lateinit var btnDua : Button

    var desc: String? = null

    companion object{
        var EXTRA_NAME = "extra_name"
        var EXTRA_DESC = "extra_desc"
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dua, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnDua: Button = view.findViewById(R.id.btn_satu)
        val fragmentSatu = FragmentSatu()
        btnDua.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.frame_container, fragmentSatu, FragmentSatu::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }
        }
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        if(savedInstanceState != null){
            val description = savedInstanceState.getString(EXTRA_DESC)
            desc = description
        }


    }
}

