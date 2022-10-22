package jhwan.com.hackforgood;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import jhwan.com.hackforgood.Adapter.P3Adapter;
import jhwan.com.hackforgood.Model.forum.Comment;
import jhwan.com.hackforgood.Model.forum.Entry;
import jhwan.com.hackforgood.databinding.P3FragmentForumBinding;

public class P3FragmentForum extends Fragment {

    private P3FragmentForumBinding binding;
    private static final String TAG = "p3_fragment_forum";
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = P3FragmentForumBinding.inflate(inflater, container, false);
        binding.getRoot().setTag(TAG);

        ArrayList<Entry> entries = new ArrayList<>();
        ArrayList<Comment> comments = new ArrayList<>();
        comments.add(new Comment());
        comments.add(new Comment());
        entries.add(new Entry("Title1", "General", "Hello I'm new in Barcelona!", comments));
        comments.add(new Comment());
        entries.add(new Entry("Title2", "General", "Does anyone knows where to buy phone cheaply?", comments));
        comments.remove(0);
        comments.remove(0);
        entries.add(new Entry("Title3", "Advice", "Some advice. >>link", comments));
        comments.remove(0);
        entries.add(new Entry("Title4", "General", "This is general message", comments));

        recyclerView = (RecyclerView) binding.getRoot().findViewById(R.id.p3_recycler_view);
        //Se necesita un DAO de Entry.
        recyclerView.setAdapter(new P3Adapter(entries));
        recyclerView.setLayoutManager(new LinearLayoutManager(binding.getRoot().getContext()));
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((MainActivity) getActivity()).setCurrentFlag(MainActivity.Fragments.FORUM);
        binding.p3ButtonMenu.setOnClickListener(view1 -> NavHostFragment.findNavController(P3FragmentForum.this)
                .navigate(R.id.action_FragmentForum_to_FragmentTabMenu));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}