package app.com.viewpagertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.demono.AutoScrollViewPager;

import java.util.ArrayList;
import java.util.List;

import app.com.imageScroll.CirclePageIndicator;

public class MainActivity extends AppCompatActivity {
    AutoScrollViewPager mViewPager;
    List<String> data;
    CirclePageIndicator indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        indicator = findViewById(R.id.indicator);

        data = new ArrayList<>();
        data.add("ABCD");
        data.add("EFGH");
        data.add("HIJK");
        data.add("LMNO");
        data.add("PQRS");
        data.add("TUVW");
        data.add("XYZ");
        AutoScrollViewPager mViewPager = findViewById(R.id.viewPager);
        mViewPager.setClipToPadding(false);
        mViewPager.setPadding(40, 0, 40, 0);
        mViewPager.setPageMargin(20);
        MyAdapter mAdapter = new MyAdapter(data, MainActivity.this);

        mViewPager.setAdapter(mAdapter);


        // optional start auto scroll
        mViewPager.startAutoScroll();
    }
}
