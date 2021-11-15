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

        val taxiList: List<ListTaxi> = listOf(

            ListTaxi("Такси Pit Stop", "30-30-00"),
            ListTaxi("Яндекс такси", "21-11-11"),
            ListTaxi("Максим", "222-222"),
            ListTaxi("Восьмерочка", "46-88-88"),
            ListTaxi("Лидер", " 33-34-44"),
            ListTaxi("Статус", "440-440"),
            ListTaxi("Грузовое такси", "27-25-22"),
        )



        val view = inflater.inflate(R.layout.fragment_spec, container, false)
        // Inflate the layout for this fragment



       val taxiRecyclerView:RecyclerView = view.findViewById<View>(R.id.taxi_recycler_view) as RecyclerView

        taxiRecyclerView.layoutManager =
                        LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
                            taxiRecyclerView.addItemDecoration(
                                DividerItemDecoration(
                                    context,
                                    DividerItemDecoration.VERTICAL
                                )
                            )

                               taxiRecyclerView .adapter = TaxiAdapter(taxiList)
      
        Toast.makeText(context, "Taxi", Toast.LENGTH_LONG).show()


        return view
    }



}
