package jp.toufu3.ChatServer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoomEntity {

    private String roomName = "";
    private String internalID = "";
    private Map<StorageUserEntiy,List<PermissionEnum>> userPerms = new HashMap<>();
    private List<MessageEntity> messageCache = new ArrayList<>();

    public String getRoomName() {
        return roomName;
    }

    public RoomEntity setRoomName(String roomName) {
        this.roomName = roomName;
        return this;
    }

    public String getInternalID() {
        return internalID;
    }

    public RoomEntity setInternalID(String internalID) {
        this.internalID = internalID;
        return this;
    }

    public Map<StorageUserEntiy, List<PermissionEnum>> getUserPerms() {
        return userPerms;
    }

    public Result<List<PermissionEnum>> getUserPerms(StorageUserEntiy user){
        if (this.userPerms.containsKey(user)){
            return new Result<List<PermissionEnum>>()
                    .setValue(this.userPerms.get(user));
        }
        return new Result<List<PermissionEnum>>().setErr();
    }


    public RoomEntity addUserPerms(StorageUserEntiy user,PermissionEnum perm) {
        List<PermissionEnum> perms;
        if(this.userPerms.containsKey(user)){
            perms = this.userPerms.get(user);
        }else{
            perms = new ArrayList<>();
        }
        perms.add(perm);
        this.userPerms.put(user,perms);
        return this;
    }



    public List<MessageEntity> getMessageCache() {
        return messageCache;
    }

    public RoomEntity setMessageCache(List<MessageEntity> messageCache) {
        this.messageCache = messageCache;
        return this;
    }
}
