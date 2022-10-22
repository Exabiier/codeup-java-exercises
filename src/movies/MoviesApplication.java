package movies;
import util.Input;

import java.util.Arrays;

import static movies.MoviesArray.findAll;

public class MoviesApplication {


    public static int userInput(){
        System.out.println("Enter your choice:");
        Input user = new Input();
        return user.scanner.nextInt();
    }

    public static int swith(int x){
        Movie[] move = findAll();
        switch(x){
            case 0:
                break;
            case 1:
                for(Movie movie: move ){
                    System.out.println(movie.getName()+ "--" + movie.getCategory());
                }
                break;
            case 2:
                for(Movie movie: move ) {
                    if (movie.getCategory().contains("animated")) {
                        System.out.println(movie.getName()+ "--" + movie.getCategory());
                    }
                }
                break;
            case 3:
                for(Movie movie: move ) {
                    if (movie.getCategory().contains("drama")) {
                        System.out.println(movie.getName()+ "--" + movie.getCategory());
                    }
                }
                break;
            case 4:
                for(Movie movie: move ) {
                    if (movie.getCategory().contains("horror")) {
                        System.out.println(movie.getName()+ "--" + movie.getCategory());
                    }
                }
                break;
            case 5:
                for(Movie movie: move ) {
                    if (movie.getCategory().contains("scifi")) {
                        System.out.println(movie.getName()+ "--" + movie.getCategory());
                    }
                }
                break;
            default:
                userInput();
                break;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n\n");

                int x = userInput();
                swith(x);

    }

}
