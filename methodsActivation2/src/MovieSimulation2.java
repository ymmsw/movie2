import java.util.Scanner;
import java.util.Random;

public class MovieSimulation2 {
    public static void main(String[] args) {
        Scanner movie = new Scanner(System.in);
        Random mo = new Random();
        int[][] seats = new int[5][10];
        String [] movieNames = { "Casey", "Thor", "Boris"};
        String [] movieTypes = { "Animated", "LiveAction", "Cartoon" };
        int [] moviePrices = { 50, 61, 43};
        displayMovieDetails( movieNames, movieTypes, moviePrices);
        getSeatAvailability(seats);
        randomizeAvailability(seats, mo);


    }

    private static void getSeatAvailability(int[][] seats) {
        System.out.println("-----------------------Initial Seats--------------------");
        System.out.println(" seating Availability: 1 = unavailable, 0 = available");

        for(int i = 0;i< seats.length;i++){
            for(int j = 0; j< seats[i].length; j++){
                seats[i][j] = 0;
                System.out.print(seats[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void displayMovieDetails(String[] movieNames, String[] movieTypes, int[] moviePrices) {
        System.out.println("-----------------------Movie Details--------------------");

        System.out.println("Movie Name\t\tMovie Type\t\tMovie price ");
        for(int i = 1; i < movieNames.length+1; i++){
            System.out.printf("Movie %d: %s\t\t%s\t\t\t$%d\n", i, movieNames[i-1], movieTypes[i-1], moviePrices[i-1]  );
        }
    }

    public static void randomizeAvailability(int [][] seats, Random mo) {
        System.out.println("-----------------------Random Seats Details--------------------");
        System.out.println(" seating Availability: 1 = unavailable, 0 = available");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {

                seats[i][j] = mo.nextInt(2);
                System.out.print(seats[i][j]+ " ");

            }
            System.out.println();
        }
        System.out.println();
    }
}