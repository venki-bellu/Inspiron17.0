package uvce.com.inspiron170;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.view.View;
import android.widget.Toast;

public class gallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        GridView gridview = (GridView) findViewById(R.id.gridview);

        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(gallery.this, "" + position, Toast.LENGTH_SHORT).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
