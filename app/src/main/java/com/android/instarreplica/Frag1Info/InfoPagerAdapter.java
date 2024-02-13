package com.android.instarreplica.Frag1Info;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.android.instarreplica.R;
import com.android.instarreplica.item.Sentence;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class InfoPagerAdapter extends androidx.viewpager.widget.PagerAdapter {
    private Context mContext = null;
    private ArrayList<Sentence> arrayList = new ArrayList<>();

    private TextView tv_Phrase;
    private TextView tv_Maker;

    private ImageView iv_background;

    public InfoPagerAdapter(Context context, ArrayList<Sentence> sentences) {
        this.mContext = context;
        this.arrayList = sentences;
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = null;

        if (mContext != null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.sentence_view, container, false);

            tv_Phrase = (TextView) view.findViewById(R.id.Phrase);
            tv_Maker = (TextView) view.findViewById(R.id.Maker);
            iv_background = (ImageView) view.findViewById(R.id.background);

            //Glide.with(mContext).load(R.drawable.bigsize).into(iv_background);


/*            tv_Phrase.setText("how to page :" + position);
            tv_Phrase.setText(arrayList.get(position).getMsg());*/

            tv_Maker.setText("레아 입니다");

            switch (position) {
                case 0:
                    //Glide.with(mContext).load(R.drawable.back1).into(iv_background);
                   // tv_Phrase.setText("이리와 같이 자볼까?");
                    break;
                case 1:
                    //Glide.with(mContext).load(R.drawable.back2).into(iv_background);
                    //tv_Phrase.setText("레아 출현!");
                    break;
                case 2:
                    //Glide.with(mContext).load(R.drawable.back3).into(iv_background);
                    //tv_Phrase.setText("같이 사진 어때?");
                    break;
                case 3:
                   // Glide.with(mContext).load(R.drawable.back4).into(iv_background);
                    //tv_Phrase.setText("Raya Challenge New Champions");
                    break;
                case 4:
                    //Glide.with(mContext).load(R.drawable.back5).into(iv_background);
                    //tv_Phrase.setText("Happy 할로윈 >.< 또 보자구!");
                    break;
                default:
                    break;
            }
        }

        container.addView(view);

        return view;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (View)object);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

}
