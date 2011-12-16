package com.socialmeeting;


import com.socialmeeting.domain.meeting.Meeting;
import com.socialmeeting.domain.meeting.MeetingFactory;
import com.socialmeeting.domain.product.Editions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MeetingListActivity extends Activity {
	ListView lvMeetings;
	Context ctx = this;
	Editions edition;
	ArrayAdapter<String> adp;
	private SharedPreferences preferences;
	OnItemClickListener ocl = new OnItemClickListener() {
		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1,  int position, long id) {
			if(lvMeetings.getItemAtPosition(position)!=null){
				String type =(String) lvMeetings.getItemAtPosition(position);
				Meeting meeting = MeetingFactory.create(type);
				Intent i = new Intent(ctx, MeetingActivity.class);
				i.putExtra("meeting", meeting);
				startActivity(i);
			}
		}};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.meetings);
        
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
	    edition = Editions.valueOf(preferences.getString("edition", Editions.DEMONSTRATION.name()));
	    
		
		lvMeetings = (ListView) findViewById(R.id.lvMeetings);
		
		 
		
		listMeetings();
	}
	
	private void listMeetings() {

		String[] meetings = {"Standard","Democratic","Private"};
		adp = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, meetings); 
		lvMeetings.setOnItemClickListener(ocl);
		lvMeetings.setAdapter(adp);
		
	}
}
