package groupproject.utd.badasscalendar;

import android.app.Activity;
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

import org.w3c.dom.Text;


public class WeeklyView extends Activity implements AdapterView.OnItemSelectedListener{

    //Drop down list
    Spinner dropDownlist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly_view);

        dropDownlist = (Spinner) findViewById(R.id.Pull_down);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.dropDownlist, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropDownlist.setAdapter(adapter);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView myText = (TextView) view; 
        Toast.makeText(this, "You Selected", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    public void sunButton(View v){
        Button button = (Button) v;
        ((Button) v).setText("click");
    }
}


