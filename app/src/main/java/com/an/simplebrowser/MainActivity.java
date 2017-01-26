package com.an.simplebrowser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    WebView wv2;
    EditText etUrl2;
    Button mGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUrl2 = (EditText) findViewById(R.id.etUrl);
        mGo = (Button)findViewById(R.id.go);
        wv2 = (WebView) findViewById(R.id.wv);
        wv2.setWebViewClient(new WebViewClient());
        wv2.getSettings().setJavaScriptEnabled(true);

        mGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv2.loadUrl(etUrl2.getText().toString());
            }
        });

//        etUrl2.addTextChangedListener(new TextWatcher() {
//
//            public void onTextChanged(CharSequence s, int start, int before,
//                                      int count) {
//            }
//
//            public void beforeTextChanged(CharSequence s, int start, int count,
//                                          int after) {
//            }
//
//            public void afterTextChanged(Editable s) {
//                wv2.loadUrl(etUrl2.getText().toString());
//            }
//        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        wv2.loadUrl(etUrl2.getText().toString());
    }
}
