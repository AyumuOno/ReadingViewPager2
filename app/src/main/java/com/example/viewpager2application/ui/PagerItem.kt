package com.example.viewpager2application.ui

import com.example.viewpager2application.R
import com.xwray.groupie.databinding.BindableItem
import com.example.viewpager2application.databinding.PagerItemBinding

class PagerItem(val text: String) : BindableItem<PagerItemBinding>() {

    companion object {
        fun create(text: String) = PagerItem(text = text)
    }

    override fun getLayout(): Int = R.layout.pager_item

    override fun bind(viewBinding: PagerItemBinding, position: Int) {
        viewBinding.text = text
    }
}
