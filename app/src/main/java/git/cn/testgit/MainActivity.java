package git.cn.testgit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 首页
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvTest;
    private Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvTest = (TextView) findViewById(R.id.tvTest);
        tvTest.setOnClickListener(this);

        btnShow = (Button) findViewById(R.id.btnShow);
        btnShow.setOnClickListener(this);
    }

    /**
     * 第一版只有显示
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            // 土司
            case R.id.tvTest:
                break;

            case R.id.btnShow:
                Toast.makeText(this, "jksdjfkdL,", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    /**
     * 这是第三版的功能
     */
    private void hah() {
        // 继续开发，第三版
    }

}
