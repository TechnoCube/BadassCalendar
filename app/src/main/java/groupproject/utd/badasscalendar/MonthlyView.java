package groupproject.utd.badasscalendar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

/**
 * Monthly view class, displays a monthly calendar,
 * clicking on a day displays the first event of that day
 */

public class MonthlyView extends Activity implements CalendarView.OnDateChangeListener {

    // Widget Variables
    private TextView monthlyEventTitle;
    private TextView monthlyEventDescription;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.MonthlyView);
        // TODO : Draw display, set display to current day
    }

    @Override
    public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth){
        // TODO : Set display to selected event, using method to store locally
    }
}
