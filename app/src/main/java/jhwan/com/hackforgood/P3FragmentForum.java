package jhwan.com.hackforgood;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import jhwan.com.hackforgood.databinding.P3FragmentForumBinding;

public class P3FragmentForum extends Fragment {

    private P3FragmentForumBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

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