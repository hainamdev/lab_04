package com.example.test01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends BaseAdapter {

    private Context context;
    private int idLayout;
    private List<Product> listProduct = new ArrayList<Product>();

    public ProductAdapter(Context context, int idLayout, List<Product> listProduct) {
        this.context = context;
        this.idLayout = idLayout;
        this.listProduct = listProduct;
    }

    @Override
    public int getCount() {
        if (listProduct.size() != 0 && !listProduct.isEmpty()) {
            return listProduct.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(context).inflate(idLayout , null);
        ImageView itemImage = view.findViewById(R.id.ItemImage);
        TextView itemName  = view.findViewById(R.id.ItemName);
        TextView itemShopName  = view.findViewById(R.id.ItemShopName);
        itemImage.setImageResource(listProduct.get(i).getId());
        itemName.setText(listProduct.get(i).getName());
        itemShopName.setText(listProduct.get(i).getShopName());

        return view;
    }
}
