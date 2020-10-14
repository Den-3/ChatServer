package jp.toufu3.ChatServer;

import java.util.function.Consumer;

public class Result<T> {
    private T value;
    private Status status = Status.INITIAL;

    public Result<T> setValue(T v){
        if(v == null){
            status = Status.ERROR;
        }else{
            value = v;
            status = Status.SUCCESS;
        }
        return this;
    }

    public Result<T> setErr(){
        status = Status.ERROR;
        return this;
    }

    public void getValue(Consumer<T> onSuccess,Consumer<Status> onErr){
        if(status == Status.SUCCESS){
            onSuccess.accept(this.value);
        }else{
            onErr.accept(this.status);
        }
    }
}

enum Status{
    SUCCESS,ERROR,INITIAL
}