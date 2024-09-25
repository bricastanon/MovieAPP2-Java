public class Main {
    public static void main(String[] args) {
        System.out.println("Hello everyone!");

        String movieName = "Interstellar";
        System.out.println("My favorite movie is: " + movieName);

       // int: The year the movie was released.
        //  String: The genre of the movie (e.g., Action, Drama, Comedy).
        // double: The IMDb rating (out of 10).
        // boolean: Whether the movie is part of a series or not.
        // char: The first letter of the movie’s director's last name.

        int releaseDate = 2014;
        String genre = "Action";
        double rating = 10.0;
        boolean inSeries = false;
        char directorsInitial = 'N';
        // Print the movie details

        System.out.println("Release Date: " + releaseDate);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
        System.out.println("Is part of a series: " + inSeries);
        System.out.println("Directors last name initial: " + directorsInitial);


        // a database of movies in SQL (Structure Query Langauge) like an excel sheet)
        // SELECT *
        // FROM MOVIES; PRINT all the Movies

        // An array is a list to store multiple values (movietitles;)
        // Same data type.. so only string, no numbers"
        String[] movieNames = {"Seven Pounds", "Interstellar", "Inception"};
        int[] movieYears ={2008,2009,2010};

        // Write down your three favorite genres in an array:

        String[] favoriteGenres = {"Comedy", "Horror", "Action"};
        System.out.println("First movie: " + movieNames[0]); //first item in my array
        System.out.println("Second movie: " + movieNames[1]);
        System.out.println("Third movie: " + movieNames[2]);

        System.out.println("First genre: " + favoriteGenres[0]);
        System.out.println("Second genre: " + favoriteGenres[1]);
        System.out.println("Third genre: " + favoriteGenres[2]);

        // Example: Datatype[] topic = {"topics", "etc"};



    }
}