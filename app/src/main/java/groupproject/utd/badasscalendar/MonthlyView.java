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
    private TextView monthlyEventTime;
    private TextView monthlyEventDescription;
    private CalendarView monthlyCalendar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monthly_view);

        // Assign references to widgets
        monthlyEventTitle = (TextView) findViewById(R.id.monthlyEventTitle);
        monthlyEventTime = (TextView) findViewById(R.id.monthlyEventTime);
        monthlyEventDescription = (TextView) findViewById(R.id.monthlyEventDescription);
        monthlyCalendar = (CalendarView) findViewById(R.id.monthlyCalendar);

        // Setting listener
        monthlyCalendar.setOnDateChangeListener(this);

        // TODO : Set display to current day
    }

    @Override
    public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth){
        // TODO : Set display to selected event, using method to store locally
    }
}