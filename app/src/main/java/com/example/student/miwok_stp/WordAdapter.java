package com.example.student.miwok_stp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Student on 11-01-2019.
 */

public class WordAdapter extends ArrayAdapter<Word> {

private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words,int colorResourceId){
        super(context,0,words);
        mColorResourceId=colorResourceId;

    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Word currentPosition = getItem(position);


        TextView miwokTextview=(TextView)listItemView.findViewById(R.id.miwok_text_view);
        miwokTextview.setText(currentPosition.getMiwokTranslation());

        TextView englishTextview=(TextView)listItemView.findViewById(R.id.english_text_view);
        englishTextview.setText(currentPosition.getDefaultTranslation());

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.imageView);
        //imageView.setImageResource(currentPosition.getImageId());

        //modiying the phrases activity since it contains no images so it is showing no image in the provided image view in
        //in list_item view so writing this extra line of code here -

        // Check if an image is provided for this word or not
        if (currentPosition.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentPosition.getImageId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }
// Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);



        return listItemView;



    }
}
