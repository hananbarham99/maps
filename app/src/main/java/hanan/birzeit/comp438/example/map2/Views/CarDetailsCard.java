package hanan.birzeit.comp438.example.map2.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import hanan.birzeit.comp438.example.map2.MainActivity;
import hanan.birzeit.comp438.example.map2.Models.CarModel;
import hanan.birzeit.comp438.example.map2.R;

public class CarDetailsCard extends AppCompatActivity {

    private ImageView imageView;
    private TextView brand;
    private TextView type;
    private TextView color;
    private TextView price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_details_card);

        imageView=findViewById(R.id.carDetaledImage);
        brand=findViewById(R.id.carBrand);
        type=findViewById(R.id.carType);
        color=findViewById(R.id.carColor);
        price=findViewById(R.id.carPrice);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            CarModel car = (CarModel) getIntent().getSerializableExtra("Car");
            if (car != null) {
                brand.setText(car.getBrand());
                type.setText(car.getType());
                color.setText(car.getColor());
                price.setText(car.getPrice());
                Glide.with(this).load(car.getImage()).into(imageView);
            } else {
                startActivity(new Intent(CarDetailsCard.this, MainActivity.class));
            }
        }
    }
}