package com.etom.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import shop.etom.com.etomshop.R;


public class HomeFragment extends Fragment {
    private SliderLayout msliderlayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        msliderlayout = (SliderLayout) view.findViewById(R.id.slider);
        initSlider();
        return view;

    }

    private void initSlider() {
        TextSliderView textslidview = new TextSliderView(this.getActivity());
        textslidview
                .description("超级赞")
                .image("http://images.boomsbeat.com/data/images/full/19640/game-of-thrones-season-4-jpg.jpg");

        msliderlayout.addSlider(textslidview);

        TextSliderView textslidview2 = new TextSliderView(this.getActivity());
        textslidview2
                .description("好棒棒")
                .image("http://static2.hypable.com/wp-content/uploads/2013/12/hannibal-season-2-release-date.jpg");

        msliderlayout.addSlider(textslidview2);

        TextSliderView textslidview3 = new TextSliderView(this.getActivity());
        textslidview3
                .description("真得好赞")
                .image("http://tvfiles.alphacoders.com/100/hdclearart-10.png");

        msliderlayout.addSlider(textslidview3);
    }


}