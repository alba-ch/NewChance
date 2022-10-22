package jhwan.com.hackforgood;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import jhwan.com.hackforgood.databinding.P7FragmentLegalBinding;

public class P7FragmentLegal extends Fragment {

    private P7FragmentLegalBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = P7FragmentLegalBinding.inflate(inflater, container, false);
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