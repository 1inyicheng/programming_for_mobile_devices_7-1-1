package com.example.programming_for_mobile_devices_7_1_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void button_Click(View view)
    {
        String[] Steaks = getResources().getStringArray(R.array.steaks);
        Spinner sp = (Spinner) findViewById(R.id.spinner);
        int index = sp.getSelectedItemPosition();
        TextView output = (TextView) findViewById(R.id.lblOutput);
        output.setText("牛排要" + Steaks[index]);
    }
}