package com.example.galeria.Adaptadores;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.galeria.R;

public class GaleriaImagenesAdapter extends BaseAdapter {
    private Context mContext;
    public int[] imagenesArray={
            R.drawable.images1,
            R.drawable.images3,
            R.drawable.images4,
            R.drawable.images5,
            R.drawable.images6,
            R.drawable.images7,
            R.drawable.images8,
            R.drawable.images9,
            R.drawable.images10,
            R.drawable.images11,
            R.drawable.images12,
            R.drawable.images13,
            R.drawable.images14,
            R.drawable.images15,
            R.drawable.images16,
            R.drawable.images17,
            R.drawable.images18,
            R.drawable.images19,
    };

    public GaleriaImagenesAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return imagenesArray.length;
    }

    @Override
    public Object getItem(int i) { return imagenesArray[i]; }

    @Override
    public long getItemId(int i) { return 0; }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        ImageView imageView=new ImageView(mContext);
        imageView.setImageResource(imagenesArray[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(
                new GridView.LayoutParams(
                        340,
                        350
                ));
        return imageView;
    }
}
