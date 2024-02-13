package com.android.instarreplica.Frag2SNS;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.instarreplica.R;
import com.android.instarreplica.item.SNS;

import java.util.ArrayList;

/**
 * <RecyclerView.ViewHolder> -> 아답터 내부에서 쓸 뷰 홀더 클래스,
 * 보통 한개로 받지만 ( 한개만 쓰기 때문에 ) 여러개를 받게되면 공통클래스인 RecyclerView.Viewholder 로 선언
 * 그 이유는, extends 를 RecyclerView.ViewHolder 로 받기 때문, 부모뷰이기 때문, 그래야지만이 다중클래스 사용이 가능
 */
public class SnsPageAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext = null;
    private ArrayList<SNS> SnsData = new ArrayList<>();

    public SnsPageAdapter(Context mContext, ArrayList<SNS> SnsData) {
        this.mContext = mContext;
        this.SnsData = SnsData;
    }
    
    public class SnsHolder extends RecyclerView.ViewHolder {

        ImageView iv_SnsProfile;
        TextView tv_SnsNickName, tv_SnsMyinfo;
        ImageView iv_DrawerMenu;

        TextView et_SnsContents;
        ImageView iv_SnsImage;

        ImageView iv_SnsLikey, iv_SnsSharing;

        public SnsHolder(@NonNull View itemView) {
            super(itemView);

            iv_SnsProfile = itemView.findViewById(R.id.SnsProfile);
            tv_SnsNickName = itemView.findViewById(R.id.SnsNickName);
            tv_SnsMyinfo = itemView.findViewById(R.id.SnsMyinfo);
            iv_DrawerMenu = itemView.findViewById(R.id.DrawerMenu);

            et_SnsContents = itemView.findViewById(R.id.SnsContents);
            iv_SnsImage = itemView.findViewById(R.id.SnsImage);

            iv_SnsLikey = itemView.findViewById(R.id.SnsLikey);
            iv_SnsSharing = itemView.findViewById(R.id.SnsSharing);
        }
    }

    // 생성 홀더
    public class CreateHolder extends RecyclerView.ViewHolder {
        EditText et_SnsCreateContents;

        Spinner sn_SnsCreateDisclosure;
        ImageView iv_SnsCreateGallery;

        ArrayAdapter Disclosure = ArrayAdapter.createFromResource(mContext, R.array.disclosure_Array, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);



        public CreateHolder(@NonNull View itemView) {
            super(itemView);

            et_SnsCreateContents = (EditText) itemView.findViewById(R.id.SnsCreateContents);
            sn_SnsCreateDisclosure = (Spinner) itemView.findViewById(R.id.SnsCreateDisclosure);
            //iv_SnsCreateGallery = (ImageView) itemView.findViewById(R.id.SnsCreateGallery);

            sn_SnsCreateDisclosure.setAdapter(Disclosure);

        }
    }

    /**
     * RecyclerView.ViewHolder 을 공통 리턴 받고 있음, 부모 클래스가 RecyclerView.ViewHolder 로 되어있다면 뷰타입 따라 무제한 리턴가능
     * @param parent
     * @param viewType
     * @return
     */
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context mContext = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        
        // 뷰타입에 따라 홀더 다르게 넘김
        // 레이아웃 인플 공통으로 사용중, 하나 가져다가 레이아웃 가져오고 있음
        if(viewType == 0) {
            View view = inflater.inflate(R.layout.snsfuntion_bulletin,parent,false);
            SnsPageAdapter.SnsHolder vh = new SnsPageAdapter.SnsHolder(view);

            return vh;
        }

        View view = inflater.inflate(R.layout.snsfuntion_create,parent,false);
        SnsPageAdapter.CreateHolder vh = new SnsPageAdapter.CreateHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(position > 0) {
            // 게시글 홀더
            SnsHolder snsHolder = (SnsHolder) holder;
            snsHolder.tv_SnsNickName.setText("유저 닉네임");
            snsHolder.tv_SnsMyinfo.setText("유저 상태메세지");
            snsHolder.et_SnsContents.setText("유저 게시글 " + String.valueOf(position));
        } else {
            //CreateHolder
            CreateHolder createHolder = (CreateHolder) holder;
            createHolder.et_SnsCreateContents.setText("내용을 적어주세요");


        }
    }

//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//
//        holder.tv_SnsNickName.setText("사용자 이름");
//        holder.tv_SnsMyinfo.setText("사용자 정보");
//        holder.et_SnsContents.setText("오늘 당신의 하루는 어떠신가요?");
//
//    }

    @Override
    public int getItemCount() {
        return SnsData.size() + 1; // 쓰기뷰가 있기 때문임
    }

    /**
     * 뷰타입 지정클래스
     * @param position
     * @return
     */
    @Override
    public int getItemViewType(int position) {
        if(position == 0) {
            return 1;
        }

        return 0;
    }



}
