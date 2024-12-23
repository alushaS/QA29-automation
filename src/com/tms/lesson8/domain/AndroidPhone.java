package com.tms.lesson8.domain;

public class AndroidPhone extends Phone{

    public AndroidPhone(String model , String number, int volume, int firmwareVersion) {
        super(model ,number, volume, firmwareVersion);
    }

    @Override
    public boolean firmware(int firmwareVersion) {
        boolean isFirmwareUpToDate = false;
        if (firmwareVersion >= 10){
            isFirmwareUpToDate = true;
        }
        return isFirmwareUpToDate;
    }
}
