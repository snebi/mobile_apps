package com.example.fairytale_revolution;

import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class RedHoodStoryText2 extends Fragment {
	
    public static final String ARG_PAGE = "page";

    /**
     * The fragment's page number, which is set to the argument value for {@link #ARG_PAGE}.
     */
    private int mPageNumber;
	
	
    public static RedHoodStoryText2 create(int pageNumber) {
        RedHoodStoryText2 fragment = new RedHoodStoryText2();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, pageNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public RedHoodStoryText2() {
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
        	((TextView) rootView.findViewById(R.id.story_text)).setText(getString(R.string.red_hood_string3));
        break;
        case 1:
        	((TextView) rootView.findViewById(R.id.story_text)).setText(getString(R.string.red_hood_string4));
        break;
        case 2:
        	((TextView) rootView.findViewById(R.id.story_text)).setText(getString(R.string.red_hood_string5));
        break;
        case 3:
        	((TextView) rootView.findViewById(R.id.story_text)).setText(getString(R.string.red_hood_string6));
        break;
        case 4:
        	((TextView) rootView.findViewById(R.id.story_text)).setText(getString(R.string.red_hood_string7));
        break;
        case 5:
        	((TextView) rootView.findViewById(R.id.story_text)).setText(getString(R.string.red_hood_string8));
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
