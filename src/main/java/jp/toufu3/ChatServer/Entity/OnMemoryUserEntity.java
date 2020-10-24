package jp.toufu3.ChatServer.Entity;

enum UserStatus {
    ONLINE,OFFLINE,BUSY,IDLE,UNKNOWN
}

public class OnMemoryUserEntity {


    private String name = "";
    private String internalId = "";
    private UserStatus userStatus = UserStatus.UNKNOWN;
    private String hashKey = "";


    public String getName() {
        return name;
    }

    public OnMemoryUserEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getInternalId() {
        return internalId;
    }

    public OnMemoryUserEntity setInternalId(String internalId) {
        this.internalId = internalId;
        return this;
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public OnMemoryUserEntity setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    public String getHashKey() {
        return hashKey;
    }

    public OnMemoryUserEntity setHashKey(String hashKey) {
        this.hashKey = hashKey;
        return this;
    }

}
