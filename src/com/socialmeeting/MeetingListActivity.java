package com.socialmeeting;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MeetingListActivity extends Activity {
	ListView lvMeetings;
	Context ctx = this;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.meetings);

		lvMeetings = (ListView) findViewById(R.id.lvMeetings);
		/*
		lvMeetings.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,  int position, long id) {
				if(lvMeetings.getItemAtPosition(position)!=null){
					Meeting clickedMeeting =(Meeting) lvMeetings.getItemAtPosition(position);
					clickedMeeting.setThumb(null);
					Intent i = new Intent(ctx, MeetingActivity.class);
					i.putExtra("serie", clickedMeeting);
					startActivity(i);
				}
			}});
		 */
		listMeetings();
	}
	
	private void listMeetings() {
		// TODO Auto-generated method stub
		
	}
}
