package edu.inti.com.ninjacar.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import edu.inti.com.ninjacar.R;
import edu.inti.com.ninjacar.datamodels.Ride;

public class PendingRidesAdapter extends RecyclerView.Adapter<PendingRidesAdapter.PendingRidesViewHolder> {

    private final List<Ride> pendingRides;
    private final OnRideActionListener listener;

    public interface OnRideActionListener {
        void onDeleteRide(Ride ride);
        void onViewRideDetails(Ride ride);
    }

    public PendingRidesAdapter(List<Ride> pendingRides, OnRideActionListener listener) {
        this.pendingRides = pendingRides;
        this.listener = listener;
    }

    @NonNull
    @Override
    public PendingRidesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_pending_rides, parent, false);
        return new PendingRidesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PendingRidesViewHolder holder, int position) {
        Ride ride = pendingRides.get(position);
        holder.bind(ride, listener);
    }

    @Override
    public int getItemCount() {
        return pendingRides.size();
    }

    public static class PendingRidesViewHolder extends RecyclerView.ViewHolder {

        private final TextView tvRideDate;
        private final TextView tvRideTime;
        private final TextView tvRideDestination;
        private final ImageButton btnDeleteRide;
        private final ImageButton btnViewDetails;

        public PendingRidesViewHolder(@NonNull View itemView) {
            super(itemView);
            tvRideDate = itemView.findViewById(R.id.tv_ride_date);
            tvRideTime = itemView.findViewById(R.id.tv_ride_time);
            tvRideDestination = itemView.findViewById(R.id.tv_ride_destination);
            btnDeleteRide = itemView.findViewById(R.id.btn_delete_ride);
            btnViewDetails = itemView.findViewById(R.id.btn_view_details);
        }

        public void bind(Ride ride, OnRideActionListener listener) {
            tvRideDate.setText(ride.getDate());
            tvRideTime.setText(ride.getTime());
            tvRideDestination.setText(ride.getDestination());

            btnDeleteRide.setOnClickListener(v -> listener.onDeleteRide(ride));
            btnViewDetails.setOnClickListener(v -> listener.onViewRideDetails(ride));
        }
    }
}
