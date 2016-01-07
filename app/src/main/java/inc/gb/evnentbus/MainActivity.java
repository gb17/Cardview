package inc.gb.evnentbus;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import de.greenrobot.event.EventBus;

public class MainActivity extends Activity {

    private EventBus bus = EventBus.getDefault();

    private TextView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        view = new TextView(this);

        view.setTextSize(20f);
        view.setPadding(20, 20, 20, 20);
        view.setText("Waiting for events...");

        setContentView(view);

        // Register as a subscriber
        bus.register(this);
    }

    @Override
    protected void onDestroy() {
        // Unregister
        bus.unregister(this);
        super.onDestroy();
    }

}