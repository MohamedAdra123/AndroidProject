package model;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class ImageAdapter extends BaseAdapter {
    Context context;
    ArrayList<Image> arrayList;
    public ImageAdapter(Context context, ArrayList<Image> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }
    @Override
    public int getCount() {
        return arrayList.size();
    }
    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }
    @Override
    public long getItemId(int i) {
        return i;
    }
    @SuppressLint("ResourceType")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView ==  null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.imageview, parent, false);
        }
        ImageView imageView;
        imageView = (ImageView) convertView.findViewById(R.string.PhotosId);
        imageView.setImageResource(arrayList.get(position).getId());
        return convertView;
    }
}
