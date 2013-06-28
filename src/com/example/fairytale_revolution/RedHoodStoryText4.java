package com.example.fairytale_revolution;

import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class RedHoodStoryText4 extends Fragment {
	
    public static final String ARG_PAGE = "page";

    /**
     * The fragment's page number, which is set to the argument value for {@link #ARG_PAGE}.
     */
    private int mPageNumber;
	
	
    public static RedHoodStoryText4 create(int pageNumber) {
        RedHoodStoryText4 fragment = new RedHoodStoryText4();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, pageNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public RedHoodStoryText4() {
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
        	((TextView) rootView.findViewById(R.id.story_text)).setText(getString(R.string.red_hood_string17));
        break;
        case 1:
        	((TextView) rootView.findViewById(R.id.story_text)).setText(getString(R.string.red_hood_string18));
        break;
        case 2:
        	((TextView) rootView.findViewById(R.id.story_text)).setText(getString(R.string.red_hood_string19));
        break;
        case 3:
        	((TextView) rootView.findViewById(R.id.story_text)).setText(getString(R.string.red_hood_string20));
        break;
        case 4:
        	((TextView) rootView.findViewById(R.id.story_text)).setText(getString(R.string.red_hood_string21));
        break;
        case 5:
        	((TextView) rootView.findViewById(R.id.story_text)).setText(getString(R.string.red_hood_string22));
        break;
        case 6:
        	((TextView) rootView.findViewById(R.id.story_text)).setText(getString(R.string.red_hood_string23));
        break;
        case 7:
        	((Button) rootView.findViewById(R.id.fin_button)).setVisibility(0);
        	((Button) rootView.findViewById(R.id.fin_button)).setText(getString(R.string.fin));
        	
        	Typeface face = Typeface.createFromAsset(getActivity().getAssets(), "fonts/badaboom.ttf");
        	((Button) rootView.findViewById(R.id.fin_button)).setTypeface(face);
        break;
        }

        return rootView;
    }
	
    public int getPageNumber() {
        return mPageNumber;
    }

}
