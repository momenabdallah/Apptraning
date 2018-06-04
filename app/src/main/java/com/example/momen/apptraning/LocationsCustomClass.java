package com.example.momen.apptraning;

public class LocationsCustomClass {

    private int mLocationName;
    private int mLocationDescription;
    private int mLocationImage;

    public LocationsCustomClass(int mLocationName, int mLocationDescription, int mLocationImage) {
        this.mLocationName = mLocationName;
        this.mLocationDescription = mLocationDescription;
        this.mLocationImage = mLocationImage;
    }

    public LocationsCustomClass(int mLocationName, int mLocationDescription) {
        this.mLocationName = mLocationName;
        this.mLocationDescription = mLocationDescription;
    }

    public int getmLocationName() {
        return mLocationName;
    }

    public int getmLocationDescription() {
        return mLocationDescription;
    }

    public int getmLocationImage() {
        return mLocationImage;
    }

    public void setmLocationName(int mLocationName) {
        this.mLocationName = mLocationName;
    }

    public void setmLocationDescription(int mLocationDescription) {
        this.mLocationDescription = mLocationDescription;
    }

    public void setmLocationImage(int mLocationImage) {
        this.mLocationImage = mLocationImage;
    }
}
