package com.ld.demo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ld.demo.databinding.FragmentFirstBinding
import com.ld.glide_image_loader.GlideImageLoader
import com.ld.picasso_image_loader.PicassoImageLoader

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        val imageLoader = PicassoImageLoader()
//        val imageLoader = GlideImageLoader()
        imageLoader.load(binding.imageViewFirst, "https://www.google.com/images/branding/googlelogo/2x/googlelogo_light_color_272x92dp.png")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}