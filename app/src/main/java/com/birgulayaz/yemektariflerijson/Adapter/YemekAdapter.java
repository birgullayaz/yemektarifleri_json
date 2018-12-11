package com.birgulayaz.yemektariflerijson.Adapter;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.birgulayaz.yemektariflerijson.Model.Yemek;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class YemekAdapter extends BaseAdapter {

    Context context;
    ArrayList<Yemek> yemekler;
    LayoutInflater layoutInflater;


    public YemekAdapter(Activity activity, ArrayList<Yemek> yemekler){
        this.context = activity;
        this.yemekler = yemekler;
        this.layoutInflater = (LayoutInflater)context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);

    }


    @Override
    public int getCount() {
        return yemekler.size();
    }

    @Override
    public Object getItem(int position) {
        return yemekler.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = layoutInflater.inflate("",null);

        return view1;

    }
}
