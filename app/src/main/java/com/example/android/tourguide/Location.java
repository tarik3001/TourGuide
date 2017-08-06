package com.example.android.tourguide;

/**
 * Created by thodzic on 5/10/17.
 */

public class Location {

    //Provide the image of the stadiuns
    private int mStadiumPicture = NO_IMAGE_PROVIDED;

    //Constant value that represents no image was provided for this word
    private static final int NO_IMAGE_PROVIDED =  -1;

    //Get a point of interest within the city
    private String mPointOfInterest;

    //Provide the address to the point of interest
    private String mLocation;

    /**
     * Create a new Location object
     * @param pointOfInterest point of interest within the city
     * @param location location of the point of interest
     */
    public Location(String pointOfInterest, String location){
        mPointOfInterest = pointOfInterest;
        mLocation = location;
    }

    public Location(String pointOfInterest, String location, int stadiumPicture) {
        mPointOfInterest = pointOfInterest;
        mLocation = location;
        mStadiumPicture = stadiumPicture;

    }

    //Get the point of interest
    public String getPointOfInterest(){
        return mPointOfInterest;
    }

    //Get the location
    public String getLocation(){
        return mLocation;
    }

    //Get the stadium picture
    public int getStadiumPicture(){
        return mStadiumPicture;
    }

    public boolean hasImage() {
        return mStadiumPicture != NO_IMAGE_PROVIDED;
    }
}
