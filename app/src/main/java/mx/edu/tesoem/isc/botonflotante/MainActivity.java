package mx.edu.tesoem.isc.botonflotante;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class MainActivity extends AppCompatActivity {

    FloatingActionButton fbacarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fbacarga = findViewById(R.id.fbaCargar);

        fbacarga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten = new Intent(MainActivity.this,Segunda.class);
                startActivity(inten);
            }
        });
    }
}