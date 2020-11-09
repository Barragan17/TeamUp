import java.util.Date;
import java.text.SimpleDateFormat;

public class Matching {
    private int matching_id;
    private Date matching_date;
    private String talent_name;
    private int talent_id;
    private String pm_name;
    private String project_name;

    public void ProjectMatch(int matching_id, String talent_name, int talent_id, String pm_name, String project_name)
    {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.matching_date = new Date();
        this.matching_id = matching_id;
        this.talent_name = talent_name;
        this.talent_id = talent_id;
        this.pm_name = pm_name;
        this.project_name = project_name;
    }
}