package jp.toufu3.ChatServer;

public class StorageUserEntiy {

    private String name = "";
    private String mailHash = "";
    private String passwordHash = "";
    private String internalId = "";
    private String hashKey = "";
    private String userIconUrl = "";

    public String getName() {
        return name;
    }

    public StorageUserEntiy setName(String name) {
        this.name = name;
        return this;
    }

    public String getMailHash() {
        return mailHash;
    }

    public StorageUserEntiy setMailHash(String mailHash) {
        this.mailHash = mailHash;
        return this;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public StorageUserEntiy setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
        return this;
    }

    public String getInternalId() {
        return internalId;
    }

    public StorageUserEntiy setInternalId(String internalId) {
        this.internalId = internalId;
        return this;
    }

    public String getHashKey() {
        return hashKey;
    }

    public StorageUserEntiy setHashKey(String hashKey) {
        this.hashKey = hashKey;
        return this;
    }

    public String getUserIconUrl(){
        return userIconUrl;
    }

    public StorageUserEntiy setUserIconUrl(String url){
        this.userIconUrl = url;
        return this;
    }


}
