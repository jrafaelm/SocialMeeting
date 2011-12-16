package com.socialmeeting;

import android.app.Activity;
import android.os.Bundle;

public class MeetingActivity extends Activity {
	/**
	 * @see android.app.Activity#onCreate(Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.meeting);
	}
}
