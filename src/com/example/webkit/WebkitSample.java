package com.example.webkit;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class WebkitSample extends Activity {
	WebView webView;
	Button button01;
	Button button02;
	Button button03;
	EditText editText01;
	String url;
	public void onCreate(Bundle icicle) {
		url = "http://www.android.com";
		super.onCreate(icicle);
		setContentView(R.layout.activity_webkit_sample);
		
		// WebViewの取得と表示
		webView = (WebView)findViewById(R.id.webview);
		webView.loadUrl(url);
		
		button01 = (Button)findViewById(R.id.Button01);
		button01.setOnClickListener(new View.OnClickListener(){  
			public void onClick(View v) {  
				webView.goBack();
			}	 
		}); 
		
		button02 = (Button)findViewById(R.id.Button02);
		button02.setOnClickListener(new View.OnClickListener(){  
			public void onClick(View v) {  
				webView.goForward();
			}	 
		}); 
		
		editText01 = (EditText)findViewById(R.id.EditText01);
		editText01.setText(url);
		
		button03 = (Button)findViewById(R.id.Button03);
		button03.setOnClickListener(new View.OnClickListener(){  
			public void onClick(View v) {  
				url = editText01.getText().toString();
				webView.loadUrl(url);
			}	 
		}); 
		
		webView.setWebViewClient(new WebViewClient());
	}
}
