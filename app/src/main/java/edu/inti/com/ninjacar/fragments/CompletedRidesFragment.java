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
import edu.inti.com.ninjacar.adapters.RidesAdapter;
import edu.inti.com.ninjacar.models.Ride;

public class CompletedRidesFragment extends Fragment {

    private RecyclerView recyclerCompletedRides;
    private RidesAdapter ridesAdapter;
    private List<Ride> completedRidesList;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_completed_rides, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Initialize RecyclerView
        recyclerCompletedRides = view.findViewById(R.id.recycler_completed_rides);
        recyclerCompletedRides.setLayoutManager(new LinearLayoutManager(getContext()));

        // Load completed rides (dummy data for now)
        loadCompletedRides();

        // Set up adapter
        ridesAdapter = new RidesAdapter(completedRidesList);
        recyclerCompletedRides.setAdapter(ridesAdapter);
    }

    private void loadCompletedRides() {
        // Dummy data for demonstration
        completedRidesList = new ArrayList<>();
        completedRidesList.add(new Ride("Ride to City Center", "2024-11-01"));
        completedRidesList.add(new Ride("Ride to Airport", "2024-11-10"));
        completedRidesList.add(new Ride("Ride to Mall", "2024-11-20"));
    }
}
