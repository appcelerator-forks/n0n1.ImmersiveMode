/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package com.n0n1.immersive.mode;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.KrollProxy;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiC;
import org.appcelerator.titanium.util.TiConvert;
import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.titanium.view.TiCompositeLayout;
import org.appcelerator.titanium.view.TiCompositeLayout.LayoutArrangement;
import org.appcelerator.titanium.view.TiUIView;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


// This proxy can be created by calling ImmersiveMode.createImmersiveView();
@Kroll.proxy(creatableInModule=ImmersiveModeModule.class)
public class ImmersiveViewProxy extends TiViewProxy
{
	// Standard Debugging variables
	public static final String TAG = "ImmersiveViewProxy";

	@Kroll.constant public static String VERSION = ImmersiveModeModule.VERSION;
	
	@Kroll.constant public static int UI_FLAG_IMMERSIVE = View.SYSTEM_UI_FLAG_IMMERSIVE;
	@Kroll.constant public static int UI_FLAG_HIDE_NAVIGATION = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
	@Kroll.constant public static int UI_FLAG_LAYOUT_HIDE_NAVIGATION = View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION;
	@Kroll.constant public static int UI_FLAG_FULLSCREEN = View.SYSTEM_UI_FLAG_FULLSCREEN;
	@Kroll.constant public static int UI_FLAG_LAYOUT_FULLSCREEN = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN;
	@Kroll.constant public static int UI_FLAG_LAYOUT_STABLE = View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
	@Kroll.constant public static int UI_FLAG_LOW_PROFILE = View.SYSTEM_UI_FLAG_LOW_PROFILE;
	@Kroll.constant public static int UI_FLAG_RESET = 0;
	
	
	@Kroll.constant public static int DEAFAULT_MODE= 0;
	@Kroll.constant public static int IMMERSIVE_MODE= 1;
	
	public static void aboutModule() {
		Log.d(TAG, "About: ");
		Log.d(TAG, "Version Immersive Module: " + VERSION);
	}
	
	private int typeMode = DEAFAULT_MODE;
	
	public int getTypeMode() {
		return typeMode;
	}
	
	public void setTypeMode(int type) {
		typeMode = type;
	}
	
	private class ExampleView extends TiUIView
	{
		public ExampleView(TiViewProxy proxy) {
			super(proxy);
			LayoutArrangement arrangement = LayoutArrangement.DEFAULT;

			if (proxy.hasProperty(TiC.PROPERTY_LAYOUT)) {
				String layoutProperty = TiConvert.toString(proxy.getProperty(TiC.PROPERTY_LAYOUT));
				if (layoutProperty.equals(TiC.LAYOUT_HORIZONTAL)) {
					arrangement = LayoutArrangement.HORIZONTAL;
				} else if (layoutProperty.equals(TiC.LAYOUT_VERTICAL)) {
					arrangement = LayoutArrangement.VERTICAL;
				}
			}
			
			setNativeView(new TiCompositeLayout(proxy.getActivity(), arrangement));
		}

		@Override
		public void processProperties(KrollDict d)
		{
			super.processProperties(d);
		}
	}

	// Constructor
	public ImmersiveViewProxy()
	{
		super();
	}

	@Override
	public TiUIView createView(Activity activity)
	{
		TiUIView view = new ExampleView(this);
		view.getLayoutParams().autoFillsHeight = true;
		view.getLayoutParams().autoFillsWidth = true;
		return view;
	}

	@Override
	public void onCreate(Activity activity, Bundle savedInstanceState) {
		Log.d(TAG, "[onCreate]");
		super.onCreate(activity, savedInstanceState);
	}
	
	@Override
	public void onStart(Activity activity) {
		super.onStart(activity);
	}
	
	@Override
	public void onPause(Activity activity) {
		Log.d(TAG, "[onPause]");
		super.onPause(activity);
	}
	
	@Override
	public void onResume(Activity activity) {
		Log.d(TAG, "[onResume]");
		super.onResume(activity);
	}
	
	@Override
	public void onStop(Activity activity) {
		super.onStop(activity);
	}
	
	@Override
	public void onDestroy(Activity activity) {
		Log.d(TAG, "[onDestroy]");
		super.onDestroy(activity);
	}
	
	@Override
	public void add(TiViewProxy child) {
		super.add(child);
	}
	
	@Override
	public void setView(TiUIView view) {
		super.setView(view);
	}
	
	
	// Handle creation options
	@Override
	public void handleCreationDict(KrollDict options)
	{
		super.handleCreationDict(options);

		if (options.containsKey("type")) {
			
		}
	}
}