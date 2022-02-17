    package com.example.card.ui.fragment;
    import android.os.Bundle;
    import android.view.View;
    import androidx.annotation.NonNull;
    import androidx.annotation.Nullable;
    import com.example.card.base.BaseFragment;
    import com.example.card.databinding.FragmentCategoryBinding;

    public class CategoryFragment extends BaseFragment<FragmentCategoryBinding> {

    @Override
    public FragmentCategoryBinding bind() {
    return FragmentCategoryBinding.inflate(getLayoutInflater());
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    initListeners();
    }

    private void initListeners() {
    binding.tvNavigation.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
    }
    });

    }
    }