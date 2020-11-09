import java.util.Date;
import java.util.ArrayList;

public class pm {
    private User pm_name;
    private User pm_email; 
    private User pm_mobile;
    private User pm_photo 
    private ArrayList<User> Project;
    private ArrayList<User> talentSuggUser;

    public ArrayList<User> haveProject() {
        return this.Project;
    }

    public ArrayList<User> haveTalentSugg() {
        return this.talentSuggUser;
    }

    public void CreateProject(User Project) {
        this.Project.add(Project);
    }

    public void EditProject(User Project) {
        this.Project.edit(Project);
    }

    public void DeleteProject(User Project) {
        this.Project.delete(Project);
    }

    public void CreateProject(User Project) {
        this.Project.add(Project);
    }

    public void LeftSwipe(User talentSuggUser) {
        this.Project.delete(talentSuggUser);
    }

    public void RightSwipe(User talentSuggUser) {
        this.Project.add(talentSuggUser);
    }
    
}