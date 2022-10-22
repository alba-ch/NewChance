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
        View rootView = inflater.inflate(R.layout.p3_fragment_forum, container, false);
        rootView.setTag(TAG);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.p3_recycler_view);
        //Se necesita un DAO de Entry.
        recyclerView.setAdapter(new P3Adapter(new ArrayList<>()));
        recyclerView.setLayoutManager(new LinearLayoutManager(rootView.getContext()));

        binding = P3FragmentForumBinding.inflate(inflater, container, false);
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