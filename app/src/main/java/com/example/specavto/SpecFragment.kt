package com.example.specavto

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TableLayout
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity


class SpecFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {



            //        val tableLayout = findViewById(android.R.id.tableLayout) as TableLayout
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_spec, container, false)
      //  val text = "Звоним в Полицию"
        val btn = view.findViewById<View>(R.id.button_polce)
        btn.setOnClickListener {

            makePhoneCall("102")


        }

        Toast.makeText(context, "Spec", Toast.LENGTH_LONG).show()

        return view

        }

    private fun makePhoneCall(number: String) : Boolean {
        val text = "Звоним в ${number}"
        try {
          //  Toast.makeText(context, text, Toast.LENGTH_LONG).show()
            val intent = Intent(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel:$number"))
            startActivity(intent)
            return true
        } catch (e: Exception) {
            e.printStackTrace()
            return false
        }
    }

    }

