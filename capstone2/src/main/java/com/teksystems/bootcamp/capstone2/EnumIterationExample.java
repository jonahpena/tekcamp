package com.teksystems.bootcamp.capstone2;
import java.util.ArrayList;
import java.util.List;

public class EnumIterationExample {
    public static void addToOrder() {
        System.out.println("Add Enum values to ArrayList:");
        List < DaysOfWeekEnum > days = new ArrayList < > ();
        days.add(DaysOfWeekEnum.FRIDAY);
        days.add(DaysOfWeekEnum.SATURDAY);
        days.add(DaysOfWeekEnum.SUNDAY);
        for (DaysOfWeekEnum day: days) {
            System.out.println(day);
        }
        System.out.println("Remove SATURDAY from the list:");
        days.remove(DaysOfWeekEnum.SATURDAY);
        if (!days.contains(DaysOfWeekEnum.SATURDAY)) {
            System.out.println("Saturday is no longer in the list");
        }
        for (DaysOfWeekEnum day: days) {
            System.out.println(day);
        }
    }
}


enum DaysOfWeekEnum {
    SUNDAY("off"),
    MONDAY("working"),
    TUESDAY("working"),
    WEDNESDAY("working"),
    THURSDAY("working"),
    FRIDAY("working"),
    SATURDAY("off");

    private String typeOfDay;

    DaysOfWeekEnum(String typeOfDay) {
        this.typeOfDay = typeOfDay;
    }

    public String getTypeOfDay() {
        return typeOfDay;
    }

    public void setTypeOfDay(String typeOfDay) {
        this.typeOfDay = typeOfDay;
    }
}
