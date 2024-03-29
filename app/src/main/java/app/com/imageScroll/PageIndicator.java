package app.com.imageScroll;

import android.support.v4.view.ViewPager;


public interface PageIndicator extends ViewPager.OnPageChangeListener {
    
    void setViewPager(ViewPager view);

    
    void setViewPager(ViewPager view, int initialPosition);

    
    void setCurrentItem(int item);

    
    void setOnPageChangeListener(ViewPager.OnPageChangeListener listener);

    
    void notifyDataSetChanged();
    
    
}
