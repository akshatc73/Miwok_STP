package com.example.student.miwok_stp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        //creating the arrayList of stringType of words
    final ArrayList<Word> words = new ArrayList<Word>();

        //this is a typical way to create object of word class and then adding those individual onjects in words arraylist
        //        Word w = new Word("one","Lutti");
        //        words.add(w);

        words.add(new Word("Where are you going?", "minto wuksus",R.raw.phrase_where_are_you_going));
        words.add(new Word("What is your name?", "tinnә oyaase'nә",R.raw.phrase_what_is_your_name));
        words.add(new Word("My name is...", "oyaaset...",R.raw.phrase_my_name_is));
        words.add(new Word("How are you feeling?", "michәksәs?",R.raw.phrase_how_are_you_feeling));
        words.add(new Word("I’m feeling good.", "kuchi achit",R.raw.phrase_im_feeling_good));
        words.add(new Word("Are you coming?", "әәnәs'aa?",R.raw.phrase_are_you_coming));
        words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm",R.raw.phrase_yes_im_coming));
        words.add(new Word("I’m coming.", "әәnәm",R.raw.phrase_im_coming));
        words.add(new Word("Let’s go.", "yoowutis",R.raw.phrase_lets_go));
        words.add(new Word("Come here.", "әnni'nem",R.raw.phrase_come_here));



        //declaring the arrayAdapter
        WordAdapter adapter = new WordAdapter(this,words,R.color.category_phrases);

        //declaring the listView
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word =words.get(position);

                MediaPlayer mediaPlayer = MediaPlayer.create(PhrasesActivity.this,word.getAudioResourceId());
                mediaPlayer.start();


            }
        });


        //now to provide more textViews we have to override the getView() method.
        //LISTVIEW CALLS THE ADAPTER GETVIEW METHOD WHENEVER IT NEEDS A VIEW AND ONE OF THE INPUT ARGUMENT OF THE GETVIEW METHOD IS THE....
        //...DESIRED ELEMENT OF THE LIST.

    }
}
