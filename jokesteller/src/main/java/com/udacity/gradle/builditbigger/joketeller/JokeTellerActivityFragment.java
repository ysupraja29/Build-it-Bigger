package com.udacity.gradle.builditbigger.joketeller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

//for Ads from Google Play Services


/**
 * A placeholder fragment containing a simple view.
 */
public class JokeTellerActivityFragment extends Fragment {

    public JokeTellerActivityFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_teller_joke, container, false);
        Intent receivedIntentLib = getActivity().getIntent();
        if (receivedIntentLib != null) {

            String joke_message_from_lib = receivedIntentLib.getStringExtra(JokeTellerActivity.TAG);

            if (joke_message_from_lib != null) {
                TextView jokeTV = (TextView) rootView.findViewById(R.id.tv_joke);
                jokeTV.setText(joke_message_from_lib);
            }

        }

        return rootView;
    }
}
