package inc.gb.evnentbus;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by admin on 12/10/15.
 */
public class CardViewClass extends AppCompatActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.page_swipe);
        viewPager = (ViewPager) findViewById(R.id.pager);
        FragmentManager manager = getSupportFragmentManager();
        viewPager.setAdapter(new PagerAdapter(manager));
        viewPager.setCurrentItem(0);
    }
}
