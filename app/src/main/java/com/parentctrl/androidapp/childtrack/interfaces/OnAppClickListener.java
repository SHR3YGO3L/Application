package com.parentctrl.androidapp.childtrack.interfaces;

public interface OnAppClickListener {
    void onItemClick(String packageName, String appName, boolean blocked);

    /*void onLockCanceled();

    void onLockAppSet(int hours, int minutes);*/
}
