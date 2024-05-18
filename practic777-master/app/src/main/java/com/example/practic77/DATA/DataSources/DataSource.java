package com.example.practic77.DATA.DataSources;

import androidx.lifecycle.LiveData;
import com.example.practic77.DATA.Model.DataList;
import com.example.practic77.DATA.Model.Item;
import java.util.List;
public interface DataSource {
    LiveData<List<DataList>> getItems();
    LiveData<DataList> getItem(int itemId);
}
