package com.example.triviaapp.ui.items

import com.example.testlocationapp.extensions.gone
import com.example.testlocationapp.extensions.visible
import com.example.triviaapp.R
import com.example.triviaapp.room.User
import com.example.triviaapp.utils.AppConstants
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.item_summary.view.*

class SummaryItem(
    var user: User,
    var detailType: String
) : Item() {
    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.itemView.apply {
            if (detailType == AppConstants.DETAIL_TYPE_SUMMARY) {
                tvTime.gone()
                tvAnswerLabel.visible()
                tvName.text = "Hello ${user.name.orEmpty()}"
            } else {
                tvTime.visible()
                tvTime.text = user.time.orEmpty()
                tvAnswerLabel.gone()
                tvName.text = "Name ${user.name.orEmpty()}"
            }

            tvAns1.text = "Answer ${user.ans1.orEmpty()}"
            tvAns2.text = "Answers ${user.ans2.orEmpty()}"
        }
    }

    override fun getLayout(): Int = R.layout.item_summary
}