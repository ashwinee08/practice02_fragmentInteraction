package com.example.revisionjuly2019;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.revisionjuly2019.fragments.BottomFragment;
import com.example.revisionjuly2019.fragments.TopFragment;

public class MainActivity extends AppCompatActivity implements BackToMainCallback{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }



    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }



    @Override
    protected void onRestart() {
        super.onRestart();
    }


    @Override
    public void sendingDataToMain(int id) {
        Bundle bundle=new Bundle();
        bundle.putInt("pictureId",id);
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        TopFragment topFragmentInstance=new TopFragment();
        topFragmentInstance.setArguments(bundle);
        transaction.replace(R.id.top_fragment,topFragmentInstance);
        transaction.commit();
    }
}

