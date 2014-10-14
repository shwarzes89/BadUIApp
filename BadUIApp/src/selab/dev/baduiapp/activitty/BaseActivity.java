package selab.dev.baduiapp.activitty;

import android.app.Activity;
import android.os.Bundle;

import java.util.List;

/**
 * Created by makyungjae on 2014. 10. 14..
 */
public abstract class BaseActivity extends Activity {

    protected MissionMonitor missionMonitor;
    protected List<Object> expectedValue;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        expectedValue = makeExpectValue();
        missionMonitor = new MissionMonitor(expectedValue);

        setDestination();
    }

    protected abstract void setDestination();

    protected abstract List<Object> makeExpectValue();
}