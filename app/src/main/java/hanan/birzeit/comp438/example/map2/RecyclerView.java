package hanan.birzeit.comp438.example.map2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

import hanan.birzeit.comp438.example.map2.Adater.BackgroundTask;
import hanan.birzeit.comp438.example.map2.Adater.MyAdapter;
import hanan.birzeit.comp438.example.map2.Models.CarModel;
import hanan.birzeit.comp438.example.map2.Models.ClickListener;
import hanan.birzeit.comp438.example.map2.Views.CarDetailsCard;


public class RecyclerView extends AppCompatActivity implements ClickListener {

    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private androidx.recyclerview.widget.RecyclerView.Adapter adapter;
    private androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
    private ArrayList<CarModel> carModelList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        recyclerView=findViewById(R.id.recyclerView);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        BackgroundTask backgroundTask = new BackgroundTask(RecyclerView.this);
        carModelList=backgroundTask.getList();
        adapter=new MyAdapter(carModelList);
        recyclerView.setAdapter(adapter);

    }
    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(this, CarDetailsCard.class);
        intent.putExtra("Car", carModelList.get(position));
        startActivity(intent);
    }

}