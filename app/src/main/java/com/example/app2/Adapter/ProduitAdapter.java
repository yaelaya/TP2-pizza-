package com.example.app2.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.app2.R;
import com.example.app2.classes.Produit;

import java.util.List;

public class ProduitAdapter extends BaseAdapter {
    private List<Produit> produits;
    private LayoutInflater inflater;

    public ProduitAdapter(List<Produit> produits, Activity activity) {
        this.produits = produits;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return produits.size();
    }

    @Override
    public Object getItem(int position) {
        return produits.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void removeProduit(int position) {
        produits.remove(position);
        notifyDataSetChanged();
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = inflater.inflate(R.layout.item, null);

        TextView nom = convertView.findViewById(R.id.nom);
        TextView nbrIngredients = convertView.findViewById(R.id.nbrIngredients);
        TextView duree= convertView.findViewById(R.id.duree);
        ImageView image = convertView.findViewById(R.id.image);

        image.setImageResource(produits.get(position).getPhoto());
        nom.setText(produits.get(position).getNom());
        nbrIngredients.setText(String.valueOf(produits.get(position).getNbrIngredients())+" ingrédrients");
        duree.setText(produits.get(position).getDuree() + " min");

        return convertView;
    }
}
