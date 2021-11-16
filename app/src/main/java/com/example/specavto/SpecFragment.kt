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
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


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


        Toast.makeText(context, "Spec", Toast.LENGTH_SHORT).show()
        val specList: List<ListSpec> = listOf(

            ListSpec(  R.drawable.spec_icon,  "Пожарная охрана", "101"),
            ListSpec(  R.drawable.police, "Полиция", "102"),
            ListSpec( R.drawable.sanitizer, " Скорая помощь", "103"),
            ListSpec( R.drawable.alert,  "Газовая служба", "104"),
            ListSpec( R.drawable.avaria, "Служба спасения", "112"),
        )




        //val usersRecyclerView: RecyclerView = view.findViewById(R.id.taxi_recycler_view)
        val specRecyclerView: RecyclerView = view.findViewById(R.id.spec_recycler_view)



        specRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        specRecyclerView.addItemDecoration(
            DividerItemDecoration(
                context,
                DividerItemDecoration.VERTICAL
            )
        )

        specRecyclerView .adapter = SpecAdapter(specList)







        return view

        }


        }





