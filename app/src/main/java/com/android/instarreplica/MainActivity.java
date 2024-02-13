package com.android.instarreplica;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.icu.text.IDNA;
import android.os.Bundle;

import com.android.instarreplica.Brige.Communication;
import com.android.instarreplica.Frag1Info.InfoPagerAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView; // 바텀 네비게이션 뷰
    private FragmentManager fm;
    private FragmentTransaction ft;
    private Frag1 frag1;
    private Frag2 frag2;
    private Frag3 frag3;
    private Frag4 frag4;
    private Frag5 frag5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigationView = findViewById(R.id.bottomNavi);
        bottomNavigationView.setOnNavigationItemSelectedListener(menuItem -> { // 아이템 아이디 가져오기
            switch (menuItem.getItemId()) {
                case R.id.humen:
                    setFrag(0);
                    break;
                case R.id.add:
                    setFrag(1);
                    break;
                case R.id.star:
                    setFrag(2);
                    break;
                case R.id.work:
                    setFrag(3);
                    break;
                case R.id.setting:
                    setFrag(4);
                    break;
            }
            return true;
        });

        frag1 = new Frag1(this);
        frag2 = new Frag2(this);
        frag3 = new Frag3();
        frag4 = new Frag4();
        frag5 = new Frag5();
        setFrag(0); // 첫 프래그먼트 화면을 무엇으로 지정해줄 것인지 선택.

        Communication.shared.testApi();
    }

    // 프래그먼트 교체가 일어나는 실행문
    private void setFrag(int n) {
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction(); // 실제적인 프래그먼트 교체 이루어지는것
        switch (n) { //총 5개 교체
            case 0:
                ft.replace(R.id.main_frame, frag1);
                ft.commit();
                break;
            case 1:
                ft.replace(R.id.main_frame, frag2);
                ft.commit();
                break;
            case 2:
                ft.replace(R.id.main_frame, frag3);
                ft.commit();
                break;
            case 3:
                ft.replace(R.id.main_frame, frag4);
                ft.commit();
                break;
            case 4:
                ft.replace(R.id.main_frame, frag5);
                ft.commit();
                break;
        }
    }

}
