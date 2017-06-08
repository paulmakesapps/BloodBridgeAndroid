package com.paulmakesapps.paul.bloodbridge;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import GenericCharacter.*;
import FileIO.*;

public class Combat extends ActionBarActivity implements View.OnClickListener {

    TextView pname,patk,pdef,pdmg,phealth;
    GenericCharacter player;
    FileIO fio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combat);

        fio= new FileIO();

        pname=(TextView) findViewById(R.id.pname);
        patk=(TextView) findViewById(R.id.patk);
        pdef=(TextView) findViewById(R.id.pdef);
        pdmg=(TextView) findViewById(R.id.pdmg);
        phealth=(TextView) findViewById(R.id.phealth);
      // player=fio.getPlayer(Combat.this);
//
        pname.setText("GG alin");
//        patk.setText(player.getAtk());
//        pdef.setText(player.getDef());
//        pdmg.setText(player.getDmg());
//        phealth.setText(player.getHealth());



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_combat, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

    }
}
