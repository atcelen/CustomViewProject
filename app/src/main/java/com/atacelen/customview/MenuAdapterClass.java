package com.atacelen.customview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MenuAdapterClass extends ArrayAdapter<String> {

    private final ArrayList<String> foodNameList;
    private final ArrayList<Integer> priceList;
    private final ArrayList<Bitmap> foodImageList;
    private final Activity context;

    public MenuAdapterClass(ArrayList<String> foodNameList, ArrayList<Integer> priceList, ArrayList<Bitmap> foodImageList, Activity context) {
        super(context, R.layout.custom_view, foodNameList);
        this.foodNameList = foodNameList;
        this.priceList = priceList;
        this.foodImageList = foodImageList;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View customView = layoutInflater.inflate(R.layout.custom_view, null, true);
        TextView foodNameText = customView.findViewById(R.id.custom_view_foodNameText);
        TextView priceText = customView.findViewById(R.id.custom_view_priceText);
        ImageView imageView = customView.findViewById(R.id.custom_view_imageView);

        foodNameText.setText(foodNameList.get(position));
        priceText.setText(priceList.get(position).toString() + " CHF");
        imageView.setImageBitmap(foodImageList.get(position));

        return customView;

    }
}
