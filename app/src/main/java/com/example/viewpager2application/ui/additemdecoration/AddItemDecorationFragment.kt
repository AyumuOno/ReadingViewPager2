package com.example.viewpager2application.ui.additemdecoration

import com.example.viewpager2application.ui.PagerItem
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpager2application.R
import com.example.viewpager2application.databinding.FragmentAddItemDecorationBinding
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder

class AddItemDecorationFragment : Fragment() {

    private lateinit var binding: FragmentAddItemDecorationBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAddItemDecorationBinding.inflate(inflater, container, false)
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

        val itemDecoration = HorizontalMarginItemDecoration(
            requireContext(),
            R.dimen.viewpager_current_item_horizontal_margin
        )
        binding.pager2.addItemDecoration(itemDecoration)
    }
}
