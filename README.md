# android_viewPagerSlider
slider page sample using PagerAdapter

NOTE:
PagerAdapter is an abstract class so implements unimplemented method
override certain methods
### 
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
    //for layout Inflater
     LayoutInflater layoutInflater= (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View view=layoutInflater.inflate(R.layout.view_pager_layout,container,false);

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
    //to destory
    container.removeView((LinearLayout)object);
