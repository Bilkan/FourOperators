package net.avar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class TestFrame extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ImageButton imbtadd = (ImageButton) findViewById(R.id.imbtAdd);
		ImageButton imbtsub = (ImageButton) findViewById(R.id.imbtSub);
		ImageButton imbtmultip = (ImageButton) findViewById(R.id.imbtMultip);
		ImageButton imbtdivi = (ImageButton) findViewById(R.id.imbtDivi);
		ImageButton imgbt = (ImageButton) findViewById(R.id.imbtArlash);
		ImageButton ibon = (ImageButton) findViewById(R.id.ibTeen);
		ImageButton ibyig = (ImageButton) findViewById(R.id.ibTwenty);
		ImageButton ibyuz = (ImageButton) findViewById(R.id.ibHundred);

		//add
		imbtadd.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				jumpToSubMenu();
			}

			private void jumpToSubMenu() {
				// TODO Auto-generated method stub
				setContentView(R.layout.mylayout);
			}

			

			
		});
		
		
		
		//sub
		imbtsub.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				jumpToSubMenu();
			}

			private void jumpToSubMenu() {
				// TODO Auto-generated method stub
				setContentView(R.layout.mylayout);
			}
		});
		
		//multiply
		imbtmultip.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				jumpToSubMenu();
			}

			private void jumpToSubMenu() {
				// TODO Auto-generated method stub
				setContentView(R.layout.mylayout);
			}
		});
		
		//divide
		imbtdivi.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				jumpToSubMenu();
			}

			private void jumpToSubMenu() {
				// TODO Auto-generated method stub
				setContentView(R.layout.mylayout);
			}
		});
		
		//arlash
		imgbt.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				jumpToSubMenu();
			}

			private void jumpToSubMenu() {
				// TODO Auto-generated method stub
				setContentView(R.layout.mylayout);
			}
		});
		
		ibon.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				jumpToSubMenu();
			}

			private void jumpToSubMenu() {
				// TODO Auto-generated method stub
				setContentView(R.layout.mylayout);
			}
		});
		ibyig.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				jumpTOLayout2();
			}

			//uyun tizimlikige kirish
			private void jumpTOLayout2() {

				setContentView(R.layout.lytgame);
			}
		});
		ibyuz.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				jumpTOLayout2();
			}

			//uyun tizimlikige kirish
			private void jumpTOLayout2() {

				setContentView(R.layout.lytgame);
			}
		});
    }
}