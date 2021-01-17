package hanan.birzeit.comp438.example.map2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button menu = (Button) findViewById(R.id.menu);
        Button Next = (Button) findViewById(R.id.Next);
        Button aboutUs = (Button) findViewById(R.id.aboutUs);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });
        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, aboutActivity.class);
                startActivity(intent);
            }
        });
    }

    public void goToCars(View view) {
        Intent intent = new Intent(MainActivity.this, RecyclerView.class);
        startActivity(intent);
    }
}