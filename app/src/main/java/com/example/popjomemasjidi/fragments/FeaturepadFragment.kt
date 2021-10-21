package com.example.popjomemasjidi.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.popjomemasjidi.R
import com.example.popjomemasjidi.models.MoreFeaturesModel
import androidx.recyclerview.widget.GridLayoutManager
import com.example.popjomemasjidi.adapters.MoreFeaturesAdapter
import com.example.popjomemasjidi.adapters.UpdatedFeaturesAdapter
import com.example.popjomemasjidi.databinding.FragmentFeaturepadBinding
import com.example.popjomemasjidi.models.UpdatedFeaturesModel


class FeaturepadFragment : Fragment() {

    private var _binding:FragmentFeaturepadBinding? = null
    private val binding get() = _binding!!

    var features = arrayOf(
        MoreFeaturesModel(R.drawable.compass,"Qibla Kompass",1),
        MoreFeaturesModel(R.drawable.kitab,"Duolar",2),
        MoreFeaturesModel(R.drawable.kabah,"Kaaba Live",3),
        MoreFeaturesModel(R.drawable.bigm,"Masjidlar",4),
        MoreFeaturesModel(R.drawable.txttojpg,"Zikrlar",5),
        MoreFeaturesModel(R.drawable.tasbeeh,"Tasbeh",6)
        )

    var updatedFeatures = arrayOf(
        UpdatedFeaturesModel(R.drawable.share,"Ehson",1),
        UpdatedFeaturesModel(R.drawable.kabah,"Olti diniy kalima",2)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFeaturepadBinding.inflate(inflater,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rv4.layoutManager = GridLayoutManager(context,2)
        binding.rv4.adapter = MoreFeaturesAdapter(features)

        binding.rv5.layoutManager = GridLayoutManager(context,3)
        binding.rv5.adapter = UpdatedFeaturesAdapter(updatedFeatures)


    }

}