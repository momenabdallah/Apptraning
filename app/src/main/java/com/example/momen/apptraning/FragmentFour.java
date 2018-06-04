package com.example.momen.apptraning;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FragmentFour extends Fragment {

    public FragmentFour() {
        // Required empty puplic constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView;
        rootView = inflater.inflate(R.layout.words_list,container,false);

        final ArrayList<LocationsCustomClass> locations = new ArrayList<>();

        locations.add(new LocationsCustomClass(R.string.locationOne,R.string.Des));
        locations.add(new LocationsCustomClass(R.string.locationOne,R.string.Des));
        locations.add(new LocationsCustomClass(R.string.locationOne,R.string.Des));
        locations.add(new LocationsCustomClass(R.string.locationOne,R.string.Des));
        locations.add(new LocationsCustomClass(R.string.locationOne,R.string.Des));
        locations.add(new LocationsCustomClass(R.string.locationOne,R.string.Des));
        locations.add(new LocationsCustomClass(R.string.locationOne,R.string.Des));
        locations.add(new LocationsCustomClass(R.string.locationOne,R.string.Des));
        locations.add(new LocationsCustomClass(R.string.locationOne,R.string.Des));
        locations.add(new LocationsCustomClass(R.string.locationOne,R.string.Des));
        locations.add(new LocationsCustomClass(R.string.locationOne,R.string.Des));


        TourAdapter adapter = new TourAdapter(getContext(),locations);

        ListView listView = rootView.findViewById(R.id.words_list);

        listView.setAdapter(adapter);
        return rootView;
    }
}