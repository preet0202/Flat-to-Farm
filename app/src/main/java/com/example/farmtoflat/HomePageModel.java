package com.example.farmtoflat;

import java.util.List;

public class HomePageModel {

    public static final int BANNER_SLIDER = 0;
    public static final int HORIZONTAL_PRODUCT_VIEW = 2;
    public static final int GRID_PRODUCT_VIEW = 3;
    private int type;

    /// banner slider
    private List<SliderModel> mSliderModelList;
    public HomePageModel(int type, List<SliderModel> sliderModelList) {
        this.type = type;
        mSliderModelList = sliderModelList;
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public List<SliderModel> getSliderModelList() {
        return mSliderModelList;
    }
    public void setSliderModelList(List<SliderModel> sliderModelList) {
        mSliderModelList = sliderModelList;
    }
    /// banner slider

    /////horizontal product layout && grid produvt layout
    private String title;
    private List<HorizontalProductScrollModel_today> mHorizontalProductScrollModel_todayList;
    public HomePageModel(int type, String title, List<HorizontalProductScrollModel_today> horizontalProductScrollModel_todayList) {
        this.type = type;
        this.title = title;
        mHorizontalProductScrollModel_todayList = horizontalProductScrollModel_todayList;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public List<HorizontalProductScrollModel_today> getHorizontalProductScrollModel_todayList() {
        return mHorizontalProductScrollModel_todayList;
    }
    public void setHorizontalProductScrollModel_todayList(List<HorizontalProductScrollModel_today> horizontalProductScrollModel_todayList) {
        mHorizontalProductScrollModel_todayList = horizontalProductScrollModel_todayList;
    }
    /////horizontal product layout && grid produvt layout

    ////Grid view

}