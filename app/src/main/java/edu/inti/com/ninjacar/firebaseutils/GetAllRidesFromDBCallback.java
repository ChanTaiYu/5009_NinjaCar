package edu.inti.com.ninjacar.firebaseutils;

import java.util.ArrayList;

import edu.inti.com.ninjacar.datamodels.Ride;

public interface GetAllRidesFromDBCallback {

    void onRideDataReceived(ArrayList<Ride> rideList);
    void onRideDataFailed(String error);
}
