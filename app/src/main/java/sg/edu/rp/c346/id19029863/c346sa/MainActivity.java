package sg.edu.rp.c346.id19029863.c346sa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Github, view, Apple, Samsung, Huawei, Oppo, Xiaomi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Github = findViewById(R.id.GITHUB);
        view = findViewById(R.id.View);
        Apple = findViewById(R.id.AppleWeb);
        Samsung = findViewById(R.id.SamsungWeb);
        Huawei = findViewById(R.id.HuaweiWeb);
        Oppo = findViewById(R.id.OppoWeb);
        Xiaomi = findViewById(R.id.XiaoMiWeb);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ItemListActivity.class);
                startActivity(intent);
            }
        });

        Github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.github)));
                startActivity(intent);
            }
        });

        Apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.Apple)));
                startActivity(intent);
            }
        });

        Samsung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.Samsung)));
                startActivity(intent);
            }
        });

        Huawei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.Huawei)));
                startActivity(intent);
            }
        });

        Oppo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.Oppo)));
                startActivity(intent);
            }
        });

        Xiaomi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.Xiaomi)));
                startActivity(intent);
            }
        });
    }
}