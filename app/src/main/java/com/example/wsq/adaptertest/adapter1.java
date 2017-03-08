package com.example.wsq.adaptertest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class adapter1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter1);
        ListView view1=(ListView)findViewById(R.id.listview1);
        Button next =(Button)findViewById(R.id.button);
        String s[]={"hajhjkhfkjd","wsqer","zxc","huc","ufuishfuhuidh尽快恢复上课就很快就jkhfkjhskfhkjsdfdsgf","哈哈哈哈哈哈啊哈哈哈哈哈哈哈哈","hfjkdsjkfhkjsdhfhkdshk","你妹的","fhjkhdfjkhdsjkhfkjds"};
        ArrayAdapter<String> list1=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,s);
        view1.setAdapter(list1);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextactivity =new Intent();
                nextactivity.setClass(adapter1.this,adapter2.class);
                startActivity(nextactivity);
            }
        });
    }
}
