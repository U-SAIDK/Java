package Basics.Enums;

public enum Day {

// Enum constants with values
 SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

// Field (variable) to store To Pass these int Values to the Constructor
private final int dayNumber;

// Always Create Constructor to Pass in the Value
// Constructor (runs once for each constant above)
 Day(int dayNumber) {
 this.dayNumber = dayNumber;

 }

 public int getDayNumber() {
     return this.dayNumber;
 }

}
