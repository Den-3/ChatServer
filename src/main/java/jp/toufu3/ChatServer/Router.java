package jp.toufu3.ChatServer;

import spark.Spark;


public class Router {
    public void setupRouter(){
        Spark.path("/api/v1",()->{
            Spark.path("/account",()->{
                Spark.get("/register",((request, response) -> {
                    if(request.params("mail") ==  null || request.params("pass") ==  null){
                        return "{\"status\" : \"ERROR\"}";
                    }
                    return "{\"status\":\"SUCCESS\"}";
                }));
            });
        });
    }
}
