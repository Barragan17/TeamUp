public class User {
    private int user_id;
    private String user_password;
    private boolean login_status;

    public User(String user_password, int user_id, boolean login_status) {
        this.user_id = user_id;
        this.user_password = user_password;
        this.login_status = false;
    }

    public void Register() {
        System.out.println("user id" + this.user_id + ",password " +   this.user_password);
    }

    public boolean getLoginStatus() {
        return this.login_status;
    }
}