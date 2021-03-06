package com.example.fairytale_revolution;
import android.app.Activity;
import android.app.ActionBar.LayoutParams;
import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.DragShadowBuilder;
import android.view.View.OnClickListener;
import android.view.View.OnDragListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;



public class GameBasket extends Activity implements OnClickListener {

	int basket_down;
	int count;
	View center_view;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game_basket_new);
		
		center_view = findViewById(R.id.red_hood);
		basket_down = 0;
		count = 0;
		
	    TextView textView = (TextView) findViewById(R.id.textViewBasketGame);
	    textView.setText(getString(R.string.basket_strawberry));
	    
	    findViewById(R.id.strawberry).setOnTouchListener(new MyTouchListener());
	    findViewById(R.id.orange).setOnTouchListener(new MyTouchListener());
	    findViewById(R.id.apple).setOnTouchListener(new MyTouchListener());
	    findViewById(R.id.banana).setOnTouchListener(new MyTouchListener());
	    findViewById(R.id.onion).setOnTouchListener(new MyTouchListener());
	    findViewById(R.id.tomato).setOnTouchListener(new MyTouchListener());
	    findViewById(R.id.pepper).setOnTouchListener(new MyTouchListener());
	    findViewById(R.id.carot).setOnTouchListener(new MyTouchListener());
	    findViewById(R.id.basket).setOnDragListener(new MyDragListener());
	   
	}	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.game_basket, menu);
		return true;
	}
	
	@Override
	public void onClick(View v) {
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
		       v.setBackgroundColor(Color.TRANSPARENT);
		       break;
		       
		    case DragEvent.ACTION_DRAG_ENTERED:
		    	 
		    	  switch(count)
				   {
					   case 0:
						   if(dragView.getId() != R.id.strawberry){
							   v.setBackgroundColor(Color.RED);
							   break;
						   }
						   v.setBackgroundColor(Color.GREEN);
						   break;
					   
					   case 1:
						   if(dragView.getId() != R.id.orange){   
							   v.setBackgroundColor(Color.RED);
							   break;
						   }
						   v.setBackgroundColor(Color.GREEN);
						   break;
					   
					   case 2:
						   if(dragView.getId() != R.id.apple){   
							   v.setBackgroundColor(Color.RED);
							   break;
						   }
						   v.setBackgroundColor(Color.GREEN);
						   break;
					   
					   case 3:
						   if(dragView.getId() != R.id.banana){
							   v.setBackgroundColor(Color.RED);
							   break;
						   }
						   v.setBackgroundColor(Color.GREEN);
						   break;
					   
					   case 4:
						   if(dragView.getId() != R.id.onion){					   
							   v.setBackgroundColor(Color.RED);
							   break;
						   }
						   v.setBackgroundColor(Color.GREEN);
						   break;
					   
					   case 5:
						   if(dragView.getId() != R.id.tomato){
							   v.setBackgroundColor(Color.RED);
							   break;
						   }
						   v.setBackgroundColor(Color.GREEN);
						   break;
					   
					   case 6:
						   if(dragView.getId() != R.id.pepper){
							   v.setBackgroundColor(Color.RED);
							   break;
						   }
						   v.setBackgroundColor(Color.GREEN);
						   break;
	
					   case 7:
						   if(dragView.getId() != R.id.carot){
							   v.setBackgroundColor(Color.RED);
							   break;
						   }
						   v.setBackgroundColor(Color.GREEN);
						   break;
				   }
		       break;
		     
		     case DragEvent.ACTION_DRAG_EXITED:        
		       v.setBackgroundColor(Color.TRANSPARENT);
		       break;
		       
		     case DragEvent.ACTION_DROP:
		       // Dropped, reassign View to ViewGroup
			   TextView textView = (TextView) findViewById(R.id.textViewBasketGame);
			   ImageView image = (ImageView) findViewById(R.id.basket);

		  	   
		   switch(count)
		   {
			   case 0:
				   if(dragView.getId() != R.id.strawberry) {
					   setInvAgain(v, event);
					   break;
				   }
				   
				   textView.setText(getString(R.string.basket_orange));
				   image.setImageResource(R.drawable.korb_erdbeere);
				   count = 1;
				   
				   break;
				   
			   case 1:
				   if(dragView.getId() != R.id.orange) {				
					   setInvAgain(v, event);
					   break;
				   }
				   
				   textView.setText(getString(R.string.basket_apple));
				   image.setImageResource(R.drawable.korb_apfel);
				   count = 2;
				   break;
				   
			   case 2:
				   if(dragView.getId() != R.id.apple) {
					   setInvAgain(v, event);
					   break;
				   }
				   
				   textView.setText(getString(R.string.basket_banana));
				   image.setImageResource(R.drawable.korb_banane);
				   count = 3;
				   break;
				   
			   case 3:
				   if(dragView.getId() != R.id.banana) {
					   setInvAgain(v, event);
					   break;
				   }
				   
				   textView.setText(getString(R.string.basket_onion));
				   image.setImageResource(R.drawable.korb_zwiebel);
				   count = 4;
				   break;
				   
			   case 4:
				   if(dragView.getId() != R.id.onion) {
					   setInvAgain(v, event);
					   break;
				   }
				   
				   textView.setText(getString(R.string.basket_tomato));
				   image.setImageResource(R.drawable.korb_tomate);
				   count = 5;
				   break;
				   
			   case 5:
				   if(dragView.getId() != R.id.tomato) {
					   setInvAgain(v, event);
					   break;
				   }
				   
				   textView.setText(getString(R.string.basket_pepper));
				   image.setImageResource(R.drawable.korb_paprika);
				   count = 6;
				   break;
				  
			   case 6:
				   if(dragView.getId() != R.id.pepper) {
					   setInvAgain(v, event);
					   break;
				   }
				   
				   textView.setText(getString(R.string.basket_carot));
				   image.setImageResource(R.drawable.korb_karotte);
				   count = 7;
				   break;
				   
			   case 7:
				   if(dragView.getId() != R.id.carot) {
					   setInvAgain(v, event);
					   break;
				   }
				   
				   image.setImageResource(R.drawable.korb_all);
				   textView.setText(getString(R.string.basket_end));
				  
				   Intent intent = new Intent(GameBasket.this, RedHoodSlideActivity2.class);
				   startActivity(intent);
				   
				   
				   count = 8;
				   break;
		   }
		   
	       break;
	       
	     case DragEvent.ACTION_DRAG_ENDED:	    	 
	    	 if(!event.getResult()) {
	    		 setInvAgain(v, event);
	    	 }
	       
	       default:
	       break;
	     }
	     return true;
	   }
	   
	   void setInvAgain(View v, DragEvent event) {
		   final View droppedView = (View) event.getLocalState();
   	    droppedView.post(new Runnable() { @Override
   	    	public void run() {
   	        	droppedView.setVisibility(View.VISIBLE);
   	    }});
	   }
	 } 
	 
	 public static void waiting(int n) {
		long t0, t1;
		t0 = System.currentTimeMillis();
		do {
			t1 = System.currentTimeMillis();
		} while ((t1 - t0) < (n));
	}
}
