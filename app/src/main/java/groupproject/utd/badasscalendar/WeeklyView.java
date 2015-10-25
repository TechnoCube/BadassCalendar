package groupproject.utd.badasscalendar;

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
import android.widget.ListView;

public class WeeklyView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly_view);

        //Add Button widget to layout
        RelativeLayout weeklyLayout = new RelativeLayout(this);
        Button addEvent = new Button(this);
        weeklyLayout.addView(addEvent);
        setContentView(weeklyLayout);

        addEvent.setText("Add Event");

        String[] dates = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        ListAdapter dateAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,dates  );
        ListView dateListView = (ListView) findViewById(R.id.listView2);
        dateListView.setAdapter(dateAdapter);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        //getSupportActionBar().setTitle("My title");



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
