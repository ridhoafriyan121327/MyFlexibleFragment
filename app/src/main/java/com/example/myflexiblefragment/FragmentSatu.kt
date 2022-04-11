package com.example.myflexiblefragment

import android.os.Bundle
import android.security.KeyChain.EXTRA_NAME
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentSatu.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentSatu : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_satu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnDua:Button = view.findViewById(R.id.btn_dua)
        val fragmentDua = FragmentDua()
        btnDua.setOnClickListener {
            val bundle = Bundle()
            bundle.putString(FragmentDua.EXTRA_NAME,"Ini Data dari Fragment Satu")
            val desc = "Fragment ini akan menerima data dari Fragment Satu"

            fragmentDua.arguments=bundle
            fragmentDua.desc=desc
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.frame_container, fragmentDua, FragmentDua::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }
        }
            }
        }
