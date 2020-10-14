package jp.toufu3.ChatServer;

public class ChatServer {
    public static ChatServer single;
    public ServerConfig config;


    public static void start(){
        single = new ChatServer();
        single.config = new ServerConfig();
        single.setUpSpark();
    }

    public void setUpSpark(){

    }

}
