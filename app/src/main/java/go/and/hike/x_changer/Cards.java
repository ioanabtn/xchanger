package go.and.hike.x_changer;

public class Cards {

    private String userId;
    private String name;
    private String location;
    private String profileImageUrl;

    public Cards(String userId, String name, String location, String profileImageUrl) {
        this.userId = userId;
        this.name = name;
        this.location = location;
        this.profileImageUrl = profileImageUrl;
    }

    public Cards(String userId, String name, String location) {
        this.userId = userId;
        this.name = name;
        this.location = location;
    }

    public Cards(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }
}
