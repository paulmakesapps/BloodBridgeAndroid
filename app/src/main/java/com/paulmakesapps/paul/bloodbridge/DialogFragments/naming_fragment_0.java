package com.paulmakesapps.paul.bloodbridge.DialogFragments;
/**
 * Created by Paul on 11/11/2016.
 */

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.paulmakesapps.paul.bloodbridge.Main;
import com.paulmakesapps.paul.bloodbridge.R;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;


public class naming_fragment_0 extends Fragment implements View.OnClickListener {
    private static final String ARG_SECTION_NUMBER = "section_number";

    /**
     * Returns a new instance of this fragment for the given section number.
     */
    public static naming_fragment_0 newInstance(int sectionNumber) {
        naming_fragment_0 fragment = new naming_fragment_0();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;

    }

    public naming_fragment_0() {
    }


    Button savename;
    EditText entername;

    View view;


    TextView datedisplay, npcDialog;
    int pointtotal;


    //for the method
    int btnNum;
    String[] chararr;


    //date and time
    String currentDateTimeString;
    boolean isListFull;


    @Override
    public void onPause() {
        super.onPause();
        closeKeyboard(getActivity(), entername.getWindowToken());

    }

    public static void closeKeyboard(Context c, IBinder windowToken) {
        InputMethodManager mgr = (InputMethodManager) c.getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(windowToken, 0);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_naming,
                container, false);


        getActivity().getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);


//        //add the text for the npc dialog
//        final LinearLayout dialogLayout = (LinearLayout) view.findViewById(R.id.inflatedialog);
//        npcDialog = new TextView(getActivity());
//        npcDialog.setText("Sorry...What did you say your name was?");
//        npcDialog.setTextSize(16);
//        dialogLayout.addView(npcDialog);
//
//
//        //promt user for name
//        final LinearLayout userLayout = (LinearLayout) view.findViewById(R.id.inflatereply);
//        entername = new EditText(getActivity());
//        entername.setLayoutParams(new LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.MATCH_PARENT,
//                LinearLayout.LayoutParams.WRAP_CONTENT));
//
//        userLayout.addView(npcDialog);
//
//        savename = new Button(getActivity());
//        savename.setLayoutParams(new LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.MATCH_PARENT,
//                LinearLayout.LayoutParams.WRAP_CONTENT));
//        savename.setText("Reply");
//
//        // Set click listener for button
//        savename.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//
//                Toast.makeText(getActivity(), "Save pushed >> " + entername.getText().toString(), Toast.LENGTH_LONG).show();
//            }
//        });
//
//        userLayout.addView(savename);

//        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
//        Date d = new Date();
//        String dayOfTheWeek = sdf.format(d);
//
//        datedisplay.setText(dayOfTheWeek + " " + currentDateTimeString);


        return view;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        final InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(getView().getWindowToken(), 0);
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((Main) activity).onSectionAttached(0);
    }

    //handle button events
    @Override
    public void onClick(View v) {

        //handle button events
        switch (v.getId()) {
//            case R.id.addtoteam:
//
//
//                break;


        }

    }


}

