package git.cn.testgit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * 修改文件
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvTest = (TextView) findViewById(R.id.tvTest);
        tvTest.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            // 土司
            case R.id.tvTest:
                break;
        }
    }
}
