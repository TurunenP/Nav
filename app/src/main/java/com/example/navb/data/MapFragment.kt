package com.example.navb.data

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navb.R

class MapFragment : Fragment(R.layout.fragment_map) {override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
): View? {
    // Inflate the layout for this fragment

    return inflater.inflate(R.layout.fragment_map, container, false)
}
}
