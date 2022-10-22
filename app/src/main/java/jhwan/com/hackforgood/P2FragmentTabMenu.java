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
        binding.p2ButtonClose.setOnClickListener(view1 -> {
            switch (((MainActivity) getActivity()).getCurrentFlag()){
                case MAIN:
                    NavHostFragment.findNavController(P2FragmentTabMenu.this)
                            .navigate(R.id.action_FragmentTabMenu_to_FragmentMain);
                    break;
                case ASYLUM:
                    NavHostFragment.findNavController(P2FragmentTabMenu.this)
                            .navigate(R.id.action_FragmentTabMenu_to_FragmentAsylum);
                    break;
                case HEALTHCARE:
                    NavHostFragment.findNavController(P2FragmentTabMenu.this)
                            .navigate(R.id.action_FragmentTabMenu_to_FragmentHealthcare);
                    break;
                case LEGAL:
                    NavHostFragment.findNavController(P2FragmentTabMenu.this)
                            .navigate(R.id.action_FragmentTabMenu_to_FragmentLegal);
                    break;
                case FOOD:
                    NavHostFragment.findNavController(P2FragmentTabMenu.this)
                            .navigate(R.id.action_FragmentTabMenu_to_FragmentFood);
                    break;
                case EDUCATION:
                    NavHostFragment.findNavController(P2FragmentTabMenu.this)
                            .navigate(R.id.action_FragmentTabMenu_to_FragmentEducation);
                    break;
                case FORUM:
                    NavHostFragment.findNavController(P2FragmentTabMenu.this)
                            .navigate(R.id.action_FragmentTabMenu_to_FragmentForum);
                    break;
                case REPORT:
                    NavHostFragment.findNavController(P2FragmentTabMenu.this)
                            .navigate(R.id.action_FragmentTabMenu_to_FragmentReport);
                    break;
                default:
                    NavHostFragment.findNavController(P2FragmentTabMenu.this)
                            .navigate(R.id.action_FragmentTabMenu_to_FragmentMain);
                    break;
            }
        });
        binding.p2ButtonHome.setOnClickListener(view1 -> NavHostFragment.findNavController(P2FragmentTabMenu.this)
                .navigate(R.id.action_FragmentTabMenu_to_FragmentMain));
        binding.p2ButtonForum.setOnClickListener(view1 -> NavHostFragment.findNavController(P2FragmentTabMenu.this)
                .navigate(R.id.action_FragmentTabMenu_to_FragmentForum));
        binding.p2ButtonFeedback.setOnClickListener(view1 -> NavHostFragment.findNavController(P2FragmentTabMenu.this)
                .navigate(R.id.action_FragmentTabMenu_to_FragmentMain));
        binding.p2ButtonReport.setOnClickListener(view1 -> NavHostFragment.findNavController(P2FragmentTabMenu.this)
                .navigate(R.id.action_FragmentTabMenu_to_FragmentReport));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}