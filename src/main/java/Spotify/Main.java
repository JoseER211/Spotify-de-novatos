package Spotify;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {



    }

    public static Integer scan(){
        Scanner data = new Scanner(System.in);
        Integer option = data.nextInt();
        return option;
    }

    public static void filterYear(){
        Library principal = new Library();
        ArrayList<Song> songFilterYear = new ArrayList<>();

        principal.getSongs().stream().filter(year -> year.getYear() == 2015).forEach(year -> songFilterYear.add(year));
        songFilterYear.forEach(year -> System.out.println(year.toString()));

    }

    public static void filterDuration(){
        Library principal = new Library();

        Collections.sort(principal.getSongs(), (s1, s2) -> new Integer(s1.getDuration()).compareTo(new Integer(s2.getDuration())));
        principal.getSongs().forEach(duration -> System.out.println(duration.toString()));
    }
}
