package hanan.birzeit.comp438.example.map2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class aboutActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_about);
            ImageView iconx = (ImageView) findViewById(R.id.iconx);
            ImageView photoX = (ImageView) findViewById(R.id.photoX);
            TextView text = (TextView) findViewById(R.id.text);
text.setText("car house is a car company located in ramallah  \n" +
        "we are just selling car without renting services\n\n" +
        "Address: alsaa'a square, Ramallah \n" +
        "Tel: 0003456865 \n" +
        "Email: carhouse@gmail.com");

        }

}
