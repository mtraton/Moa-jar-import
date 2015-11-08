package ai.ia.agh.edu.pl.workshop.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("MyActivity", "Before launching experiment");
        setContentView(R.layout.activity_main);
        Experiment exp = new Experiment();
        exp.run(100, true);

    }
}
