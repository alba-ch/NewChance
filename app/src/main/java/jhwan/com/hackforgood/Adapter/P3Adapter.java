package jhwan.com.hackforgood.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import jhwan.com.hackforgood.Model.forum.Entry;
import jhwan.com.hackforgood.R;

public class P3Adapter extends RecyclerView.Adapter<P3ViewHolder>{
    private Entry[] entryArr;

    public P3Adapter(ArrayList<Entry> entryList){
        entryArr = entryList.toArray(new Entry[0]);
    }

    @Override
    public P3ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView= layoutInflater.inflate(R.layout.p3_recycler_view_entity_item, parent, false);
        return new P3ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull P3ViewHolder holder, int position) {
        final Entry entry = entryArr[position];

        holder.setTitle(entry.getTitle());
        holder.setCategory(entry.getType());
        holder.setMessage(entry.getMessage());
        holder.setCommentCount(Integer.toString(entry.getComments().size()));
    }

    @Override
    public int getItemCount() {
        return entryArr.length;
    }
}
