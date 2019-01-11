package com.example.yangjiaxin.pocketcampus;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class sheTuan extends AppCompatActivity {
    private String[] sheTuanData = {"人文社会类","科技创新类","文艺类","体育类","我要报名"};
    private String[] url = {"http://mp.weixin.qq.com/s/0ih4d7Xq23kCoP29eUz0hA","http://mp.weixin.qq.com/s/Jsj4aEn4kWrpYx447OsSNw",
    "http://mp.weixin.qq.com/s/F_ofqtsME4LDITkx4SLLTg","http://mp.weixin.qq.com/s/tcN_nmNrwPmzPdVcg6eNjQ"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_she_tuan);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                sheTuan.this, android.R.layout.simple_list_item_1, sheTuanData);
        ListView listView = (ListView) findViewById(R.id.list_sheTuan);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                WebView webView = (WebView) findViewById(R.id.web_view);
                webView.getSettings().setJavaScriptEnabled(true);

                if (i==4){
                    Intent intent = new Intent(sheTuan.this,sheTuanJion.class);
                    startActivity(intent);
                }else{
                    webView.loadUrl(url[i]);
                }

                // Toast.makeText(sheTuan.this, sheTuanData[i], Toast.LENGTH_SHORT).show();
            }
        });
    }



}
