package com.amobletool.bluetooth.le;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AboutActivity extends Activity {
	private final static String TAG = AboutActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		getActionBar().setTitle("广州凯创");

		Intent intent = getIntent();
		String value = intent.getStringExtra("testIntent");

		String help = "广州凯创信息技术服务有限公司, 我们拥有一支富有激情的研发团队，包括了固件设计，硬件设计，iOS和安卓App设计，后台服务设计 网址:\r\n http://www.hcit.com.cn/";

		TextView tv = (TextView) findViewById(R.id.about_text_help);
		tv.setText(help);
	}

	public void onClick(View v) {
		// TODO 鑷姩鐢熸垚鐨勬柟娉曞瓨鏍�
	}

}