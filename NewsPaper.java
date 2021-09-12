import java.util.Date;

public class NewsPaper extends Media {
    private int paragraph;

    public NewsPaper(Date creationDate, String title, String owner,int paragraph) {
        super(creationDate, title, owner);
        this.paragraph = paragraph;
    }
}
