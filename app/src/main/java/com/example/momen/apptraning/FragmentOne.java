package com.example.momen.apptraning;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {


    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView;
        rootView = inflater.inflate(R.layout.words_list,container,false);

        final ArrayList<LocationsCustomClass> locations = new ArrayList<>();
        locations.add(new LocationsCustomClass(R.string.locationOne,R.string.Des,R.raw.ic_launcher));
        locations.add(new LocationsCustomClass(R.string.locationtwo, R.string.destwo,R.raw.ic_launcher));
        locations.add(new LocationsCustomClass(R.string.locationthree,R.string.desthree, R.raw.ic_launcher));
        locations.add(new LocationsCustomClass(R.string.locationOne,R.string.Des,R.raw.ic_launcher));
        locations.add(new LocationsCustomClass(R.string.locationtwo, R.string.destwo,R.raw.ic_launcher));
        locations.add(new LocationsCustomClass(R.string.locationthree,R.string.desthree, R.raw.ic_launcher));
        locations.add(new LocationsCustomClass(R.string.locationOne,R.string.Des,R.raw.ic_launcher));
        locations.add(new LocationsCustomClass(R.string.locationtwo, R.string.destwo,R.raw.ic_launcher));
        locations.add(new LocationsCustomClass(R.string.locationthree,R.string.desthree, R.raw.ic_launcher));
        locations.add(new LocationsCustomClass(R.string.locationOne,R.string.Des,R.raw.ic_launcher));
        locations.add(new LocationsCustomClass(R.string.locationtwo, R.string.destwo,R.raw.ic_launcher));
        locations.add(new LocationsCustomClass(R.string.locationthree,R.string.desthree, R.raw.ic_launcher));



        TourAdapter adapter = new TourAdapter(getActivity(),locations);

        ListView listView = rootView.findViewById(R.id.words_list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        return rootView;



    }
}
