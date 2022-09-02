public class Movie {
    String title;
    String genre;
    int rating;

    public Movie(String title, String genre, int rating){
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public void playIt(){
        System.out.println("introducing a " + genre + " film" + " with a rating of " + rating + " now playing " + title);
    }


}
