package com.example.superpractice.activity;
import com.example.superpractice.R;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends BaseActivity {
	
	private ListView listView;
	
	private ArrayAdapter<String> adapter;
	
	private String[] data = {"练习使用GridView", "练习使用ProgressBar"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		listView = (ListView) findViewById(R.id.listView);
		
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
		
		listView.setAdapter(adapter);
	}
	
	


}
