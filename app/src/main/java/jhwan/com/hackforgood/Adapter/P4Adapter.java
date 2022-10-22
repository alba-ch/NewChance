package jhwan.com.hackforgood.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import jhwan.com.hackforgood.Model.forum.Entry;
import jhwan.com.hackforgood.Model.users.Professional;
import jhwan.com.hackforgood.R;

public class P4Adapter extends RecyclerView.Adapter<P4ViewHolder> {
    private Professional[] professionalArr;

    public P4Adapter(ArrayList<Professional> professionalList){
        this.professionalArr = professionalList.toArray(new Professional[0]);
    }

    @Override
    public P4ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView= layoutInflater.inflate(R.layout.p4_recycler_view_shelter_item, parent, false);
        return new P4ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull P4ViewHolder holder, int position) {
        final Professional professional = professionalArr[position];

        holder.setName(professional.getName());
        holder.setDirection(professional.getDirection());
        holder.setSchedule(professional.getSchedule());
    }

    @Override
    public int getItemCount() {
        return professionalArr.length;
    }
}
