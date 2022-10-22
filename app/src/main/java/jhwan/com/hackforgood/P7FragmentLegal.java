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

import jhwan.com.hackforgood.Adapter.P7Adapter;
import jhwan.com.hackforgood.ViewModel.UsersViewModel;
import jhwan.com.hackforgood.databinding.P7FragmentLegalBinding;

public class P7FragmentLegal extends Fragment {

    private P7FragmentLegalBinding binding;
    private static final String TAG = "p7_fragment_legal";
    private RecyclerView recyclerView;
    private UsersViewModel userVM;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = P7FragmentLegalBinding.inflate(inflater, container, false);
        binding.getRoot().setTag(TAG);

        userVM = new UsersViewModel();

        recyclerView = (RecyclerView) binding.getRoot().findViewById(R.id.p7_recycler_view);
        //Se necesita un DAO de Entry.
        recyclerView.setAdapter(new P7Adapter(userVM.getProByType("Lawyer")));
        recyclerView.setLayoutManager(new LinearLayoutManager(binding.getRoot().getContext()));

        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((MainActivity) getActivity()).setCurrentFlag(MainActivity.Fragments.LEGAL);
        binding.p7ButtonMenu.setOnClickListener(view1 -> NavHostFragment.findNavController(P7FragmentLegal.this)
                .navigate(R.id.action_FragmentLegal_to_FragmentTabMenu));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}