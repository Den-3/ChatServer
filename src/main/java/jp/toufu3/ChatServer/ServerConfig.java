package jp.toufu3.ChatServer;

public class ServerConfig {
    private int numberMessageCacheLog = 100;
    private int numberMessageSend = 30;
    private int saveIntervalMinute = 30;

    public ServerConfig seetNumberOfMessageLog(int num){
        this.numberMessageCacheLog = num;
        return this;
    }

    public int getNumMegLog() {
        return this.numberMessageCacheLog;
    }

    public int getNumMegSend() {
        return numberMessageSend;
    }

    public ServerConfig setNumberOfMessageSend(int numberOfMessageSend) {
        this.numberMessageSend = numberOfMessageSend;
        return this;
    }

    public int getSaveIntervalMinute() {
        return saveIntervalMinute;
    }

    public ServerConfig setSaveIntervalMinute(int saveIntervalMinute) {
        this.saveIntervalMinute = saveIntervalMinute;
        return this;
    }
}
