package com.android.instarreplica;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.instarreplica.Frag2SNS.SnsPageAdapter;
import com.android.instarreplica.item.SNS;

import java.util.ArrayList;

public class Frag2 extends Fragment {
    private View view;
    private Context mContext;

    public Frag2(Context context) {
        this.mContext = context;
    }
    private Boolean showLayout = true;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag2, container, false);

        ArrayList<SNS> SNSData = new ArrayList<>();

        for ( int i =0; i < 6; i++){
            SNS SNSdata = new SNS("사용자 이름","사용자 정보","반가워요");
            SNSData.add(SNSdata);
        }

        RecyclerView recyclerView = view.findViewById(R.id.SNSFunction);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext));

        SnsPageAdapter adapter = new SnsPageAdapter(mContext, SNSData);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
