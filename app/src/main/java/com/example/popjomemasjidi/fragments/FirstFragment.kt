package com.example.popjomemasjidi.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.popjomemasjidi.models.FeaturesModel
import com.example.popjomemasjidi.R
import com.example.popjomemasjidi.activitys.AsmaulHusnaActivity
import com.example.popjomemasjidi.activitys.CompassActivity
import com.example.popjomemasjidi.activitys.PrayerTimeActivity
import com.example.popjomemasjidi.adapters.DailyTreasureAdapter
import com.example.popjomemasjidi.adapters.FeaturesAdapter
import com.example.popjomemasjidi.databinding.FragmentFirstBinding
import com.example.popjomemasjidi.models.TreasureModel
import java.util.*

class FirstFragment : Fragment() {


    //test
    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    var items = arrayOf(
        FeaturesModel(1,R.drawable.allah,"Asmaul Husna"),
        FeaturesModel(2,R.drawable.tasbeeh,"Tasbih"),
        FeaturesModel(3,R.drawable.praying,"Duolar"),
        FeaturesModel(4,R.drawable.sujud,"Namoz"),
    )

    var items2 = arrayOf(
        TreasureModel(R.drawable.hazrat1,"Calendar event","Calendar event"),
        TreasureModel(R.drawable.masjid1,"Calendar event","Calendar event"),
        TreasureModel(R.drawable.hazrat2,"Calendar event","Calendar event"),
        TreasureModel(R.drawable.masjid2,"Calendar event","Calendar event"),
        TreasureModel(R.drawable.masjid3,"Calendar event","Calendar event")
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(inflater,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rv.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        binding.rv.adapter = FeaturesAdapter(items)

        binding.rv2.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        binding.rv2.adapter = DailyTreasureAdapter(items2)

        binding.prayerTimeFfragment.setOnClickListener {
            val intent = Intent(context,PrayerTimeActivity::class.java)
            context?.startActivity(intent)
        }

        binding.timeDateContainer.setOnClickListener {
            val intent = Intent(context, CompassActivity::class.java)
            context?.startActivity(intent)
        }

        binding.readAsmaUlHusnaBtn.setOnClickListener {
            val intent = Intent(context, AsmaulHusnaActivity::class.java)
            context?.startActivity(intent)
        }

        val string = arrayOf("Alhamdulillah", "SubhanAlloh", "Allohu Akbar", "Astag'firullaxu va atubu ilayx","La Ilaxa Illallax","Subhanalloxi va bihamdixi","SubhanAlloxil aziym")

        val random: Random = Random()
        val index: Int =random.nextInt(string.size - 1) + 0
        binding.namesOfAllah.text = string[index]


        binding.shareAsmaUlHusnaBtn.setOnClickListener {
            val shareIntent1 = Intent(Intent.ACTION_SEND)
            shareIntent1.type = "text/plain"
            shareIntent1.putExtra(Intent.EXTRA_SUBJECT, "")
            val app_url: String = binding.namesOfAllah.text as String+ " \n\n " + "https://play.google.com/store/apps/details?id=com.example.administrator"
            shareIntent1.putExtra(Intent.EXTRA_TEXT, app_url)
            startActivity(Intent.createChooser(shareIntent1, "Поделиться через"))
        }

        binding.shareBtnMain.setOnClickListener {
            val shareIntent1 = Intent(Intent.ACTION_SEND)
            shareIntent1.type = "text/plain"
            shareIntent1.putExtra(Intent.EXTRA_SUBJECT, "")
            val app_url: String = "https://play.google.com/store/apps/details?id=com.example.administrator"
            shareIntent1.putExtra(Intent.EXTRA_TEXT, app_url)
            startActivity(Intent.createChooser(shareIntent1, "Поделиться через"))
        }

    }

    companion object {
        @JvmStatic
        fun newInstance() = FirstFragment()
    }

}