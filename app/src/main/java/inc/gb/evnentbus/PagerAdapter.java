package inc.gb.evnentbus;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by admin on 12/10/15.
 */
public class PagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 6;

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        FragmentControl myFragment = new FragmentControl();
        Bundle data = new Bundle();
        data.putInt("current_page", position);
        myFragment.setArguments(data);
        return myFragment;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
