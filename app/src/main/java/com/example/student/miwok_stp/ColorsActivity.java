package com.example.student.miwok_stp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        //creating the arrayList of stringType of words
        final ArrayList<Word> words = new ArrayList<Word>();

        //this is a typical way to create object of word class and then adding those individual onjects in words arraylist
        //        Word w = new Word("one","Lutti");
        //        words.add(w);


        words.add(new Word(R.drawable.color_red,"red", "weṭeṭṭi",R.raw.color_red));
        words.add(new Word(R.drawable.color_mustard_yellow,"mustard yellow", "chiwiiṭә",R.raw.color_mustard_yellow));
        words.add(new Word(R.drawable.color_dusty_yellow,"dusty yellow", "ṭopiisә",R.raw.color_dusty_yellow));
        words.add(new Word(R.drawable.color_green,"green", "chokokki",R.raw.color_green));
        words.add(new Word(R.drawable.color_brown,"brown", "ṭakaakki",R.raw.color_brown));
        words.add(new Word(R.drawable.color_gray,"gray", "ṭopoppi",R.raw.color_gray));
        words.add(new Word(R.drawable.color_black,"black", "kululli",R.raw.color_black));
        words.add(new Word(R.drawable.color_white,"white", "kelelli",R.raw.color_white));



        //declaring the arrayAdapter
        WordAdapter adapter = new WordAdapter(this,words,R.color.category_colors);

        //declaring the listView
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

        //now to provide more textViews we have to override the getView() method.
        //LISTVIEW CALLS THE ADAPTER GETVIEW METHOD WHENEVER IT NEEDS A VIEW AND ONE OF THE INPUT ARGUMENT OF THE GETVIEW METHOD IS THE....
        //...DESIRED ELEMENT OF THE LIST.

        //setting up the list item clicks
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word=words.get(position);
                MediaPlayer mediaPlayer = MediaPlayer.create(ColorsActivity.this,word.getAudioResourceId());
                mediaPlayer.start();
            }
        });

    }
}
