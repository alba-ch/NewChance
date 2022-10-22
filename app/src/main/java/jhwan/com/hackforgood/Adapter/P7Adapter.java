package jhwan.com.hackforgood.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import jhwan.com.hackforgood.Model.users.Professional;
import jhwan.com.hackforgood.R;

public class P7Adapter  extends RecyclerView.Adapter<P7ViewHolder> {
    private Professional[] professionalArr;

    public P7Adapter(ArrayList<Professional> professionalList){
        this.professionalArr = professionalList.toArray(new Professional[0]);
    }

    @Override
    public P7ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView= layoutInflater.inflate(R.layout.p7_recycler_view_legal_item, parent, false);
        return new P7ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull P7ViewHolder holder, int position) {
        final Professional professional = professionalArr[position];

        holder.setName(professional.getName());
        holder.setDirection(professional.getDirection());
        holder.setSchedule(professional.getSchedule());
        holder.setProfession(professional.getProfession());

    }

    @Override
    public int getItemCount() {
        return professionalArr.length;
    }
}