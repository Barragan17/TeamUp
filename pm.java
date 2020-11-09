import java.util.Date;
import java.util.ArrayList;

public class pm {
    private User pm_name;
    private User pm_email; 
    private User pm_mobile;
    private User pm_photo 
    private ArrayList<User> pm_project;
    private ArrayList<User> pm_talentSugg;

    public ArrayList<User> haveProject() {
        return this.pm_project;
    }

    public ArrayList<User> haveTalentSugg() {
        return this.pm_talentSugg;
    }

    public void CreateProject(User pm_project) {
        this.Project.add(pm_project);
    }

    public void EditProject(User pm_project) {
        this.Project.edit(pm_project);
    }

    public void DeleteProject(User pm_project) {
        this.Project.delete(pm_project);
    }

    public void LeftSwipe(User pm_talentSugg) {
        this.Project.delete(pm_talentSugg);
    }

    public void RightSwipe(User pm_talentSugg) {
        this.Project.add(pm_talentSugg);
    }
    
}