package com.example.superpractice.activity;

import com.example.superpractice.util.LogUtil;

import android.app.Activity;
import android.os.Bundle;

public class BaseActivity extends Activity {

	 @Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		LogUtil.d("BaseActivity", getClass().getSimpleName());
	}
}
