import jdk.jfr.Category;

public class Ticket {
    private String musicGroup;
    public enum category {Normal, VIP, Business}
    category Category;
    private String location;

    public Ticket(String location, String musicGroup, category Category){
        this.location = location;
        this.musicGroup = musicGroup;
        this.Category = Category;
    }

    public String getLocation() {
        return location;
    }

    public String getMusicGroup() {
        return musicGroup;
    }

    public category getCategory(){
        return Category;
    }
}
