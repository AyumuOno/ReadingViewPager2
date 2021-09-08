package com.example.viewpager2application.ui.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import com.example.viewpager2application.databinding.FragmentBaseBinding
import com.example.viewpager2application.ui.PagerItem


class BaseFragment : Fragment() {

    companion object {
        fun newInstance() = BaseFragment()
    }

    private lateinit var binding: FragmentBaseBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBaseBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val groupAdapter = GroupAdapter<ViewHolder>()
        binding.pager2.adapter = groupAdapter

        val itemTextList = listOf(
            "あああ",
            "いいい",
            "ううう",
            "えええ",
            "おおお",
            "かかか"
        )

        itemTextList.map {
            groupAdapter.add(PagerItem.create(it))
        }
    }
}
