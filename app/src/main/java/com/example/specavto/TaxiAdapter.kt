package com.example.specavto

//import androidx.recyclerview.widget.RecyclerView
//import androidx.recyclerview.widget.RecyclerView
//import com.example.recyclerview.TaxiHolder
//import com.example.specavto.TaxiHolder
//import androidx.specavto.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.specavto.R.layout.taxi_card

//import com.example.specavto.TaxiHolder

class TaxiAdapter(private val taxiList: List<ListTaxi>) : RecyclerView.Adapter<TaxiHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaxiHolder {
        TODO("Not yet implemented")

        val taxiView = LayoutInflater.from(parent.context)
            .inflate(taxi_card, parent, false)
        return TaxiHolder(taxiView)
    }

    override fun onBindViewHolder(holder: TaxiHolder, position: Int) {
        TODO("Not yet implemented")
        val taxi = taxiList[position]
        holder.bind(taxi)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
        return taxiList.size

    }


}

