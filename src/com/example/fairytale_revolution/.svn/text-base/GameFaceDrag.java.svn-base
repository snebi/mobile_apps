package com.example.fairytale_revolution;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.DragShadowBuilder;
import android.view.View.OnDragListener;
import android.view.View.OnTouchListener;
import android.widget.TextView;

public class GameFaceDrag extends Activity {

	int count;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game_face_drag);
		
		// Set Welcome Message
		//((TextView) findViewById(R.id.textView1)).setText(getString(R.string.game_face_drag_txt));
		count = 0;	    
		
	    findViewById(R.id.bt_nose).setOnTouchListener(new MyTouchListener());
	    findViewById(R.id.bt_ears).setOnTouchListener(new MyTouchListener());
	    findViewById(R.id.bt_eyes).setOnTouchListener(new MyTouchListener());
	    findViewById(R.id.bt_mouth).setOnTouchListener(new MyTouchListener());
	    findViewById(R.id.nose).setOnDragListener(new MyDragListener());
	    findViewById(R.id.ears).setOnDragListener(new MyDragListener());
	    findViewById(R.id.eyes).setOnDragListener(new MyDragListener());
	    findViewById(R.id.mouth).setOnDragListener(new MyDragListener());	
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.game_face_drag, menu);
		return true;
	}
		
	 private final class MyTouchListener implements OnTouchListener {
		    @Override
			public boolean onTouch(View view, MotionEvent motionEvent) {
		      if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
		        ClipData data = ClipData.newPlainText("", "");
		        DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
		        view.startDrag(data, shadowBuilder, view, 0);
		        view.setVisibility(View.INVISIBLE);
		        return true;
		      } else {
		        return false;
		      }
		    }
		  }

		  
	 
	 class MyDragListener implements OnDragListener {
	   
	   @Override
	   public boolean onDrag(View v, DragEvent event) {
	     View dragView = (View) event.getLocalState();
	     
	     switch (event.getAction()) {
	     case DragEvent.ACTION_DRAG_STARTED:
	     // Do nothing
	    	 v.setBackgroundColor(Color.TRANSPARENT);
	       break;
	     case DragEvent.ACTION_DRAG_ENTERED:
	    	 
	    	 if(dragView.getId()==R.id.bt_ears && v.getId() == R.id.ears)
	    	 {
	    		 v.setBackgroundColor(Color.GREEN); 
	    		 break;
	    	 }
	    	 else if(dragView.getId()==R.id.bt_eyes && v.getId() == R.id.eyes)
	    	 {
	    		 v.setBackgroundColor(Color.GREEN);
	    		 break;
	    	 }
	    	 else if(dragView.getId()==R.id.bt_nose && v.getId() == R.id.nose)
	    	 {
	    		 v.setBackgroundColor(Color.GREEN);
	    		 break;
	    	 }
	    	 
	    	 else if(dragView.getId()==R.id.bt_mouth && v.getId() == R.id.mouth)
	    	 {
	    		 v.setBackgroundColor(Color.GREEN); 
	    		 break;	    	
	    	 }
	    	 v.setBackgroundColor(Color.RED); 
	    	 break;
	     case DragEvent.ACTION_DRAG_EXITED:        
	       v.setBackgroundColor(Color.TRANSPARENT);
	       break;
	     case DragEvent.ACTION_DROP:
	    
	    	 boolean done = false;
	    	 if(dragView.getId()==R.id.bt_ears && v.getId() == R.id.ears)
	    	 {
	    		 done = true;
	    	 }
	    	 else if(dragView.getId()==R.id.bt_eyes && v.getId() == R.id.eyes)
	    	 {
	    		 done = true;
	    	 }
	    	 else if(dragView.getId()==R.id.bt_nose && v.getId() == R.id.nose)
	    	 {
	    		 done = true;
	    	 }
	    	 
	    	 else if(dragView.getId()==R.id.bt_mouth && v.getId() == R.id.mouth)
	    	 {
	    		 done = true;
	    	 }
	    	 
	    	 
	    	 
	    	 if(done == true)
	    	 {
	    		 v.setBackgroundColor(Color.TRANSPARENT);
	    		 count++;
	    	 	 if(count ==4)
	    	 	 {
	    	 		TextView textView = (TextView) findViewById(R.id.textView1);
					textView.setText(getString(R.string.game_finished));
					   
					Intent intent = new Intent(GameFaceDrag.this, RedHoodSlideActivity4.class);
					startActivity(intent);
	    	 	 }
	    	 	 break;
	    	 }
	    	 else
	    	 {
	    		 setInvAgain(v, event);
	    		 v.setBackgroundColor(Color.TRANSPARENT);
	    	 }
	    	 
	    	
	     }
    	 	 return true;
	     }
    	 	 
    	 	
	    
	   void setInvAgain(View v, DragEvent event)
	   {
		   final View droppedView = (View) event.getLocalState();
   	    droppedView.post(new Runnable(){ @Override
		public void run(){
   	        droppedView.setVisibility(View.VISIBLE); // .setVisibility(View.VISIBLE);
   	    }});
		   
   	    
	   }   
	 } 
	 
	 
	 
	 public void continueToStory(View view) {
		    Intent intent = new Intent(this, RedHoodSlideActivity4.class);
		    startActivity(intent);
		}
	  
}

