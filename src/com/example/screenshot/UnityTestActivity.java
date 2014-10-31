package com.example.screenshot;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.util.ScreenShotTools;
import com.unity3d.player.UnityPlayerActivity;

public class UnityTestActivity extends UnityPlayerActivity {
	Context context;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		context = this;
	}

	@SuppressLint("NewApi")
	public void screenShot() {
		 boolean result = ScreenShotTools.shotBitmap(this);
		 if (result) {
		 Log.i("Screen", "截屏成功");
		 }
	}
}
