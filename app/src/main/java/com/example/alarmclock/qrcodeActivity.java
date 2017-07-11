package com.example.alarmclock;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class qrcodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode);
        Button button=(Button)findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                qrcodeActivity.this.finish();

            }
        });
        Button button_3=(Button)findViewById(R.id.button3);
        button_3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent_qrcode_weixin=new Intent(Intent.ACTION_VIEW);
                intent_qrcode_weixin.setData(Uri.parse("https://mp.weixin.qq.com/mp/profile_ext?action=home&__biz=MzUwOTE1MjUzMQ==&scene=124#wechat_redirect"));
                startActivity(intent_qrcode_weixin);
            }
        });
}
}
