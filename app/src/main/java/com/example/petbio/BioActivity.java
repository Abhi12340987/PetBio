package com.example.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {
    private ImageView petImageView;
    private TextView petName;
    private TextView petBio;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        petImageView = (ImageView) findViewById(R.id.petBioImgId);
        petName = (TextView) findViewById(R.id.nameID);
        petBio = (TextView) findViewById(R.id.bioTextId);

        extras = getIntent().getExtras();

        if (extras != null) {
            String name = extras.getString("Name");
            String bio = extras.getString("Bio");

            setUp(name, bio);
        }
    }
    public void setUp(String name, String bio) {

        if(name.equals("Scruffy")){
            //we show dog bio
            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.icon_lg_dog));
            petName.setText(name);
            petBio.setText(bio);

        } else if (name.equals("Mr.Mittens")){
            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.icon_lg_cat));
            petName.setText(name);
            petBio.setText(bio);
            //we show cat bio

        }
    }
}