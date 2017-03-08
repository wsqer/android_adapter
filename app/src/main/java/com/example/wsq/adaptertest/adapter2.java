package com.example.wsq.adaptertest;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by wsq on 2017/3/8.
 */

public class adapter2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listactivity);
        ListView view2=(ListView)findViewById(R.id.listview2);
        Button up=(Button)findViewById(R.id.button3) ;
        final String names[]={"wsq","af","gl","ht","你妹的","哈哈哈","xiaookj","made"};
        final int sid[]={R.mipmap.edc,R.mipmap.qaz,R.mipmap.rfv,R.mipmap.wsx,R.mipmap.cadd,R.mipmap.cdde,R.mipmap.cdffs,R.mipmap.dsada};
        List<Map<String,Object>> lists=new ArrayList<Map<String, Object>>();
        for(int i=0;i<names.length;i++)
        {
            Map<String,Object> item=new HashMap<String, Object>();
            item.put("names",names[i]);
            item.put("sid",sid[i]);
            lists.add(item);
        }
        SimpleAdapter setasdapader=new SimpleAdapter(this,lists,R.layout.items,new String[]{"names","sid"},new int[]{R.id.textView,R.id.imageView});
        view2.setAdapter(setasdapader);
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent upactivity=new Intent();
                upactivity.setClass(adapter2.this,adapter1.class);
                startActivity(upactivity);
            }
        });
        view2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ImageView img =  new ImageView(adapter2.this);
                img.setImageResource(sid[i]);
                new  AlertDialog.Builder(adapter2.this)
                        .setTitle(names[i])
                        .setView(img)
                        .setPositiveButton("确定" ,  null )
                        .show();
            }
        });
    }
}
