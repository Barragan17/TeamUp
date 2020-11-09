import java.util.ArrayList;

public class Talent {
    private String talent_name;
    private String talent_email;
    private String talent_address;
    private int talent_age;
    private Long talent_mobile;
    private String talent_desc;
    private String talent_photo;
    private ArrayList<String> suggst;

    public String SearchProject(String search){
        return search;
    }

    public ArrayList Suggestion(String suggst){
        return this.suggst;
    }

    public String OfferProject(String talent_name){
        return this.talent_name;
    }

    public void RightSwipe(String suggst){
        this.suggst.add(suggst);
    }

    public void LeftSwipe(String suggst){
        this.suggst.remove(suggst);
    }

}
