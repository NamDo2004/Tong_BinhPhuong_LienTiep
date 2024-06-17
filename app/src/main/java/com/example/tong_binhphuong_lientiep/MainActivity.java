package com.example.tong_binhphuong_lientiep;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btnTinh;
    private EditText edt_a, edt_b, edt_KQ;
    private void findviews(){
        btnTinh = findViewById(R.id.btnTinh);
        edt_a = findViewById(R.id.edt_a);
        edt_b = findViewById(R.id.edt_b);
        edt_KQ = findViewById(R.id.edt_KQ);
    }
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
        findviews();
        edt_KQ.setEnabled(false);

        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(edt_a.getText().toString());
                int b = Integer.parseInt(edt_b.getText().toString());
                int s = 0;

                for(int i=a; i<=b; i++){
                    s += Math.pow(i,2);
                }
                edt_KQ.setText(String.valueOf(s));
            }
        });
    }
}