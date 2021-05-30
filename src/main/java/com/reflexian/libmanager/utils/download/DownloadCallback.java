package com.reflexian.libmanager.utils.download;

public interface DownloadCallback {
    void onSuccess();

    void onError(int var1);

    void onExist();
}
