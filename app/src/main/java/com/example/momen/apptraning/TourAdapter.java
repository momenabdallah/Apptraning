package com.example.momen.apptraning;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<LocationsCustomClass> {


    public TourAdapter(Context context, ArrayList<LocationsCustomClass> locations){
        super(context, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }

        LocationsCustomClass currentLocation = getItem(position);

        TextView locationName = (TextView) listItemView.findViewById(R.id.locationName);
        locationName.setText(currentLocation.getmLocationName());

        TextView locationDescription = (TextView) listItemView.findViewById(R.id.locationDescripttion);
        locationDescription.setText(currentLocation.getmLocationDescription());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.location_image);
        imageView.setImageResource(currentLocation.getmLocationImage());

        return listItemView;
    }
}
