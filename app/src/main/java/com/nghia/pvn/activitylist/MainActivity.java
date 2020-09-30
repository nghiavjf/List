package com.nghia.pvn.activitylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.sql.ClientInfoStatus;


public class MainActivity extends AppCompatActivity {
    private ListView listv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] items={"Hoa Hải Đường","Bông Hoa Đẹp Nhất","Bỏ Lở Một Người","Đánh Mất Em","Hai Chữ Đã Từng"};

        listv=(ListView)findViewById(R.id.lv);

        Adapter adapter = new Adapter(this,items);
        listv.setAdapter(adapter);
    }
}