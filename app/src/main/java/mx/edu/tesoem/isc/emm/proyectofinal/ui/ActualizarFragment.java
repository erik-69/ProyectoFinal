package mx.edu.tesoem.isc.emm.proyectofinal.ui;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mx.edu.tesoem.isc.emm.proyectofinal.R;

public class ActualizarFragment extends Fragment {

    private ActualizarViewModel mViewModel;

    public static ActualizarFragment newInstance() {
        return new ActualizarFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.actualizar_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ActualizarViewModel.class);
        // TODO: Use the ViewModel
    }

}