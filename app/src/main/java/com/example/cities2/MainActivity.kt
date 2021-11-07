package com.example.cities2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //    val userNameList:List<String> = listOf("Maxim","Alex","Oleg","Nadya","Liza","Arina","Lucky","Murka","Vorona","Mama","Papa","Baba","Deda")

        val citiesList: List<Cities> = listOf(
            Cities("Барнаул", 631124, "Алтайский край"),
            Cities("Иркутск", 617315, "Иркутская область"),
            Cities("Братск", 225037, "Иркутская область"),
            Cities("Кемерово", 552546, "Кемеровская область"),
            Cities("Красноярск", 1092851, "Красноярский край"),
            Cities("Новосибирск", 1620162, "Новосибирская область"),
            Cities("Омск", 1139897, "Омская область"),
            Cities("Томск", 568508, "Томская область"),
            Cities("Кызыл", 120067, "Тува"),
            Cities("Абакан", 187239, "Хакасия")

        )


        val usersRecyclerView: RecyclerView = findViewById((R.id.user_recycler_view))
        usersRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        usersRecyclerView.adapter = CitiesAdapter(citiesList)


    }
}