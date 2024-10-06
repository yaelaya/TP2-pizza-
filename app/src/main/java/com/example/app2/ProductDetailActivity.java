package com.example.app2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.app2.R;

public class ProductDetailActivity extends AppCompatActivity {
    private TextView name, productDescription, productIngredient, productPreparation;
    private ImageView image, shareButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_product_detail);

        Toolbar toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

            getSupportActionBar().setTitle(getIntent().getStringExtra("pizzaName"));
        }

        toolbar.setNavigationOnClickListener(v -> onBackPressed());

        name = findViewById(R.id.nom);
        productDescription = findViewById(R.id.productDescription);
        productIngredient = findViewById(R.id.productIngredient);
        productPreparation = findViewById(R.id.productPreparation);
        image = findViewById(R.id.image);


        String nom = getIntent().getStringExtra("pizzaName");
        String pizzaDescription = getIntent().getStringExtra("pizzaDescription");
        String pizzaIngredients = getIntent().getStringExtra("pizzaIngredients");
        String pizzaPreparation = getIntent().getStringExtra("pizzaPreparation");
        int imageResource = getIntent().getIntExtra("pizzaImage", 0);



        name.setText(nom);
        productDescription.setText(pizzaDescription);
        productIngredient.setText(pizzaIngredients);
        productPreparation.setText(pizzaPreparation);
        image.setImageResource(imageResource);


        shareButton = findViewById(R.id.shareButton);
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("THE IMAGE  WAS  CLICKED");
                Intent whatsappIntent = new Intent(Intent.ACTION_SEND);
                whatsappIntent.setType("text/plain");
                whatsappIntent.putExtra(Intent.EXTRA_TEXT, name+" "+ productDescription+" "+ productIngredient +" "+productPreparation);
                try {
                    whatsappIntent.setPackage("com.whatsapp");
                    startActivity(whatsappIntent);
                } catch (android.content.ActivityNotFoundException ex) {
                    System.out.println("Whatsapp isnt installed");
                }
            }
        });
    }
}