package com.example.cities2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CitiesAdapter(private val CitiesList: List<Cities>) : RecyclerView.Adapter<CitiesHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CitiesHolder {

        val citiesListView =
            LayoutInflater.from(parent.context).inflate(R.layout.cities_list, parent, false)


        return CitiesHolder(citiesListView)


    }

    override fun onBindViewHolder(holder: CitiesHolder, position: Int) {
        val cities = CitiesList[position]
        holder.bind(cities)

    }


    override fun getItemCount(): Int {
        return CitiesList.size

    }
}




