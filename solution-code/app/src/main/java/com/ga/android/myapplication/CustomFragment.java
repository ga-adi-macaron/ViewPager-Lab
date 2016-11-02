package com.ga.android.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by alanjcaceres on 7/22/16.
 */
public class CustomFragment extends Fragment {

    //Constants
    public static final String FRAGMENT_POSITION = "fragment_position";
    public static final String IMAGE_RES_ID = "image_src";
    public static final String TEXT_STRING = "text_string";

    //Variables
    private int mFragmentPosition = 0;
    private int mImageResourceId;
    private String mTextString = "";

    //Views
    private ImageView imageView;
    private TextView infoText;


    public static Fragment newInstance(@NonNull Bundle bundle){
        Fragment fragment = new CustomFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view;
        switch (mFragmentPosition){
            case 0:
                view = inflater.inflate(R.layout.fragment_image, container, false);
                imageView = (ImageView) view.findViewById(R.id.imageview_image);
                imageView.setImageResource(mImageResourceId);
                return view;
            /* Because case 1 and case 2 are perform the same task and there are no other
                cases we need to consider, I set this to be the default case.
             */
            default:
                view = inflater.inflate(R.layout.fragment_text, container, false);
                infoText = (TextView) view.findViewById(R.id.textview_text);
                return view;
        }
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        switch (mFragmentPosition){
            case 0:
                imageView.setImageResource(mImageResourceId);
                break;
            /* Again, because case 1 and case 2 perform the same task and we do not have any
                other cases to consider, I set this to be the default case.
             */
            default:
                infoText.setText(mTextString);
                break;
        }

    }


    /* This is where I am assigning the values that we are expecting to be
        passed in the arguments Bundle. Don't have to do it this way.
     */
    @Override
    public void setArguments(Bundle args) {
        super.setArguments(args);

        if(args != null) {
            mFragmentPosition = args.getInt(FRAGMENT_POSITION, 0);
            mImageResourceId = args.getInt(IMAGE_RES_ID, android.R.drawable.ic_dialog_alert);
            mTextString = args.getString(TEXT_STRING, "You forgot something");
        }
    }
}
