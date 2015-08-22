package com.example.superpractice.activity;
import com.example.superpractice.R;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends BaseActivity implements OnItemClickListener {
	
	private ListView listView;
	
	private ArrayAdapter<String> adapter;
	
	private String[] data = {"自定义ListView", "GridView", "ProgressBar","Spinner", "WebView","Fragment", "ViewPager","ViewFlipper","Fragment", "ScrollView","Gallery","SeekBar"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);//设置界面无标题
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);//设置全屏显示 
		setContentView(R.layout.activity_main);
		
		listView = (ListView) findViewById(R.id.list_view);
		
		adapter = new ArrayAdapter<String>(this, R.layout.practice_item, data);
		
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		switch (arg2) {
		case 0:
			Toast.makeText(this, "0", Toast.LENGTH_SHORT).show();
			break;

		case 1:
			Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
			break;
		default:
			break;
		}
	}
	
	



}
