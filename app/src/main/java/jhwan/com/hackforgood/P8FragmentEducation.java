package jhwan.com.hackforgood;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import jhwan.com.hackforgood.databinding.P8FragmentEducationBinding;

public class P8FragmentEducation extends Fragment {

    private P8FragmentEducationBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = P8FragmentEducationBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((MainActivity) getActivity()).setCurrentFlag(MainActivity.Fragments.EDUCATION);
        binding.p8ButtonMenu.setOnClickListener(view1 -> NavHostFragment.findNavController(P8FragmentEducation.this)
                .navigate(R.id.action_FragmentEducation_to_FragmentTabMenu));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}