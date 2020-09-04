package com.atacelen.customview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    ArrayList<String> foodNameList;
    ArrayList<Integer> priceList;
    ArrayList<Bitmap> foodImageList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        foodNameList = new ArrayList<>();
        priceList = new ArrayList<>();
        foodImageList = new ArrayList<>();

        foodNameList.add("Quattro Formaggi");
        foodNameList.add("Ravioli");
        foodNameList.add("Paella");
        foodNameList.add("Fondue");
        foodNameList.add("Sushi");

        priceList.add(20);
        priceList.add(17);
        priceList.add(23);
        priceList.add(25);
        priceList.add(15);

        foodImageList.add(BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.quattroformaggi));
        foodImageList.add(BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.ravioli));
        foodImageList.add(BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.paella));
        foodImageList.add(BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.fondue));
        foodImageList.add(BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.sushi));

        MenuAdapterClass menuAdapterClass = new MenuAdapterClass(foodNameList, priceList, foodImageList, this);
        listView.setAdapter(menuAdapterClass);
    }
}