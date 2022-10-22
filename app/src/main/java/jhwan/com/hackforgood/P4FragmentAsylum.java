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
import jhwan.com.hackforgood.databinding.P4FragmentAsylumBinding;

public class P4FragmentAsylum extends Fragment {

    private P4FragmentAsylumBinding binding;
    private static final String TAG = "p4_fragment_asylum";
    private RecyclerView recyclerView;
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        View rootView = inflater.inflate(R.layout.p4_fragment_asylum, container, false);
        rootView.setTag(TAG);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.p4_recycler_view);
        //Se necesita un DAO de Entry.
        recyclerView.setAdapter(new P3Adapter(new ArrayList<>()));
        recyclerView.setLayoutManager(new LinearLayoutManager(rootView.getContext()));

        binding = P4FragmentAsylumBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((MainActivity) getActivity()).setCurrentFlag(MainActivity.Fragments.ASYLUM);
        binding.p4ButtonMenu.setOnClickListener(view1 -> NavHostFragment.findNavController(P4FragmentAsylum.this)
                .navigate(R.id.action_FragmentAsylum_to_FragmentTabMenu));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}