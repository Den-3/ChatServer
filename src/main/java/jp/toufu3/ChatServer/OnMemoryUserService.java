package jp.toufu3.ChatServer;

import jp.toufu3.ChatServer.Entity.OnMemoryUserEntity;

import java.util.HashMap;
import java.util.Map;

public class OnMemoryUserService {
    private Map<String,OnMemoryUserEntity> userStore = new HashMap<>();

    public Result<OnMemoryUserEntity> loadUserEntity(String hash){
        OnMemoryUserEntity entity = new OnMemoryUserEntity();
        if(userStore.containsKey("")){
            return new Result<OnMemoryUserEntity>().setErr();
        }else{
            return new Result<OnMemoryUserEntity>().setValue(entity);
        }
    }

    public Result<OnMemoryUserEntity> getUserEntity(String name){
        if(name == null || name.isEmpty()){
            return new Result<OnMemoryUserEntity>().setErr();
        }else{
            if(!userStore.containsKey(name)){
                return new Result<OnMemoryUserEntity>().setErr();
            }
            return new Result<OnMemoryUserEntity>().setValue(userStore.get(name));
        }
    }
}
