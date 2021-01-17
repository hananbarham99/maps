package hanan.birzeit.comp438.example.map2.Adater;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import hanan.birzeit.comp438.example.map2.Models.CarModel;
import hanan.birzeit.comp438.example.map2.Models.ClickListener;
import hanan.birzeit.comp438.example.map2.R;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private ClickListener recycleViewOnItemClick;
    private LayoutInflater layoutInflater;
    private ArrayList<CarModel> cars;
    private Context Context;

    public MyAdapter(ArrayList<CarModel> cars) {
        this.cars = cars;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_car_details_card, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.brand.setText(cars.get(position).getBrand());
        Glide.with(Context).load(cars.get(position).getImage()).into(holder.imageView);
        holder.brand.setText(cars.get(position).getBrand());
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView brand;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewcard);
            brand = itemView.findViewById(R.id.carBrand);
        }
    }
}
