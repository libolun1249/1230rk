package com.bawei.day2_rk;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "{\"result\":[{\"imageUrl\":\"http://172.17.8.100/images/small/banner/cj.png\",\"jumpUrl\":\"http://172.17.8.100/htm/lottery/index.html\",\"rank\":5,\"title\":\"抽奖\"},{\"imageUrl\":\"http://172.17.8.100/images/small/banner/hzp.png\",\"jumpUrl\":\"wd://commodity_list?arg=1001007005\",\"rank\":5,\"title\":\"美妆工具\"},{\"imageUrl\":\"http://172.17.8.100/images/small/banner/lyq.png\",\"jumpUrl\":\"wd://commodity_info?arg=83\",\"rank\":5,\"title\":\"连衣裙\"},{\"imageUrl\":\"http://172.17.8.100/images/small/banner/px.png\",\"jumpUrl\":\"wd://commodity_info?arg=165\",\"rank\":5,\"title\":\"跑鞋\"},{\"imageUrl\":\"http://172.17.8.100/images/small/banner/wy.png\",\"jumpUrl\":\"wd://commodity_list?arg=1001002004\",\"rank\":5,\"title\":\"卫衣\"}],\"message\":\"查询成功\",\"status\":\"0000\"}", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initView() {
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
    }

}
