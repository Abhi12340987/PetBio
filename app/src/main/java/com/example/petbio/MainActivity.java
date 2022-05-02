package com.example.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView catView;
    private ImageView dogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catView = (ImageView) findViewById(R.id.catImageViewId);
        dogView = (ImageView) findViewById(R.id.dogImageViewId);

        catView.setOnClickListener(this);
        dogView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.catImageViewId:
                Intent catIntent = new Intent(MainActivity.this, BioActivity.class);
                catIntent.putExtra("Name", "Mr.Mittens");
                catIntent.putExtra("Bio", "Great, friendly cat. Loves to be around people and cuddle");
                startActivity(catIntent);
              //  Toast.makeText(this, "Cat", Toast.LENGTH_LONG).show();
                break;

            case R.id.dogImageViewId:
                Intent dogIntent = new Intent(MainActivity.this, BioActivity.class);
                dogIntent.putExtra("Name", "Scruffy");
                dogIntent.putExtra("Bio", "A loyal, friendly golden labrador, who loves to run and play");
                startActivity(dogIntent);

                // Toast.makeText(this, "Dog", Toast.LENGTH_LONG).show();
                break;
        }
    }
}