public class MovieTestDrive {
    public static void main(String[] args) {

        Movie one = new Movie("Gone with the stock", "tragic", -2);
        Movie two = new Movie("Lost in Cubicle Space", "Comedy", 5);
        Movie three = new Movie("Byte Club","Tragic but ultimately uplifting", 127);

        one.playIt();
        two.playIt();
        three.playIt();




    }
}
