import java.util.Date;

public class Video extends Media{
    private double duration;
    public Video(Date creationDate, String title, String owner,double duration) {
        super(creationDate, title, owner);
        this.duration = duration;
    }
}
