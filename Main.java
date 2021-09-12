import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Library<Book> bookLibrary= new Library<>();
        Book book = new Book(new Date(),"NMN","Alak",8);
        Book book1 = new Book(new Date(),"ty","Ayqlak",9);
        Book book2 = new Book(new Date(),"NMtN","Aytlak",25);
        Book book3 = new Book(new Date(),"NMtytN","Atytylak",841);
        bookLibrary.add(book);
        bookLibrary.add(book1);
        bookLibrary.add(book2);
        bookLibrary.add(book3);



        Library<Video> videoLibrary = new Library<>();
        Video video1 = new Video(new Date(),"ertt","ju3hrju",5.777);
        Video video2 = new Video(new Date(),"weertt","etgrju3hrju",12.99);
        Video video3 = new Video(new Date(),"vgertt","jgtu3hrju",13.8);
        videoLibrary.add(video1);
        videoLibrary.add(video2);
        videoLibrary.add(video3);

        Library<NewsPaper> news = new Library<>();
        NewsPaper newsPaper1 = new NewsPaper(new Date(),"ere","wrr",58);
        NewsPaper newsPaper2 = new NewsPaper(new Date(),"werere","eerr",99);
        NewsPaper newsPaper3 = new NewsPaper(new Date(),"eteere","whrrr",108);


    }
}
