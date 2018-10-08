package darylle.baldove.com.baldovedaryllelab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Intent i = new Intent(this, CustomService.class);
        startService(i);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ith", "onStart() has executed ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ith", "onResume() has executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ith", "onStop() has executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ith", "onResume() has executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ith", "onRestart() has executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ith", "onDestroy() has executed");
    }

    public void process2(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnActivityTwo) {
            i = new Intent(this, Activity1.class);
            startActivity(i);
        } else if (v.getId() == R.id.btnMapTwo) {
            i = new Intent(Intent.ACTION_VIEW);
            chooser = Intent.createChooser(i, "Select map app");
            i.setData(Uri.parse("geo:14.574213,120.983926"));
            startActivity(chooser);
        }
    }
}
