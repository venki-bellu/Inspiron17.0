package uvce.com.inspiron170;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class about_uvce extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_uvce);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
