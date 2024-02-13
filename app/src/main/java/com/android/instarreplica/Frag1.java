package com.android.instarreplica;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.android.instarreplica.Frag1Info.InfoPagerAdapter;
import com.android.instarreplica.item.Sentence;

import java.util.ArrayList;

public class Frag1 extends Fragment {
    private View view;

    private Context mContext;
    private ViewPager viewPager;
    private InfoPagerAdapter pagerAdapter;

    public Frag1(Context context) {
        this.mContext = context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag1, container, false);

        ArrayList<Sentence> sentences = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            Sentence sentence = new Sentence("타이틀" + i, "생성자 " + i, i, i);
            sentences.add(sentence);
        }

        viewPager = (ViewPager) view.findViewById(R.id.ViewPager);
        InfoPagerAdapter pagerAdapter = new InfoPagerAdapter(mContext, sentences);
        viewPager.setAdapter(pagerAdapter);

        return view;
    }
}
