package com.example.student.miwok_stp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //creating the arrayList of stringType of words
        final ArrayList<Word> words = new ArrayList<Word>();

        //this is a typical way to create object of word class and then adding those individual onjects in words arraylist
        //        Word w = new Word("one","Lutti");
        //        words.add(w);


        words.add(new Word(R.drawable.number_one,"one", "lutti",R.raw.number_one));
        words.add(new Word(R.drawable.number_two,"two", "otiiko",R.raw.number_two));
        words.add(new Word(R.drawable.number_three,"three", "tolookosu",R.raw.number_three));
        words.add(new Word(R.drawable.number_four,"four", "oyyisa",R.raw.number_four));
        words.add(new Word(R.drawable.number_five,"five", "massokka",R.raw.number_five));
        words.add(new Word(R.drawable.number_six,"six", "temmokka",R.raw.number_six));
        words.add(new Word(R.drawable.number_seven,"seven", "kenekaku",R.raw.number_seven));
        words.add(new Word(R.drawable.number_eight,"eight", "kawinta",R.raw.number_eight));
        words.add(new Word(R.drawable.number_nine,"nine", "wo’e",R.raw.number_nine));
        words.add(new Word(R.drawable.number_ten,"ten", "na’aacha",R.raw.number_ten));

        //declaring the arrayAdapter
        WordAdapter adapter = new WordAdapter(this,words,R.color.category_numbers);

        //declaring the listView
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

        //now to provide more textViews we have to override the getView() method.
        //LISTVIEW CALLS THE ADAPTER GETVIEW METHOD WHENEVER IT NEEDS A VIEW AND ONE OF THE INPUT ARGUMENT OF THE GETVIEW METHOD IS THE....
        //...DESIRED ELEMENT OF THE LIST.

//setting up the list item  clicks


listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Word word =words.get(position);

        MediaPlayer mediaPlayer = MediaPlayer.create(NumbersActivity.this,word.getAudioResourceId());
        mediaPlayer.start();
    }
});
    }


}
