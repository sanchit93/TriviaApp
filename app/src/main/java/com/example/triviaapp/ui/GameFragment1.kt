package com.example.triviaapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.triviaapp.R
import com.example.triviaapp.base.BaseFragment
import com.example.triviaapp.room.User
import com.example.triviaapp.ui.items.OptionItem
import com.example.triviaapp.utils.SelectionChangedPayload
import com.example.triviaapp.utils.Status
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import kotlinx.android.synthetic.main.activity_main.*
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

    private fun setListeners() {
        btNext.setOnClickListener {
            if (selectedOptionItem == null) {
                Toast.makeText(requireContext(), "Select an option", Toast.LENGTH_LONG).show()
            } else {
                val user = viewModel.getUser()
                user?.ans1 = selectedOptionItem?.title.orEmpty()
                if (user != null) {
                    viewModel.updateUser(user)
//                    val user1 = viewModel.getLatestUser()
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


    private fun initialise() {
        if (!viewModel.isNewUser()) {
            viewModel.getLatestUser()
        } else {
            setData()
        }
    }


    private fun setObservers() {
        viewModel.getCurrentUserObserver().observe(viewLifecycleOwner, { resource ->
            when (resource.status) {
                Status.SUCCESS -> {
                    resource.data?.let { setData(it) }
                }
            }
        })
    }

    private fun setData(user: User? = null) {
        adapter = GroupAdapter()
        rvGame1.adapter = adapter
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