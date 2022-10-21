package jhwan.com.hackforgood;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import jhwan.com.hackforgood.databinding.P2FragmentTapMenuBinding;

public class P2FragmentTabMenu extends Fragment {

    private P2FragmentTapMenuBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = P2FragmentTapMenuBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.p2ButtonClose.setOnClickListener(view1 -> NavHostFragment.findNavController(P2FragmentTabMenu.this)
                .navigate(R.id.action_FragmentTabMenu_to_FragmentMain));
        binding.p2ButtonHome.setOnClickListener(view1 -> NavHostFragment.findNavController(P2FragmentTabMenu.this)
                .navigate(R.id.action_FragmentTabMenu_to_FragmentMain));
        binding.p2ButtonForum.setOnClickListener(view1 -> NavHostFragment.findNavController(P2FragmentTabMenu.this)
                .navigate(R.id.action_FragmentTabMenu_to_FragmentForum));
        binding.p2ButtonFeedback.setOnClickListener(view1 -> NavHostFragment.findNavController(P2FragmentTabMenu.this)
                .navigate(R.id.action_FragmentMain_to_FragmentTabMenu));
        binding.p2ButtonReport.setOnClickListener(view1 -> NavHostFragment.findNavController(P2FragmentTabMenu.this)
                .navigate(R.id.action_FragmentTabMenu_to_FragmentForum));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}