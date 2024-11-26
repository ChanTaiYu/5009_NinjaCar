package edu.inti.com.ninjacar.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import edu.inti.com.ninjacar.R;

import edu.inti.com.ninjacar.datamodels.Ride;

public class PendingRidesFragment extends Fragment implements DeleteRideCallBack {

    private RecyclerView recyclerPendingRides;

    private List<Ride> pendingRidesList;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pending_rides, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Initialize RecyclerView
        recyclerPendingRides = view.findViewById(R.id.recycler_pending_rides);
        recyclerPendingRides.setLayoutManager(new LinearLayoutManager(getContext()));

        // Load pending rides (dummy data for now)
        loadPendingRides();

        // Set up adapter


    }

    private void loadPendingRides() {
        // Dummy data for demonstration
        pendingRidesList = new ArrayList<>();
        pendingRidesList.add(new Ride("Pending Ride to Office", "2024-11-25"));
        pendingRidesList.add(new Ride("Pending Ride to Gym", "2024-11-26"));
        pendingRidesList.add(new Ride("Pending Ride to Market", "2024-11-27"));
    }

    @Override
    public void onDeleteRide(int rideId) {
        // Handle ride deletion logic
        pendingRidesList.remove(rideId);

    }
}
