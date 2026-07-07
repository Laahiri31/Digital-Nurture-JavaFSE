package com.example.mockito;

public class MyService {

    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

    public String getUser(int id) {
        return api.getUser(id);
    }

    public void save(String data) {
        api.saveData(data);
    }

    public void connectServer() {
        api.connect();
    }
}