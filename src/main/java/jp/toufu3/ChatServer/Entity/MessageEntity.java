package jp.toufu3.ChatServer.Entity;

import java.util.Date;

public class MessageEntity {
    private String writterID = "";
    private String body = "";
    private Date createdTime;
    private Date updatedTime;
    private String entityID = "";
    private boolean deletedFlag = false;

    public String getWritterID() {
        return writterID;
    }

    public MessageEntity setWritterID(String writterID) {
        this.writterID = writterID;
        return this;
    }

    public String getBody() {
        return body;
    }

    public MessageEntity setBody(String body) {
        this.body = body;
        return this;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public MessageEntity setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public MessageEntity setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    public String getEntityID() {
        return entityID;
    }

    public MessageEntity setEntityID(String entityID) {
        this.entityID = entityID;
        return this;
    }

    public boolean isDeletedMessage() {
        return deletedFlag;
    }

    public MessageEntity setDeletedFlag(boolean deleteMessage) {
        this.deletedFlag = deleteMessage;
        return this;
    }




}
