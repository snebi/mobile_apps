package com.example.fairytale_revolution;

import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class RedHoodStoryText1 extends Fragment {
	
    public static final String ARG_PAGE = "page";

    /**
     * The fragment's page number, which is set to the argument value for {@link #ARG_PAGE}.
     */
    private int mPageNumber;
	
	
    public static RedHoodStoryText1 create(int pageNumber) {
        RedHoodStoryText1 fragment = new RedHoodStoryText1();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, pageNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public RedHoodStoryText1() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPageNumber = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // Inflate the layout containing a title and body text.
        ViewGroup rootView = (ViewGroup) inflater
                .inflate(R.layout.activity_story_text, container, false);
        
        switch(mPageNumber){
        case 0:
        	
        	((TextView) rootView.findViewById(R.id.story_text)).setText(getString(R.string.red_hood_string1));
        break;
        case 1:
        	
        	((TextView) rootView.findViewById(R.id.story_text)).setText(getString(R.string.red_hood_string2));
        	((Button) rootView.findViewById(R.id.game_button)).setVisibility(0);
        	((Button) rootView.findViewById(R.id.game_button)).setText(getString(R.string.play_game));
        	
        	Typeface face = Typeface.createFromAsset(getActivity().getAssets(), "fonts/badaboom.ttf");
        	((Button) rootView.findViewById(R.id.game_button)).setTypeface(face);
        	
        break;
        }

        return rootView;
    }
	
    public int getPageNumber() {
        return mPageNumber;
    }

}
