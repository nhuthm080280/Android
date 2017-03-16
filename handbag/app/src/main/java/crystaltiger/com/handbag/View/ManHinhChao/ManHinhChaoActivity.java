package crystaltiger.com.handbag.View.ManHinhChao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import crystaltiger.com.handbag.R;
import crystaltiger.com.handbag.View.TrangChu.TrangChuActivity;

public class ManHinhChaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_chao);

        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                }
                catch (Exception e){

                }
                finally {
                    Intent iTrangChu = new Intent(ManHinhChaoActivity.this, TrangChuActivity.class);
                    startActivity(iTrangChu);
                }
            }
        });

        thread.start();
    }
}
