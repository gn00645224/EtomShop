package com.etom.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Toast;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.DefaultSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;

import shop.etom.com.etomshop.R;


/**
 * Created by gn006 on 16/8/15.
 */
public class HomeFragment extends Fragment {


    private SliderLayout mSliderLayout;

    //    private PagerIndicator  indicator;
    private WebView webview;

    private String url="www.baidu.com";
    private RecyclerView mRecyclerView;

    //private HomeCatgoryAdapter mAdatper;


    private static  final  String TAG="HomeFragment";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_home,container,false);
        mSliderLayout = (SliderLayout) view.findViewById(R.id.slider);

//        indicator= (PagerIndicator) view.findViewById(R.id.custom_indicator);


        initSlider();


        initRecyclerView(view);

        return  view;
    }

    private void initRecyclerView(View view) {

        // mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);

        //List<HomeCategory> datas = new ArrayList<>(15);

//        HomeCategory category = new HomeCategory("热门活动",R.drawable.img_big_1,R.drawable.img_1_small1,R.drawable.img_1_small2);
//        datas.add(category);
//
//        category = new HomeCategory("有利可图",R.drawable.img_big_4,R.drawable.img_4_small1,R.drawable.img_4_small2);
//        datas.add(category);
//        category = new HomeCategory("品牌街",R.drawable.img_big_2,R.drawable.img_2_small1,R.drawable.img_2_small2);
//        datas.add(category);
//
//        category = new HomeCategory("金融街 包赚翻",R.drawable.img_big_1,R.drawable.img_3_small1,R.drawable.imag_3_small2);
//        datas.add(category);
//
//        category = new HomeCategory("超值购",R.drawable.img_big_0,R.drawable.img_0_small1,R.drawable.img_0_small2);
//        datas.add(category);
//
//
//        mAdatper = new HomeCatgoryAdapter(datas);
//
//        mRecyclerView.setAdapter(mAdatper);
//
//        mRecyclerView.addItemDecoration(new DividerItemDecortion());
//
//        mRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));

    }


    private void initSlider(){



        DefaultSliderView textSliderView = new DefaultSliderView(this.getActivity());
        textSliderView.image("http://m.360buyimg.com/mobilecms/s480x180_jfs/t2278/35/409524152/232719/1d29f7a9/56078dbfNae4f16a3.jpg");
        textSliderView.description("超杀");
        textSliderView.setScaleType(BaseSliderView.ScaleType.Fit);
        textSliderView.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView slider) {
                Toast.makeText(HomeFragment.this.getActivity(), "新品推荐", Toast.LENGTH_LONG).show();
//                String url2= slider.getUrl();
//                url2=url;
//
//                Log.i("url",url2+"111111111111");

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.360buyimg.com/mobilecms/s480x180_jfs/t2278/35/409524152/232719/1d29f7a9/56078dbfNae4f16a3.jpg"));
                startActivity(browserIntent);
            }
        });



        DefaultSliderView textSliderView2 = new DefaultSliderView(this.getActivity());
        textSliderView2.image("http://m.360buyimg.com/mobilecms/s480x180_jfs/t2071/116/426908452/111248/3e6d388c/5608a437N723ee2ba.jpg");
        textSliderView2.description("bbbb");
        textSliderView2.setScaleType(BaseSliderView.ScaleType.Fit);
        textSliderView2.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView slider) {
                Toast.makeText(HomeFragment.this.getActivity(), "R品推荐", Toast.LENGTH_LONG).show();
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.360buyimg.com/mobilecms/s480x180_jfs/t2071/116/426908452/111248/3e6d388c/5608a437N723ee2ba.jpg"));
                startActivity(browserIntent);
            }
        });



        DefaultSliderView textSliderView3 = new DefaultSliderView(this.getActivity());
        textSliderView3.image("http://m.360buyimg.com/mobilecms/s480x180_jfs/t2113/230/413819408/114393/d8a62616/56078bacN9c9c6dc8.jpg");
        textSliderView3.description("秒杀");
        textSliderView3.setScaleType(BaseSliderView.ScaleType.Fit);
        textSliderView3.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView slider) {
                Toast.makeText(HomeFragment.this.getActivity(),"A货推荐",Toast.LENGTH_LONG).show();
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.360buyimg.com/mobilecms/s480x180_jfs/t2113/230/413819408/114393/d8a62616/56078bacN9c9c6dc8.jpg"));
                startActivity(browserIntent);
            }
        });



        mSliderLayout.addSlider(textSliderView);
        mSliderLayout.addSlider(textSliderView2);
        mSliderLayout.addSlider(textSliderView3);


        mSliderLayout.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);

//        mSliderLayout.setCustomIndicator(indicator);
        mSliderLayout.setCustomAnimation(new DescriptionAnimation());
        mSliderLayout.setPresetTransformer(SliderLayout.Transformer.RotateUp);
        mSliderLayout.setDuration(3000);



        mSliderLayout.addOnPageChangeListener(new ViewPagerEx.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {


                Log.d(TAG,"onPageScrolled");

            }

            @Override
            public void onPageSelected(int i) {

                Log.d(TAG,"onPageSelected");
            }

            @Override
            public void onPageScrollStateChanged(int i) {

                Log.d(TAG,"onPageScrollStateChanged");
            }
        });

    }


    @Override
    public void onDestroy() {
        super.onDestroy();

        mSliderLayout.stopAutoCycle();
    }
}
