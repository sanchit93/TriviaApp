package com.example.triviaapp.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.triviaapp.R
import com.example.triviaapp.base.DaggerBaseActivity
import com.example.triviaapp.room.User
import com.example.triviaapp.ui.items.SummaryItem
import com.example.triviaapp.utils.Status
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import kotlinx.android.synthetic.main.activity_history.*

class HistoryActivity : DaggerBaseActivity() {
    companion object {
        private const val DETAIL_TYPE = "DETAIL_TYPE"
        fun getStartIntent(
            context: Context,
            detailType: String
        ): Intent {
            val intent = Intent(context, HistoryActivity::class.java)
            intent.putExtra(DETAIL_TYPE, detailType)
            return intent
        }
    }

    private lateinit var adapter: GroupAdapter<GroupieViewHolder>
    private lateinit var detailType: String

    private val viewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[SummaryViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)
        initialise()
        setObservers()
    }


    private fun initialise() {
        detailType = intent.getStringExtra(DETAIL_TYPE).orEmpty()
        viewModel.getAllUser()

    }

    private fun setObservers() {
        viewModel.getAllUsersObserver().observe(this, { resource ->
            when (resource.status) {
                Status.SUCCESS -> {
                    resource.data?.let { setData(it) }
                }
            }
        })
    }

    private fun setData(list: List<User>) {
        adapter = GroupAdapter()
        rvHistory.adapter = adapter

        list.forEach { user ->
            val item = SummaryItem(user, detailType)
            adapter.add(item)
        }
    }

    override fun onBackPressed() {
        startActivity(Intent(this, MainActivity::class.java))
        finishAffinity()
    }
}