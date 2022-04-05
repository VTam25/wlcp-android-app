package com.example.wearablelearning

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText


/**
 * The [LoginWithAccountFragment] class is called by [LoginActivity].
 * This is one of two fragments called by [LoginActivity] and is associated with
 * [R.layout.fragment_login_with_account] (or tab 1) for logging into the WearableLearning
 * app with WearableLearning credentials (username, password).
 */
class LoginWithAccountFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login_with_account, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val intent = requireActivity().intent
        var gameInfo = intent.getSerializableExtra("gameInfo") as? GameInfo

        val editTextName = view?.findViewById<EditText>(R.id.loginUsernameEditText)

        if (gameInfo?.userName != null && editTextName != null) {
            editTextName.setText(gameInfo.userName)
        }
    }
}