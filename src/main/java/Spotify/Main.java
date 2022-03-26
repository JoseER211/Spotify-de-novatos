package Spotify;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

      filterYear();



      /* principal.forEach(showsong -> System.out.println(showsong.toString()));
        System.out.println();*/


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
}
