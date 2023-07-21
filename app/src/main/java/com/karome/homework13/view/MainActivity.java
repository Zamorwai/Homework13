package com.karome.homework13.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.karome.homework13.R;
import com.karome.homework13.model.Car;
import com.karome.homework13.viewmodel.CarAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Car> cars = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        CarAdapter adapter = new CarAdapter(this, cars);
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        cars.add(new Car("350 GT", "1964 - 1966", "254 км/ч", R.drawable.lambo_350_gt));
        cars.add(new Car("400 GT", "1966 - 1968", "249,4 км/ч", R.drawable.lambo_400_gt));
        cars.add(new Car("Miura", "1966 - 1973", "288 км/ч", R.drawable.lambo_miura));
        cars.add(new Car("Espada", "1968 - 1978", "245 км/ч", R.drawable.lambo_espada));
        cars.add(new Car("Islero", "1968 - 1970", "248 км/ч", R.drawable.lambo_islero));
        cars.add(new Car("Jarama", "1970 - 1976", "240 км/ч", R.drawable.lambo_jarama));
        cars.add(new Car("Urraco", "1970 - 1979", "230 км/ч", R.drawable.lambo_urraco));
        cars.add(new Car("Countach", "1974 - 1990", "316 км/ч", R.drawable.lambo_countach));
        cars.add(new Car("Silhouette", "1976 - 1979", "260 км/ч", R.drawable.lambo_silhouette));
        cars.add(new Car("Jalpa", "1982 - 1989", "240 км/ч", R.drawable.lambo_jalpa));
        cars.add(new Car("LM002", "1986 - 1992", "210 км/ч", R.drawable.lambo_lmoo2));
        cars.add(new Car("Diablo", "1990 - 2001", "330 км/ч", R.drawable.lambo_diablo));
        cars.add(new Car("Gallardo", "2003 - 2013", "325 км/ч", R.drawable.lambo_gallardo));
        cars.add(new Car("Reventón", "2008 - 2009", "356 км/ч", R.drawable.lambo_reventon));
        cars.add(new Car("Aventador", "2011 - 2021", "350 км/ч", R.drawable.lambo_aventador));
        cars.add(new Car("Sesto Elemento", "2011", "350 км/ч", R.drawable.lambo_sesto_elemento));
        cars.add(new Car("Venemo", "2013", "355 км/ч", R.drawable.lambo_veneno));
        cars.add(new Car("Huracán", "2014 - ", "325 км/ч", R.drawable.lambo_huracan));
        cars.add(new Car("Centenario", "2016 - 2017", "350 км/ч", R.drawable.lambo_centenario));
        cars.add(new Car("Urus", "2018 - ", "305 км/ч", R.drawable.lambo_urus));
        cars.add(new Car("Sián FKP 37", "2020 - ", "350 км/ч", R.drawable.lambo_sian));
        cars.add(new Car("Essenza SCV12", "2021", "350 км/ч", R.drawable.lambo_essenza));
        cars.add(new Car("Countach LPI 800-4", "2022", "355 км/ч", R.drawable.lambo_countach_hybrid));
    }
}