package pl.juliankominiak;

public class Main {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel("Veritasium");
        Blog blog1 = new Blog("Science Blog");
        Blog blog2 = new Blog("Physics Blog");
        channel.addObserver(blog1);
        channel.addObserver(blog2);
        channel.uploadVideo("The Infinite Pattern That Never Repeats");
    }
}
