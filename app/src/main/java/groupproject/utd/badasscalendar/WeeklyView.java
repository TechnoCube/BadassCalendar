/*
    Coder: Herny Kim
    Date : Nov 4, 2015
*/

package groupproject.utd.badasscalendar;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.CalendarView;
import android.widget.Spinner;
import android.widget.TextView;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.widget.Toast;
import android.util.Log;


import org.w3c.dom.Text;


public class WeeklyView extends Activity {

    private static final String TAG = WeeklyView.class.getSimpleName();

    //Drop down list
    Spinner dropDownlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly_view);

        //Drop down list
        dropDownlist = (Spinner) findViewById(R.id.Pull_down);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.dropDownlist, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropDownlist.setAdapter(adapter);
        dropDownlist.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position > 0) {
                    //AgendaView
                    if (position == 1) {
                        Intent i = new Intent(WeeklyView.this, MainActivity.class);
                        startActivity(i);
                        Log.d(TAG, "Position is 0");
                    }
                    //DailyView
                    if (position == 2) {
                        Intent i = new Intent(WeeklyView.this, MainActivity.class);
                        startActivity(i);
                        Log.d(TAG, "Position is 1");
                    }
                    //WeeklyView
                    if (position == 3) {
                        Intent i = new Intent(WeeklyView.this, WeeklyView.class);
                        startActivity(i);
                        Log.d(TAG, "Position is 2");
                    }
                    //MonthlyView
                    if (position == 4) {
                        Intent i = new Intent(WeeklyView.this, MainActivity.class);
                        startActivity(i);
                        Log.d(TAG, "Position is 3");
                    }
                }
                else {
                    Toast.makeText(getApplicationContext(), "Weekly View", Toast.LENGTH_LONG).show();
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }



    //Sunday's button
    public void sunButton(View v){
        /*
         Open daily view of that day
         */
        Button button = (Button) v;
        //((Button) v).setText("click");
    }

    //Monday's button
    public void monButton(View v){
        /*
        Open daily view of that day
        */
    }

    //Tuesday's button
    public void tueButton(View v){
        /*
        Open daily view of that day
        */
    }

    //Wednesday's button
    public void wedButton(View v){
        /*
        Open daily view of that day
        */
    }

    //Thursday's button
    public void thuButton(View v){
        /*
        Open daily view of that day
        */
    }

    //Friday's button
    public void friButton(View v){
        /*
        Open daily view of that day
        */
    }

    //Saturday's button
    public void satButton(View v){
        /*
        Open daily view of that day
        */
    }


}


