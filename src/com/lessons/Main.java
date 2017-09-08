package com.lessons;

public class Main {

    public static void main(String[] args) {

        Pupil pupiltest = new Pupil("Nikita", "Gena", "Stas", "Vanya");

        ClassRoom classRoom = new ClassRoom(pupiltest);

        Pupil.Study(pupiltest.getStudent1(), "Bad");
        Pupil.Study(pupiltest.getStudent2(), "Good");
        Pupil.Study(pupiltest.getStudent3(), "Excelent");
        Pupil.Study(pupiltest.getStudent4(), "Rest in Thailand");

        System.out.println("");

        Pupil.Relax(pupiltest.getStudent1(), "Swiming");
        Pupil.Relax(pupiltest.getStudent2(), "Sleeping");
        Pupil.Relax(pupiltest.getStudent3(), "Working 27/7");
        Pupil.Relax(pupiltest.getStudent4(), "Rest in Thailand");

        System.out.println("");

        Pupil.Read(pupiltest.getStudent1(), "Faster than other student");
        Pupil.Read(pupiltest.getStudent2(), "Can't read");
        Pupil.Read(pupiltest.getStudent3(), "Oxxxymiron");
        Pupil.Read(pupiltest.getStudent4(), "Rest in Thailand");

        System.out.println("");

        Pupil.Write(pupiltest.getStudent1(), "Bad");
        Pupil.Write(pupiltest.getStudent2(), "Excelent");
        Pupil.Write(pupiltest.getStudent3(), "Pushkin");
        Pupil.Write(pupiltest.getStudent4(), "Rest in Thailand");



    }
}
