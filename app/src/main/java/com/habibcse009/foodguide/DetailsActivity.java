package com.habibcse009.foodguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
TextView txtName,txtDescription;
ImageView imgRecipe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        txtName=findViewById(R.id.txt_recipe_name);
        txtDescription=findViewById(R.id.txt_description);
        imgRecipe=findViewById(R.id.img_recipy);

        String getName=getIntent().getExtras().getString("recipe_no");

        if(getName.equals("one")){
            imgRecipe.setImageResource(R.drawable.falafel_burgers);
            txtName.setText("Falafel Burger");
            txtDescription.setText(R.string.recipe1);

        }
        else if(getName.equals("two")){
            imgRecipe.setImageResource(R.drawable.chicken_biriyani);
            txtName.setText("Chicken Biriyani");
            txtDescription.setText(R.string.recipe2);

        }
        else if(getName.equals("three")){
            imgRecipe.setImageResource(R.drawable.cake);
            txtName.setText("Chocklet Cake");
            txtDescription.setText(R.string.recipe3);

        }
        else if(getName.equals("four")){
            imgRecipe.setImageResource(R.drawable.pizza);
            txtName.setText("Mexical Pizza");
            txtDescription.setText(R.string.recipe4);

        }
    }
}
