package com.example.niyamat.listwidget;

import android.content.Intent;
import android.widget.RemoteViewsService;

/**
 * Created by niyamat on 12/23/16.
 */

public class WidgetService extends RemoteViewsService {
    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new WidgetAdapter(this);
    }
}
