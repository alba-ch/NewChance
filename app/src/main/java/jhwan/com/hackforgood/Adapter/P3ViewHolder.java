package jhwan.com.hackforgood.Adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import jhwan.com.hackforgood.R;

public class P3ViewHolder extends RecyclerView.ViewHolder {
    private final TextView title;
    private final TextView category;
    private final TextView message;
    private final TextView commentCount;

    public P3ViewHolder(@NonNull View itemView) {
        super(itemView);
        this.title = itemView.findViewById(R.id.p3_item_title);
        this.category = itemView.findViewById(R.id.p3_item_category);
        this.message = itemView.findViewById(R.id.p3_item_content);
        this.commentCount = itemView.findViewById(R.id.p3_text_commentcount);
    }

    public TextView getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title.setText(title);
    }

    public TextView getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category.setText(category);
    }

    public TextView getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message.setText(message);
    }

    public TextView getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(String commentCount) {
        this.commentCount.setText(commentCount);
    }
}
