package com.example.triviaapp.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.triviaapp.R
import com.example.triviaapp.room.User
import com.example.triviaapp.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_user.*

class UserFragment : BaseFragment() {
    companion object {
        const val TAG = "UserFragment"
        fun newInstance(): UserFragment {
            return UserFragment()
        }
    }

    override fun getLayoutResId() = R.layout.fragment_user

    private val viewModel by lazy {
        ViewModelProvider(requireActivity(), viewModelFactory)[MainViewModel::class.java]
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setListeners()
    }

    private fun setListeners() {
        btContinue.setOnClickListener {
            val name = etName.text.toString()
            if (name.isNullOrBlank()) {
                Toast.makeText(context, "Enter Name", Toast.LENGTH_SHORT).show()
            } else {
                val user = User(name = name)
                viewModel.saveUser(user)

                switchToNextFragment()
            }
        }
    }

    private fun switchToNextFragment() {
        if (requireActivity().supportFragmentManager.findFragmentByTag(
                GameFragment1.TAG
            ) == null
        ) {
            val fragment = GameFragment1.newInstance()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.flContainer, fragment, GameFragment1.TAG)
                .addToBackStack(GameFragment1.TAG)
                .commit()
        }
    }
}