package jhwan.com.hackforgood.Adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import jhwan.com.hackforgood.R;

public class P4ViewHolder extends RecyclerView.ViewHolder {
    private final TextView name;
    private final TextView direction;
    private final TextView schedule;
    private final TextView type;

    public P4ViewHolder(@NonNull View itemView) {
        super(itemView);
        this.name = itemView.findViewById(R.id.p4_item_name);
        this.direction = itemView.findViewById(R.id.p4_item_direction);
        this.schedule = itemView.findViewById(R.id.p4_item_schedule);
        this.type = itemView.findViewById(R.id.p4_item_type);

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

    public TextView getType() {
        return type;
    }

    public void setType(String type){
        this.type.setText(type);
    }
}
