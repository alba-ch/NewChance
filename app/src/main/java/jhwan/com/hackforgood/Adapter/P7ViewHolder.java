package jhwan.com.hackforgood.Adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import jhwan.com.hackforgood.R;

public class P7ViewHolder extends RecyclerView.ViewHolder {
    private final TextView name;
    private final TextView direction;
    private final TextView schedule;

    public P7ViewHolder(@NonNull View itemView) {
        super(itemView);
        this.name = itemView.findViewById(R.id.p4_item_name);
        this.direction = itemView.findViewById(R.id.p4_item_direction);
        this.schedule = itemView.findViewById(R.id.p4_item_schedule);
    }

    public TextView getName() {
        return name;
    }

    public void setName(String name){
        this.name.setText(name);
    }

    public TextView getDirection() {
        return direction;
    }

    public void setDirection(String direction){
        this.direction.setText(direction);
    }

    public TextView getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule){
        this.schedule.setText(schedule);
    }
}
