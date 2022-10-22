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

import jhwan.com.hackforgood.Adapter.P4Adapter;
import jhwan.com.hackforgood.Adapter.P7Adapter;
import jhwan.com.hackforgood.ViewModel.LocationViewModel;
import jhwan.com.hackforgood.ViewModel.UsersViewModel;
import jhwan.com.hackforgood.databinding.P4FragmentAsylumBinding;

public class P4FragmentAsylum extends Fragment {

    private P4FragmentAsylumBinding binding;
    private static final String TAG = "p4_fragment_asylum";
    private RecyclerView recyclerView;
    private LocationViewModel locationVM;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = P4FragmentAsylumBinding.inflate(inflater, container, false);
        binding.getRoot().setTag(TAG);

        locationVM = new LocationViewModel();

        recyclerView = (RecyclerView) binding.getRoot().findViewById(R.id.p4_recycler_view);
        //Se necesita un DAO de Entry.
        recyclerView.setAdapter(new P4Adapter(locationVM.getLocationsByType("Assylium")));
        recyclerView.setLayoutManager(new LinearLayoutManager(binding.getRoot().getContext()));

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