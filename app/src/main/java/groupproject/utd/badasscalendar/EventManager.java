package groupproject.utd.badasscalendar;

import java.util.Date;

/**
 * Emergency alternative to SQL Database or Content Manager.
 * Utilizes a linked list to store events when the app runs,
 * and writes to a file when the app closes.
 * DO NOT INSTANTIATE, ONLY USE STATIC METHODS.
 */
abstract class EventManager {

}

/**
 * Event object to be stored in EventManager's linked list.
 * May instantiate elsewhere if needed.
 * Warning: Uses deprecated date methods.
 */
class Event {
    private Date eventTime;
    private String eventTitle;
    private String eventDescription;

    // Default Constructor
    public Event() {
        // Set Date and String objects to default values
        eventTime = new Date();
        eventTitle = new String();
        eventDescription = new String();
    }

    // Copy Constructor
    public Event(Event original) {
        // Copy values from given Event object
        this.eventTime = original.eventTime;
        this.eventTitle = original.eventTitle;
        this.eventDescription = original.eventDescription;
    }

    // Initial Date Object Complete Constructor
    public Event(Date initialTime, String initialTitle, String initialDescription) {
        // Assign all values to fields
        eventTime = initialTime;
        eventTitle = initialTitle;
        eventDescription = initialDescription;
    }

    // Initial Date Object Partial Constructor
    public Event(Date initialTime) {
        // Call complete constructor using defaults for missing values
        this(initialTime, new String(), new String());
    }

    // Initial Title and Description Partial Constructor
    public Event(String initialTitle, String initialDescription) {
        // Call complete constructor using defaults for missing values
        this(new Date(), initialTitle, initialDescription);
    }

    // Initial Date as Strings Constructor
    public Event(String year, String month, String day, String hour, String minute) {
        // Call set method and use defaults for title and description
        setTime(year, month, day, hour, minute);
        eventTitle = new String();
        eventDescription = new String();
    }

    // Get Date Method
    public Date getTime() {
        // Return date object
        return eventTime;
    }

    // Get Year String Method
    public String getYear() {
        // Use deprecated date method to obtain year
        Integer numericYear;
        numericYear = eventTime.getYear() + 1900;
        return numericYear.toString();
    }

    // Get Month String Method
    public String getMonth() {
        // Use deprecated date method to obtain month
        int numericMonth;
        String stringMonth;
        numericMonth = eventTime.getMonth();

        // Switch to set month value
        switch(numericMonth) {
            case 0:
                stringMonth = "January";
                break;
            case 1:
                stringMonth = "February";
                break;
            case 2:
                stringMonth = "March";
                break;
            case 3:
                stringMonth = "April";
                break;
            case 4:
                stringMonth = "May";
                break;
            case 5:
                stringMonth = "June";
                break;
            case 6:
                stringMonth = "July";
                break;
            case 7:
                stringMonth = "August";
                break;
            case 8:
                stringMonth = "September";
                break;
            case 9:
                stringMonth = "October";
                break;
            case 10:
                stringMonth = "November";
                break;
            case 11:
                stringMonth = "December";
                break;
            default:
                stringMonth = new String();
                break;
        }

        return stringMonth;
    }

    // Get Day String Method
    public String getDay() {
        // Use deprecated date method to obtain day
        Integer numericDay;
        numericDay = eventTime.getDate();
        return numericDay.toString();
    }

    // Get Hour String Method
    public String getHour() {
        // Use deprecated date method to obtain hour
        Integer numericHour;
        numericHour = eventTime.getHours();
        return numericHour.toString();
    }

    // Get Minute String Method
    public String getMinute() {
        // Use deprecated date method to obtain minute
        Integer numericMinute;
        numericMinute = eventTime.getMinutes();
        return numericMinute.toString();
    }

    // Get Event Title Method
    public String getTitle() {
        // Return event title
        return eventTitle;
    }

    // Get Event Description Method
    public String getDescription() {
        // Return event description
        return eventDescription;
    }

    // Set Date Object Method
    public void setTime(Date newTime) {
        // Set event date
        eventTime = newTime;
    }

    // Set Date with Strings Method
    public void setTime(String newYear, String newMonth, String newDay, String newHour, String newMinute) {
        // Use deprecated methods to construct new date object
        Date newTime = new Date();

        // Set Year
        newTime.setYear(Integer.parseInt(newYear) + 1900);

        // Set Month
        switch (newMonth) {
            case "January":
                newTime.setMonth(0);
                break;
            case "February":
                newTime.setMonth(1);
                break;
            case "March":
                newTime.setMonth(2);
                break;
            case "April":
                newTime.setMonth(3);
                break;
            case "May":
                newTime.setMonth(4);
                break;
            case "June":
                newTime.setMonth(5);
                break;
            case "July":
                newTime.setMonth(6);
                break;
            case "August":
                newTime.setMonth(7);
                break;
            case "September":
                newTime.setMonth(8);
                break;
            case "October":
                newTime.setMonth(9);
                break;
            case "November":
                newTime.setMonth(10);
                break;
            case "December":
                newTime.setMonth(11);
                break;
            default:
                newTime.setMonth(-1);
                break;
        }

        // Set Day
        newTime.setDate(Integer.parseInt(newDay));

        // Set Hour
        newTime.setHours(Integer.parseInt(newHour));

        // Set Minute
        newTime.setMinutes(Integer.parseInt(newMinute));

        // Set Seconds to zero
        newTime.setSeconds(0);

        eventTime = newTime;
    }

    // Set Event Title Method
    public void setTitle(String newTitle) {
        // Set event title
        eventTitle = newTitle;
    }

    // Set Event Description Method
    public void setDescription(String newDescription) {
        // Set event description
        eventDescription = newDescription;
    }
}