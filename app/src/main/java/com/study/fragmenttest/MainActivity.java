package com.study.fragmenttest;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/*
** There MainActivity extends ActionBarActivity, the transaction does not function.
** I do not know why
*/
// public class MainActivity extends ActionBarAcitvity implements OnClickListener
public class MainActivity extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                AnotherRightFragment fragment   = new AnotherRightFragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.right_layout, fragment);
                transaction.addToBackStack(null);
                transaction.commit();
                break;

            case R.id.button2:
                RightFragment rightFragment = (RightFragment) getFragmentManager().findFragmentById(R.id.right_fragment);
                Toast.makeText(MainActivity.this, "fuck", Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }
    }
}
