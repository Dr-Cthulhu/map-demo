package com.example.mapdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

/**
 * Created by mpan on 6/29/17.
 */

public class CustomWindowAdapter implements GoogleMap.InfoWindowAdapter {

    LayoutInflater mInflater;

    public CustomWindowAdapter(LayoutInflater i) {
        mInflater = i;
    }

    @Override
    public View getInfoContents(Marker marker) {
        View v = mInflater.inflate(R.layout.custom_info_window, null);
        TextView title = (TextView) v.findViewById(R.id.tv_info_window_title);
        title.setText(marker.getTitle());

        TextView description = (TextView) v.findViewById(R.id.tv_info_window_description);
        description.setText(marker.getSnippet());

        return v;
    }

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }
}
