package com.example.triviaapp.ui

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.testlocationapp.extensions.shortSnackbar
import com.example.triviaapp.R
import com.example.triviaapp.room.User
import com.example.triviaapp.base.BaseFragment
import com.example.triviaapp.ui.game.GameFragment1
import com.example.triviaapp.ui.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.fragment_user.*

class UserNameFragment : BaseFragment() {
    companion object {
        const val TAG = "UserFragment"
        fun newInstance(): UserNameFragment {
            return UserNameFragment()
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

            //Check if name is empty//
            if (name.isNullOrBlank()) {
                btContinue.shortSnackbar("Enter Name")
            } else {
                //save name to database and switch fragment//
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