package com.socialmeeting;


import com.socialmeeting.domain.Edition;
import com.socialmeeting.domain.Meeting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MeetingListActivity extends Activity {
	ListView lvMeetings;
	Context ctx = this;
	String edition;
	private SharedPreferences preferences;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.meetings);
        
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
	    edition = preferences.getString("edition", Edition.DEMONSTRATION.name());
	    
		
		lvMeetings = (ListView) findViewById(R.id.lvMeetings);
		
		lvMeetings.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,  int position, long id) {
				if(lvMeetings.getItemAtPosition(position)!=null){
					Meeting clickedMeeting =(Meeting) lvMeetings.getItemAtPosition(position);
					Intent i = new Intent(ctx, MeetingActivity.class);
					i.putExtra("meeting", clickedMeeting);
					startActivity(i);
				}
			}});
		 
		listMeetings();
	}
	
	private void listMeetings() {
		// TODO Auto-generated method stub
		
	}
}
