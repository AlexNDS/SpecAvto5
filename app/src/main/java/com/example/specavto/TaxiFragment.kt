package com.example.specavto

import android.os.Bundle

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView




class TaxiFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Toast.makeText(context, "Taxi", Toast.LENGTH_SHORT).show()
        val taxiList: List<ListTaxi> = listOf(

            ListTaxi(  R.drawable.taxi4,  "Такси Pit Stop", "30-30-00"),
            ListTaxi(  R.drawable.taxi4, "Яндекс такси", "21-11-11"),
            ListTaxi( R.drawable.taxi4, "Максим", "222-222"),
            ListTaxi( R.drawable.taxi4,  "Восьмерочка", "46-88-88"),
            ListTaxi( R.drawable.taxi4, "Лидер", " 33-34-44"),
            ListTaxi( R.drawable.taxi4, "Статус", "440-440"),
            ListTaxi( R.drawable.taxi4, "Грузовое такси", "27-25-22"),
        )



      val view = inflater.inflate(R.layout.fragment_taxi, container, false)
        // Inflate the layout for this fragment


  //val usersRecyclerView: RecyclerView = view.findViewById(R.id.taxi_recycler_view)
       val taxiRecyclerView:RecyclerView = view.findViewById(R.id.taxi_recycler_view)



        taxiRecyclerView.layoutManager =
                       LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
                          taxiRecyclerView.addItemDecoration(
                               DividerItemDecoration(
                                    context,
                                   DividerItemDecoration.VERTICAL
                               )
                          )

                             taxiRecyclerView .adapter = TaxiAdapter(taxiList)
      



        return view
    }



}
