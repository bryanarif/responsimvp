package com.responsi.mvp.presenter;

import com.responsi.mvp.service.DataService;
import com.responsi.mvp.view.DataView;

public class DataPresenter {

    private DataView dataView;
    private DataService dataService;

    public DataPresenter(DataPresenter view) {
        this.DataView = view;

        if (this.DataService == null) {
            this.DataService = new DataService();
        }
    }
}
