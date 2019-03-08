package com.habibcse009.foodguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    Toolbar toolbar;
    Button btnRecipe1, btnRecipe2, btnRecipe3, btnRecipe4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnRecipe1 = findViewById(R.id.btn_item1);
        btnRecipe2 = findViewById(R.id.btn_item2);
        btnRecipe3 = findViewById(R.id.btn_item3);
        btnRecipe4 = findViewById(R.id.btn_item4);

        btnRecipe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, DetailsActivity.class);
                intent.putExtra("recipe_no", "one");      //data passing
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Falafel Burger", Toast.LENGTH_SHORT).show();
            }
        });
        btnRecipe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, DetailsActivity.class);
                intent.putExtra("recipe_no", "two");      //data passing
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Chicken Biriany", Toast.LENGTH_SHORT).show();
            }
        });
        btnRecipe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, DetailsActivity.class);
                intent.putExtra("recipe_no", "three");      //data passing
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Chocklet Cake", Toast.LENGTH_SHORT).show();
            }
        });
        btnRecipe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, DetailsActivity.class);
                intent.putExtra("recipe_no", "four");      //data passing
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Maxical Pizza", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
