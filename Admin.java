public class Admin {
    private String adminId;
    private String adminName;
    private String adminEmailId;

    public Admin(String adminId, String adminName, String adminEmailId) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminEmailId = adminEmailId;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getAdminEmailId() {
        return adminEmailId;
    }

    public void setAdminEmailId(String adminEmailId) {
        this.adminEmailId = adminEmailId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }
}
