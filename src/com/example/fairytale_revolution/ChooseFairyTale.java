package com.example.fairytale_revolution;


import android.annotation.SuppressLint;
import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

public class ChooseFairyTale extends Activity {

	int [] coordinates;
	View center_view;
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_choose_fairy_tale);
		
		center_view = findViewById(R.id.red_hood);

		final Button openPopupDornroeschen = (Button) findViewById(R.id.sleeping_beauty);
		final Button openPopupSiebenzwerge = (Button) findViewById(R.id.snow_white);
		final Button openPopupRapunzel = (Button) findViewById(R.id.rapunzel);
		final Button openPopupHenselundgretel = (Button) findViewById(R.id.hansel_gretel);
		
		openPopupDornroeschen.setOnClickListener(new MyClickListener());
		openPopupSiebenzwerge.setOnClickListener(new MyClickListener());
		openPopupRapunzel.setOnClickListener(new MyClickListener());
		openPopupHenselundgretel.setOnClickListener(new MyClickListener());


	    TextView textView = (TextView) findViewById(R.id.header);
	    textView.setTextSize(20);
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.choose_fairy_tale, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	

	public void startRedHood(View view) {
	    Intent intent = new Intent(this, RedHoodSlideActivity1.class);
	    startActivity(intent);
	}
		
		
	public final class MyClickListener implements OnClickListener {
			    @Override
			    public void onClick(View view) 
			    {
			     LayoutInflater layoutInflater 
			      = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);  
			     View popupView = layoutInflater.inflate(R.layout.popup_window, null);  
			              final PopupWindow popupWindow = new PopupWindow
			              (
			                popupView, 
			                LayoutParams.WRAP_CONTENT,  
			                      LayoutParams.WRAP_CONTENT
			              );  
			              
			              Button btnBack = (Button)popupView.findViewById(R.id.purchase);
			              btnBack.setOnClickListener(new Button.OnClickListener()
				              {
						      @Override
						      public void onClick(View v) {
						       popupWindow.dismiss();
						      }
					      });
			              
			              Button btnBuy = (Button)popupView.findViewById(R.id.back);
			              btnBuy.setOnClickListener(new Button.OnClickListener()
				              {
						      @Override
						      public void onClick(View v) {
						       popupWindow.dismiss();
						      }
					      });
			              
			              popupWindow.showAsDropDown(center_view, -25, -100);
			    }
		 
		
		
		 }
}
