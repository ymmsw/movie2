import java.util.Scanner;
import java.util.Random;

public class MovieSimulationThree {
    static Scanner movie = new Scanner(System.in);
    public static void main(String[] args) {

        Random mo = new Random();
        int[][] seats = new int[5][10];
        String [] movieNames = { "Casey", "Thor", "Boris"};
        String [] movieTypes = { "Animated", "LiveAction", "Cartoon" };
        int [] moviePrices = { 50, 61, 43};
        displayMovieDetails( movieNames, movieTypes, moviePrices );
        getSeatAvailability(seats);
        randomizeAvailability(seats, mo);
        int index = selectMovie(movieNames);
        displaySelectedMovie( movieNames[index], movieTypes[index], moviePrices[index] );



    }



    public static void getSeatAvailability(int[][] seats) {
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

    public static int selectMovie(String[] movieNames){
        System.out.println("pick a movie");
        String moviechoice = movie.nextLine();

        while(moviechoice ==  ""){
            for (int j = 0; j < movieNames.length; j++){
            if (moviechoice.equalsIgnoreCase(movieNames[j]))  {
                return j;


            }
            }


            System.out.println("Movie not found. Try again.");

        }


    }

    public static void displaySelectedMovie( String movieNames, String movieTypes, int moviePrices ){
        System.out.println("-------------Movie Selection-------------");
        System.out.println("Movie Name\t\tMovie Type\t\tMovie price ");
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