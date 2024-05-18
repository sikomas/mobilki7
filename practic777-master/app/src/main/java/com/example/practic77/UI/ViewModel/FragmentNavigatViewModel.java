package com.example.practic77.UI.ViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.practic77.DATA.Model.FragmentNavigatData;

public class FragmentNavigatViewModel extends ViewModel {

    private MutableLiveData<FragmentNavigatData> data = new MutableLiveData<>();
    public FragmentNavigatViewModel() {
        data.setValue(new FragmentNavigatData());
    }
    public MutableLiveData<FragmentNavigatData> getData() {
        return data;
    }
}
