package com.androidcolombia.campusparty2010;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Home extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button b = (Button) findViewById(R.id.Button01);
        b.setOnClickListener(this);
    }

	@Override
	public void onClick(View arg0) {
		Intent i;
		i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo://0,0"));
		
		startActivity(i);		
	}
}