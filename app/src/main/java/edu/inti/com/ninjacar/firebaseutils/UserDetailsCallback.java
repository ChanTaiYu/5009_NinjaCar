package edu.inti.com.ninjacar.firebaseutils;

import edu.inti.com.ninjacar.datamodels.User;

public interface UserDetailsCallback {
    void onUserDetailsFetched(User user);
    void onUserDetailsFailed(String errorMessage);
}
