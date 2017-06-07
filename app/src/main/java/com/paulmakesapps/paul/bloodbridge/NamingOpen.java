package com.paulmakesapps.paul.bloodbridge;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import FileIO.FileIO;
import GenericCharacter.GenericCharacter;

public class NamingOpen extends ActionBarActivity {

    TextView npcDialog;
    EditText entername;

    String playername;

GenericCharacter wolffight_char;
    GenericCharacter zombiefight_char;


FileIO fio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_naming);

        wolffight_char= new GenericCharacter("name","Warrior","generic description","mainchar",8,14,1,1,5);
        zombiefight_char= new GenericCharacter("name","Rogue","generic description","mainchar",7,15,1,1,5);

        final LinearLayout dl = (LinearLayout) findViewById(R.id.inflatedialog);

        npcDialog = new TextView(this);
        npcDialog.setText("Sorry...What did you say your name was?");
        npcDialog.setTextSize(24);
        npcDialog.setTextColor(Color.parseColor("#FF000000"));
        npcDialog.setBackgroundColor(Color.parseColor("#56848381"));
        npcDialog.setId(0);
        dl.addView(npcDialog);



                //promt user for name
        final LinearLayout userLayout = (LinearLayout) findViewById(R.id.inflatereply);
        entername = new EditText(this);
        entername.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));


        userLayout.addView(entername);


        final Button reply1= new Button(this);
        reply1.setText("Yes");
        reply1.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        reply1.setTextSize(24);
        reply1.setBackgroundColor(Color.parseColor("#56848381"));

        // Set click listener for button
        reply1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                zombiefight_char.setName(playername);
                //fio.saveMainCharacter(zombiefight_char);

                Intent intent = new Intent(NamingOpen.this, Combat.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

                //cut to zombie fight
            }
        });


        final Button reply2= new Button(this);
        reply2.setText("No, it was a Wolf");
        reply2.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        reply2.setTextSize(24);
        // Set click listener for button
        reply2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                wolffight_char.setName(playername);
               // fio.saveMainCharacter(wolffight_char);

                Intent intent = new Intent(NamingOpen.this, Combat.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            //cut to wolf fight
           }
        });

        final Button savename = new Button(this);
        savename.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        savename.setText("Reply");
        savename.setTextSize(24);


        // Set click listener for button
        savename.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(savename.getWindowToken(), 0);


                playername= new String(entername.getText().toString());
                userLayout.removeAllViews();
                dl.removeAllViews();
                npcDialog.setText("Ah that's right, "+playername+"...and what was that about killing...zombies was it?");
                dl.addView(npcDialog);
                userLayout.addView(reply1);
                userLayout.addView(reply2);
            }
        });

        userLayout.addView(savename);
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(savename.getWindowToken(), 0);

    }

    public void initChar(){
        wolffight_char= new GenericCharacter("name","Warrior","generic description","mainchar",8,14,1,1,5);
        zombiefight_char= new GenericCharacter("name","Rogue","generic description","mainchar",7,15,1,1,5);

    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_naming_open, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
