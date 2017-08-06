package com.example.android.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by thodzic on 5/10/17.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    /**
     * Create a new WordAdapter object
     * @param context the current Activity that the adapter is being created in.
     * @param words is the list of words to be displayed.
     */
    public LocationAdapter(Context context, ArrayList<Location> words) {
        super(context, 0, words);
    }

    //Our ViewHolder containing the views we are calling each time getView is called.
    static class MyViewHolder {
        ImageView stadiumsPicture;
        TextView pointOfInterest;
        TextView location;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        MyViewHolder viewHolder;

        //Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

            //set up the ViewHolder
            viewHolder = new MyViewHolder();
            viewHolder.pointOfInterest = (TextView) listItemView.findViewById(R.id.point_of_interest);
            viewHolder.location = (TextView) listItemView.findViewById(R.id.location);
            viewHolder.stadiumsPicture = (ImageView) listItemView.findViewById(R.id.list_image);

            //store the holder with the view
            listItemView.setTag(viewHolder);
        }
        else {
            //avoiding calling findViewById() on resource every time
            //now just use the viewHolder
            viewHolder = (MyViewHolder) listItemView.getTag();
        }



        // Get the word object located at this position in the list
        Location currentWord = getItem(position);

        viewHolder.pointOfInterest.setText(currentWord.getPointOfInterest());
        viewHolder.location.setText(currentWord.getLocation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.list_image);

        if (currentWord.hasImage()){
            imageView.setImageResource(currentWord.getStadiumPicture());
            imageView.setVisibility(imageView.VISIBLE);
        } else{
            imageView.setVisibility(imageView.GONE);
        }

        return listItemView;
    }
}
