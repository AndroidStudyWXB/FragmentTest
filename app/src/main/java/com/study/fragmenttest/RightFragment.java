package com.study.fragmenttest;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by WXB506 on 2016/2/25.
 */
public class RightFragment extends Fragment {

    private String name;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.right_fragment, container, false);
        MainActivity activity = (MainActivity) getActivity();
        this.name = activity.getName();

        return view;
    }


    public String getName() {
        return name;
    }
}
