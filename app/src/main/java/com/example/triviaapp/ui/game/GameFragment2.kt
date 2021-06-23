package com.example.triviaapp.ui.game

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.triviaapp.R
import com.example.triviaapp.base.BaseFragment
import com.example.triviaapp.room.User
import com.example.triviaapp.ui.viewmodel.MainViewModel
import com.example.triviaapp.ui.SummaryActivity
import com.example.triviaapp.ui.items.OptionItem
import com.example.triviaapp.utils.AppConstants
import com.example.triviaapp.utils.SelectionChangedPayload
import com.example.triviaapp.utils.Status
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import kotlinx.android.synthetic.main.fragment_game2.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class GameFragment2 : BaseFragment(), OptionItem.Callback {
    companion object {
        const val TAG = "GameFragment2"
        fun newInstance(): GameFragment2 {
            return GameFragment2()
        }
    }

    private val viewModel by lazy {
        ViewModelProvider(requireActivity(), viewModelFactory)[MainViewModel::class.java]
    }

    private lateinit var adapter: GroupAdapter<GroupieViewHolder>

    private val nameList = listOf("A) White", "B) Yellow", "C) Orange", "D) Green")

    override fun getLayoutResId(): Int = R.layout.fragment_game2

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialise()
        setListeners()
        setObservers()
    }

    private fun setListeners() {
        btNext.setOnClickListener {
            //retreive user details from viewmodel and add ans2 and time//
            val user = viewModel.getUser()
            user?.ans2 = getSelectedColors()

            val sdf = SimpleDateFormat("dd MMM yyyy hh:mm a")
            val currentTime: String = sdf.format(Date())
            user?.time = currentTime.orEmpty()

            if (user != null) {
                viewModel.updateUser(user)
            }
            openSummary()
        }

        tvSelectAll.setOnClickListener {
            selectAllColors()
        }
    }

    private fun openSummary() {
        startActivity(
            Intent(
                SummaryActivity.getStartIntent(
                    requireContext(),
                    AppConstants.DETAIL_TYPE_SUMMARY
                )
            )
        )
        requireActivity().finishAffinity()
    }


    private fun initialise() {
        setData()
    }


    private fun setObservers() {
        viewModel.getCurrentUserObserver().observe(viewLifecycleOwner, { resource ->
            when (resource.status) {
                Status.SUCCESS -> {
                    setData()
                }
                Status.ERROR -> {
                    handleError(resource.error)
                }
            }
        })
    }

    private fun setData() {
        adapter = GroupAdapter()
        rvGame2.adapter = adapter
        nameList.forEach { name ->
            val item = OptionItem(title = name, checked = false, callback = this)
            adapter.add(item)
        }

    }

    override fun onPlayerSelected(optionItem: OptionItem) {
        optionItem.checked = optionItem.checked != true
        optionItem.notifyChanged(SelectionChangedPayload)
    }

    //get String containing all the selected colors//
    private fun getSelectedColors(): String? {
        var selectedColorList = ArrayList<String>()
        for (i in 0 until adapter.groupCount) {
            val item = adapter.getItem(i)
            if (item is OptionItem && item.checked == true)
                selectedColorList.add(item.title.orEmpty())
        }
        return selectedColorList.let { TextUtils.join(",", it) }
    }

    private fun selectAllColors() {
        for (i in 0 until adapter.groupCount) {
            val item = adapter.getItem(i)
            if (item is OptionItem) {
                item.checked = true
                item.notifyChanged(SelectionChangedPayload)
            }
        }
    }
}