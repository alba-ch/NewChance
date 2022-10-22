package jhwan.com.hackforgood;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import jhwan.com.hackforgood.databinding.P1FragmentMainBinding;

public class P1FragmentMain extends Fragment {

    private P1FragmentMainBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = P1FragmentMainBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((MainActivity) getActivity()).setCurrentFlag(MainActivity.Fragments.MAIN);

        binding.p1ButtonAsylum.setOnClickListener(view1 -> NavHostFragment.findNavController(P1FragmentMain.this)
                .navigate(R.id.action_FragmentMain_to_FragmentAsylum));
        binding.p1ButtonHealthcare.setOnClickListener(view1 -> NavHostFragment.findNavController(P1FragmentMain.this)
                .navigate(R.id.action_FragmentMain_to_FragmentHealthcare));
        binding.p1ButtonLegalAid.setOnClickListener(view1 -> NavHostFragment.findNavController(P1FragmentMain.this)
                .navigate(R.id.action_FragmentMain_to_FragmentLegal));
        binding.p1ButtonFoodAid.setOnClickListener(view1 -> NavHostFragment.findNavController(P1FragmentMain.this)
                .navigate(R.id.action_FragmentMain_to_FragmentFood));
        binding.p1ButtonEducation.setOnClickListener(view1 -> NavHostFragment.findNavController(P1FragmentMain.this)
                .navigate(R.id.action_FragmentMain_to_FragmentEducation));
        binding.p1ButtonForum.setOnClickListener(view1 -> NavHostFragment.findNavController(P1FragmentMain.this)
                .navigate(R.id.action_FragmentMain_to_FragmentForum));
        binding.p1ButtonReport.setOnClickListener(view1 -> NavHostFragment.findNavController(P1FragmentMain.this)
                .navigate(R.id.action_FragmentMain_to_FragmentReport));
        binding.p1ButtonMenu.setOnClickListener(view1 -> NavHostFragment.findNavController(P1FragmentMain.this)
                .navigate(R.id.action_FragmentMain_to_FragmentTabMenu));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}