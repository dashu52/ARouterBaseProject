package cruzr.ubtechinc.com.testrouter;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import com.base.commonlib.animation.AnimationType;
import com.base.commonlib.utils.AnimationUtil;
import com.base.commonlib.utils.SnackbarUtil;
import com.base.commonlib.utils.StatusBarUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = (TextView)findViewById(R.id.text1);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StatusBarUtil.StatusBarLightMode(MainActivity.this);
            }
        });

    }
}
