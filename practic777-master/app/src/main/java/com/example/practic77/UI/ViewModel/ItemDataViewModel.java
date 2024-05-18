package com.example.practic77.UI.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.practic77.DATA.DataSources.Repositoriy;
import com.example.practic77.DATA.Model.DataList;
import com.example.practic77.R;

public class ItemDataViewModel extends ViewModel {
    private Repositoriy repository = new Repositoriy();
    public LiveData<DataList> getItem(String itemId) {
        return new MutableLiveData<>(new DataList(itemId, R.drawable.vladeleccat));
    }
}
