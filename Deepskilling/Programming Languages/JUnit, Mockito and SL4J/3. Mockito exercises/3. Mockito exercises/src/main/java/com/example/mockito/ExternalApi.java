package com.example.mockito;

public interface ExternalApi {

    String getData();

    String getUser(int id);

    void saveData(String data);

    void connect();

}