package com.example.fragmetsuper.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmetsuper.R;
import com.example.fragmetsuper.fragmentcafe.FragmentTabAdapter;
import com.google.android.material.tabs.TabLayout;


public class FragmentCafe extends Fragment {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private View mView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mView= inflater.inflate(R.layout.fragment_cafe, container,
                false);
        tabLayout=mView.findViewById(R.id.tab);
        viewPager=mView.findViewById(R.id.viewTab);
        FragmentTabAdapter adapter=new FragmentTabAdapter(getChildFragmentManager(),3);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        return mView;
    }
}