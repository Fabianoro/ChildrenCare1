package com.example.proyecto1.ui.cerrarses;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CerrarsesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CerrarsesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is cerrarses fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}