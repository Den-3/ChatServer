package jp.toufu3.ChatServer.Entity;

import java.util.ArrayList;
import java.util.List;

public class ChannelEntity {

    private String channelName;
    private String channelID;
    private List<RoomEntity> textRooms = new ArrayList<>();
    private List<RoomEntity> voiceRooms = new ArrayList<>();
    private String channelIconUrl;

    public String getChannelName() {
        return channelName;
    }

    public ChannelEntity setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

    public String getChannelID() {
        return channelID;
    }

    public ChannelEntity setChannelID(String channelID) {
        this.channelID = channelID;
        return this;
    }

    public List<RoomEntity> getTextRooms() {
        return textRooms;
    }

    public ChannelEntity setTextRooms(List<RoomEntity> textRooms) {
        this.textRooms = textRooms;
        return this;
    }

    public List<RoomEntity> getVoiceRooms() {
        return voiceRooms;
    }

    public ChannelEntity setVoiceRooms(List<RoomEntity> voiceRooms) {
        this.voiceRooms = voiceRooms;
        return this;
    }

    public String getChannelIconUrl() {
        return channelIconUrl;
    }

    public ChannelEntity setChannelIconUrl(String channelIconUrl) {
        this.channelIconUrl = channelIconUrl;
        return this;
    }


}
