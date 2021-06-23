package com.example.triviaapp.ui.game

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.testlocationapp.extensions.shortSnackbar
import com.example.triviaapp.R
import com.example.triviaapp.base.BaseFragment
import com.example.triviaapp.room.User
import com.example.triviaapp.ui.viewmodel.MainViewModel
import com.example.triviaapp.ui.items.OptionItem
import com.example.triviaapp.utils.SelectionChangedPayload
import com.example.triviaapp.utils.Status
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import kotlinx.android.synthetic.main.fragment_game1.*

class GameFragment1 : BaseFragment(), OptionItem.Callback {
    companion object {
        const val TAG = "GameFragment1"
        fun newInstance(): GameFragment1 {
            return GameFragment1()
        }
    }

    private val viewModel by lazy {
        ViewModelProvider(requireActivity(), viewModelFactory)[MainViewModel::class.java]
    }

    private lateinit var adapter: GroupAdapter<GroupieViewHolder>
    private var selectedOptionItem: OptionItem? = null

    private val nameList =
        listOf("A) Sachin Tendulkar", "B) Virat Kolli", "C) Adam Gilchirst", "D) Jacques Kallis")

    override fun getLayoutResId(): Int = R.layout.fragment_game1


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialise()
        setListeners()
        setObservers()
    }

    private fun initialise() {
        if (!viewModel.isNewUser()) {
            viewModel.getLatestUser()
        } else {
            setData()
        }
    }

    private fun setListeners() {
        btNext.setOnClickListener {
            if (selectedOptionItem == null) {
                btNext.shortSnackbar("Select an option")
            } else {
                //retreive saved user from viewmodel and add ans1//
                val user = viewModel.getUser()
                user?.ans1 = selectedOptionItem?.title.orEmpty()

                //Update user info and move to next question//
                if (user != null) {
                    viewModel.updateUser(user)
                }
                switchToNextFragment()
            }
        }
    }

    private fun switchToNextFragment() {
        if (requireActivity().supportFragmentManager.findFragmentByTag(
                GameFragment2.TAG
            ) == null
        ) {
            val fragment = GameFragment2.newInstance()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.flContainer, fragment, GameFragment2.TAG)
                .addToBackStack(GameFragment2.TAG)
                .commit()
        }
    }

    private fun setObservers() {
        viewModel.getCurrentUserObserver().observe(viewLifecycleOwner, { resource ->
            when (resource.status) {
                Status.SUCCESS -> {
                    resource.data?.let { setData(it) }
                }
                Status.ERROR -> {
                    handleError(resource.error)
                }
            }
        })
    }

    private fun setData(user: User? = null) {
        adapter = GroupAdapter()
        rvGame1.adapter = adapter

        //Check if ans is already selected//
        nameList.forEach { name ->
            val checked = user != null && user.ans1 == name

            val item = OptionItem(title = name, checked = checked, callback = this)
            if (checked) {
                selectedOptionItem = item
            }
            adapter.add(item)
        }

    }

    override fun onPlayerSelected(optionItem: OptionItem) {
        if (selectedOptionItem == null) {
            optionItem.checked = true
            optionItem.notifyChanged(SelectionChangedPayload)
            selectedOptionItem = optionItem
        } else {
            if (selectedOptionItem != optionItem) {
                selectedOptionItem?.checked = false
                selectedOptionItem?.notifyChanged(SelectionChangedPayload)
                optionItem.checked = true
                optionItem.notifyChanged(SelectionChangedPayload)
                selectedOptionItem = optionItem

            }
        }
    }
}