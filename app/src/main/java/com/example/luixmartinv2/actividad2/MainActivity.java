package com.example.luixmartinv2.actividad2;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView TextView1;
    public TextView TextView2;
    public long ini;
    public long mid;
    public long fin;
    public long t1, t2, t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView1 = (TextView) this.findViewById(R.id.textView1);
        TextView2 = (TextView) this.findViewById(R.id.textView2);
        t1 = ( ini=System.currentTimeMillis());


    }

    @Override
    protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_main);

        t2 = (mid=(System.currentTimeMillis() - ini));
    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);
        fin= t1 +t2;
        t3= (System.currentTimeMillis()-fin);
    }
}

