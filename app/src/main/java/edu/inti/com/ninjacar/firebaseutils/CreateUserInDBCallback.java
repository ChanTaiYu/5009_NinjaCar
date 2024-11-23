package edu.inti.com.ninjacar.firebaseutils;

public interface CreateUserInDBCallback {
    void onSuccess();
    void onFailure(String errorMessage);
}
