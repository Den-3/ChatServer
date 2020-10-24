package jp.toufu3.ChatServer.Entity;

public class StorageUserEntity {

    private String name = "";
    private String mailHash = "";
    private String passwordHash = "";
    private String internalId = "";
    private String hashKey = "";
    private String userIconUrl = "";

    public String getName() {
        return name;
    }

    public StorageUserEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getMailHash() {
        return mailHash;
    }

    public StorageUserEntity setMailHash(String mailHash) {
        this.mailHash = mailHash;
        return this;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public StorageUserEntity setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
        return this;
    }

    public String getInternalId() {
        return internalId;
    }

    public StorageUserEntity setInternalId(String internalId) {
        this.internalId = internalId;
        return this;
    }

    public String getHashKey() {
        return hashKey;
    }

    public StorageUserEntity setHashKey(String hashKey) {
        this.hashKey = hashKey;
        return this;
    }

    public String getUserIconUrl(){
        return userIconUrl;
    }

    public StorageUserEntity setUserIconUrl(String url){
        this.userIconUrl = url;
        return this;
    }


}
