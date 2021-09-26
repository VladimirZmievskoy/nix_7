package ua.com.alevel.task3;

public class Task3 {

    private static final int smallBreak = 5;
    private static final int bigBreak = 15;
    private static final int lessonDuration = 45;

    public static void StudyEndTime(int lessonNumber) {

        int hour, minutes;
        hour = lessonNum * lessonDur + lessonNum / 2 * smallBreak + (lessonNum - 1) / 2 * bigBreak;
        min = hour % 60;
        System.out.println("End time " + lessonNum + " of lesson: " + (9 + hour / 60) + " hours " + min + " minutes");
    }
}