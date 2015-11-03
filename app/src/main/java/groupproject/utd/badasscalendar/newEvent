package groupproject.utd.badasscalendar;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class newEvent extends AppCompatActivity {

    //string used to persist New event information
    static String eventInfo;
    static String startDateString;
    static String endDateString;
    static String startTimeString;
    static String endTimeString;
    static String evenName;
    static String locationName;

    //flag selects start date/ start time or end date/ end time
    static int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_event);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        //when the floating button is click the event information is stored in eventInfo
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText eName = (EditText) findViewById(R.id.EventName);
                EditText lName = (EditText) findViewById(R.id.Location);
                evenName = eName.getText().toString();
                locationName = lName.getText().toString();
                String fileName = "calendar";
                eventInfo = ("Event Name: " + evenName + "\n Location Name: " + locationName + "\n Start Date: " + startDateString +
                        "\n End Date: " + endDateString + "\n Start Time: " + startTimeString + "\n End Time: " + endTimeString);
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText(eventInfo);
                FileOutputStream outputStream;

                try {
                    outputStream = openFileOutput(fileName, Context.MODE_PRIVATE);
                    outputStream.write(eventInfo.getBytes());
                    outputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }


                //Intent i = new Intent(newEvent.this, MainActivity.class);
                //startActivity(i);


            }
        });
    }

    public static class TimePickerFragment extends DialogFragment
            implements TimePickerDialog.OnTimeSetListener {

        static Calendar c = Calendar.getInstance();
        @Override


        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current time as the default values for the picker

            int hour = c.get(Calendar.HOUR_OF_DAY);
            int minute = c.get(Calendar.MINUTE);

            // Create a new instance of TimePickerDialog and return it
            return new TimePickerDialog(getActivity(), this, hour, minute,
                    DateFormat.is24HourFormat(getActivity()));
        }

        //when the time is set the info is passed to the string startTimeString or endTimeString
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            // Do something with the time chosen by the user
            Calendar c = Calendar.getInstance();
            c.set(hourOfDay, minute);

            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            if(flag == 0)
            {
                startTimeString= sdf.format(c.getTime());
            }
            else
            {
                endTimeString = sdf.format(c.getTime());
            }

        }
    }
    //when the button Start_Time is clicked the timepicker is generated
    public void showTimePickerDialog(View v) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), "timePicker");
        flag = 0;
    }

    //when the button End_Time is clicked the timepicker is generated
    public void showTimePickerDialog1(View v) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), "timePicker");
        flag = 1;
    }




    public static class DatePickerFragment extends DialogFragment
            implements DatePickerDialog.OnDateSetListener {


        static Calendar c = Calendar.getInstance();

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current date as the default date in the picker
            //final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            // Create a new instance of DatePickerDialog and return it
            return new DatePickerDialog(getActivity(), this, year, month, day);

        }

        //when the time is set the info is passed to the string startDateString or endDateString
        public void onDateSet(DatePicker view, int year, int month, int day) {
            // Do something with the date chosen by the user

            Calendar c = Calendar.getInstance();
            c.set(year, month, day);

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            if(flag == 0) {
                startDateString = sdf.format(c.getTime());
            }
            else
            {
                endDateString = sdf.format(c.getTime());
            }

        }
    }

    //when the button Start_Date is clicked the Datepicker is generated
    public void showDatePickerDialog(View v) {
        DatePickerFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
        flag = 0;
    }

    //when the button End_Date is clicked the Datepicker is generated
    public void showDatePickerDialog1 (View v) {
        DatePickerFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
        flag = 1;
    }






}
