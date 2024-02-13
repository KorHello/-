package com.android.instarreplica;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.android.instarreplica.Frag5Setting.SettingsChangePassword;
import com.android.instarreplica.Frag5Setting.SettingsModify;

public class Frag5 extends Fragment {
    private View view;

    private Button bt_SettingAccountInformation;
    private Button bt_SettingPasswordChange;

    private ImageView iv_SettingProfile;
    private TextView tv_SettingNickName;

    private TextView tv_Settingfollow, tv_Settingfollowers;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag5, container, false);

        iv_SettingProfile = (ImageView) view.findViewById(R.id.SettingProfile);
        tv_SettingNickName = (TextView) view.findViewById(R.id.SettingNickName);

        tv_Settingfollow = (TextView) view.findViewById(R.id.Settingfollow);
        tv_Settingfollowers = (TextView) view.findViewById(R.id.Settingfollowers);

        bt_SettingAccountInformation = (Button) view.findViewById(R.id.SettingAccountInformation);
        bt_SettingPasswordChange = (Button) view.findViewById(R.id.SettingPasswordChange);

        bt_SettingAccountInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SettingsModify.class);
                startActivity(intent);
            }
        });

        bt_SettingPasswordChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SettingsChangePassword.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
