package com.example.triviaapp.ui.items

import androidx.core.content.ContextCompat
import com.example.triviaapp.R
import com.example.triviaapp.utils.SelectionChangedPayload
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.item_option.view.*

class OptionItem(
    var title: String,
    var checked: Boolean? = false,
    val callback: Callback
) : Item() {

    override fun bind(viewHolder: GroupieViewHolder, position: Int, payloads: MutableList<Any>) {
        super.bind(viewHolder, position, payloads)
        if (payloads.firstOrNull() is SelectionChangedPayload) {
            viewHolder.itemView.apply {
                if (checked == true) {
                    rdOption.background =
                        ContextCompat.getDrawable(context, R.drawable.background_card_lightest)
                } else {
                    rdOption.setBackgroundResource(R.color.white)
                }
            }
        }
    }

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.itemView.apply {
            rdOption.text = title.orEmpty()
            if (checked == true) {
                rdOption.background =
                    ContextCompat.getDrawable(context, R.drawable.background_card_lightest)
            } else {
                rdOption.setBackgroundResource(R.color.white)
            }

            rdOption.setOnClickListener {
                callback.onPlayerSelected(this@OptionItem)
            }
        }
    }

    override fun getLayout(): Int = R.layout.item_option

    interface Callback {
        fun onPlayerSelected(optionItem: OptionItem)
    }
}