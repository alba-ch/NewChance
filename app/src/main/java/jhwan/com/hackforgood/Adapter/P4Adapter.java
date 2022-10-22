package jhwan.com.hackforgood.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import jhwan.com.hackforgood.Model.location.Location;
import jhwan.com.hackforgood.Model.users.Professional;
import jhwan.com.hackforgood.R;

public class P4Adapter extends RecyclerView.Adapter<P4ViewHolder> {
    private Location[] locationArr;

    public P4Adapter(ArrayList<Location> locations){
        this.locationArr = locations.toArray(new Location[0]);
    }

    @Override
    public P4ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView= layoutInflater.inflate(R.layout.p4_recycler_view_shelter_item, parent, false);
        return new P4ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull P4ViewHolder holder, int position) {
        final Location location = locationArr[position];

        holder.setName(location.getName());
        String direction = location.getAdress() + ", " + location.getCity() + ", " +
                location.getProvince() + " " + location.getCp();
        holder.setDirection(direction);
        holder.setSchedule(location.getSchedule());
        holder.setType(location.getType());
    }

    @Override
    public int getItemCount() {
        return locationArr.length;
    }
}
