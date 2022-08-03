package develop.abdusamid.colorpicker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import develop.abdusamid.colorpicker.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        val firstFragment = FirstFragment()
        binding.tv0.setOnClickListener {
            exportColor("#000001")
        }
        binding.tv1.setOnClickListener {
            exportColor("#00BCD4")
        }
        binding.tv2.setOnClickListener {
            exportColor("#FFBB86FC")
        }

        binding.tv3.setOnClickListener {
            exportColor("#FF3700B3")
        }

        binding.tv4.setOnClickListener {
            exportColor("#FF6200EE")
        }

        binding.tv5.setOnClickListener {
            exportColor("#FF03DAC5")
        }

        binding.tv6.setOnClickListener {
            exportColor("#FF018786")
        }

        binding.tv7.setOnClickListener {
            exportColor("#FFFFFFFF")
        }

        binding.tv8.setOnClickListener {
            exportColor("#F44336")
        }

        binding.tv9.setOnClickListener {
            exportColor("#E91E63")
        }

        binding.tv10.setOnClickListener {
            exportColor("#9C27B0")
        }

        binding.tv11.setOnClickListener {
            exportColor("#2196F3")
        }

        binding.tv12.setOnClickListener {
            exportColor("#00BCD4")
        }

        binding.tv13.setOnClickListener {
            exportColor("#009688")
        }

        binding.tv14.setOnClickListener {
            exportColor("#AD98B1")
        }

        binding.tv15.setOnClickListener {
            exportColor("#666683")
        }

        binding.tv16.setOnClickListener {
            exportColor("#4CAF50")
        }

        binding.tv17.setOnClickListener {
            exportColor("#8BC34A")
        }

        binding.tv18.setOnClickListener {
            exportColor("#FFEB3B")
        }
        binding.tv19.setOnClickListener {
            exportColor("#FF5722")
        }
        binding.btnCardSetColor.setOnClickListener {
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().replace(R.id.container, firstFragment).commit()
        }
        return binding.root
    }

    private fun exportColor(string: String) {
        MyObject.string = string
    }
}