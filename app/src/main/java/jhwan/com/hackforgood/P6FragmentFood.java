package jhwan.com.hackforgood;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import jhwan.com.hackforgood.databinding.P6FragmentFoodBinding;

public class P6FragmentFood extends Fragment {

    private P6FragmentFoodBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = P6FragmentFoodBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((MainActivity) getActivity()).setCurrentFlag(MainActivity.Fragments.FOOD);
        binding.p6ButtonMenu.setOnClickListener(view1 -> NavHostFragment.findNavController(P6FragmentFood.this)
                .navigate(R.id.action_FragmentFood_to_FragmentTabMenu));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}