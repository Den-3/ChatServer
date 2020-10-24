package jp.toufu3.ChatServer;

import spark.Spark;

public class ChatServer {
    public static ChatServer single;
    public ServerConfig config;


    public static void start(){
        single = new ChatServer();
        single.config = new ServerConfig();
        single.setUpSpark();
    }

    public void setUpSpark(){
        Spark.port(25565);
        new Router().setupRouter();
    }

}
