package inc.gb.evnentbus;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by admin on 12/10/15.
 */
public class FragmentControl extends Fragment {

    int[] images = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f};
    String[] names = {"Shubham Yadav", "Nikhil Katekhaye", "Gaurav Bhoyar", "Ashwin Shetty", "Sudhir Singh", "Onkar Tannirwar"};
    String[] dobs = {"31-10-1990", "28-09-1990", "17-05-1991", "28-02-1990", "20-12-1990", "14-11-1990"};
    String[] heights = {"5' 6''", "6' 3''", "5' 8''", "6' 0''", "5' 7''", "5' 5''"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        int pos = getArguments().getInt("current_page");

        LinearLayout view = (LinearLayout) inflater.inflate(R.layout.feedback, null);
          ImageView image = (ImageView) view.findViewById(R.id.image);
        TextView name = (TextView) view.findViewById(R.id.name);
        TextView dob = (TextView) view.findViewById(R.id.dob);
        TextView height = (TextView) view.findViewById(R.id.height);
        TextView org = (TextView) view.findViewById(R.id.org);

        image.setImageResource(images[pos]);
        name.setText(names[pos]);
        dob.setText(dobs[pos]);
        height.setText(heights[pos]);

        return view;
    }
}
