package shuvalov.nikita.viewpager_lab;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by NikitaShuvalov on 11/1/16.
 */

public class PictureFragment extends MyFragments {
    private String mTitle= "Picture";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_picture, container, false);
        return v;
    }
    public String getTitle(){
        return mTitle;
    }

}
