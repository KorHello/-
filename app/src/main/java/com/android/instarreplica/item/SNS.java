package com.android.instarreplica.item;

import android.widget.ImageView;

public class SNS {

    private String SNS_Title;
    private String SNS_Myinfo;

    private String SNS_Contents;
    private String SNS_Comment;

    private ImageView SNS_Profile;
    private ImageView SNS_Image;

    public SNS(String SNS_Title, String SNS_Myinfo, String SNS_Contents) {
        this.SNS_Title = SNS_Title;
        this.SNS_Myinfo = SNS_Myinfo;
        this.SNS_Contents = SNS_Contents;
    }

    public String getSNS_Title() {
        return SNS_Title;
    }

    public void setSNS_Title(String SNS_Title) {
        this.SNS_Title = SNS_Title;
    }

    public String getSNS_Myinfo() {
        return SNS_Myinfo;
    }

    public void setSNS_Myinfo(String SNS_Myinfo) {
        this.SNS_Myinfo = SNS_Myinfo;
    }

    public String getSNS_Contents() {
        return SNS_Contents;
    }

    public void setSNS_Contents(String SNS_Contents) {
        this.SNS_Contents = SNS_Contents;
    }

    public String getSNS_Comment() {
        return SNS_Comment;
    }

    public void setSNS_Comment(String SNS_Comment) {
        this.SNS_Comment = SNS_Comment;
    }

    public ImageView getSNS_Profile() {
        return SNS_Profile;
    }

    public void setSNS_Profile(ImageView SNS_Profile) {
        this.SNS_Profile = SNS_Profile;
    }

    public ImageView getSNS_Image() {
        return SNS_Image;
    }

    public void setSNS_Image(ImageView SNS_Image) {
        this.SNS_Image = SNS_Image;
    }
}
