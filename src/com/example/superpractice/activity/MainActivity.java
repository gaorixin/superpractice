package com.example.superpractice.activity;
import com.example.superpractice.R;

import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends BaseActivity {
	
	private ListView listView;
	
	private ArrayAdapter<String> adapter;
	
	private String[] data = {"�Զ���ListView", "GridView", "ProgressBar","Spinner", "WebView","Fragment", "ViewPager","ViewFlipper","Fragment", "ScrollView","Gallery","SeekBar"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);//���ý����ޱ���
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);//����ȫ����ʾ 
		setContentView(R.layout.activity_main);
		
		listView = (ListView) findViewById(R.id.list_view);
		
		adapter = new ArrayAdapter<String>(this, R.layout.practice_item, data);
		
		listView.setAdapter(adapter);
	}
	
	
//	android.R.layout.simple_list_item_1
//	R.layout.practice_item


}
