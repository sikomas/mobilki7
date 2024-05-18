package com.example.practic77.UI.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.practic77.DATA.DataSources.Repositoriy;
import com.example.practic77.DATA.Model.DataList;
import com.example.practic77.R;

import java.util.List;

public class ItemViewModel extends ViewModel {

    private Repositoriy repository = new Repositoriy();
    public LiveData<List<DataList>> getItems() {
        return repository.getItems();
    }
}
