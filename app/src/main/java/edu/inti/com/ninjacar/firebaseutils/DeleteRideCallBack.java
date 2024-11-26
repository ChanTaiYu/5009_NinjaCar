package edu.inti.com.ninjacar.firebaseutils;

import edu.inti.com.ninjacar.datamodels.Ride;

/**
 * Callback interface for handling the deletion of a ride from Firebase or any data source.
 */
public interface DeleteRideCallBack<Ride> {

    /**
     * Called when a ride has been successfully deleted.
     *
     * @param ride The ride that was deleted.
     */
    void onRideDeleted(Ride ride);

    /**
     * Called when there is an error during the deletion of a ride.
     *
     * @param errorMessage The error message explaining the failure.
     */
    void onDeleteError(String errorMessage);

    void onSuccess();

    void onFailure(String errorMessage);
}
