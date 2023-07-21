package com.karome.homework13.viewmodel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.karome.homework13.R;
import com.karome.homework13.model.Car;

import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder> {
    private static LayoutInflater inflater;
    private static List<Car> cars;

    public CarAdapter(Context context, List<Car> cars) {
        this.inflater = LayoutInflater.from(context);
        this.cars = cars;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Car car = cars.get(position);
        holder.carPicture.setImageResource(car.getCarPicture());
        holder.carName.setText(car.getCarName());
        holder.releaseYear.setText(car.getReleaseYear());
        holder.maxSpeed.setText(car.getMaxSpeed());
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView carPicture;
        final TextView carName, releaseYear, maxSpeed;

        ViewHolder(View view) {
            super(view);
            carPicture = view.findViewById(R.id.carPicture);
            carName = view.findViewById(R.id.carName);
            releaseYear = view.findViewById(R.id.releaseYear);
            maxSpeed = view.findViewById(R.id.maxSpeed);
        }
    }
}
