package com.tms.lesson8.domain;

public class ApplePhone extends Phone{

    public ApplePhone(String model ,String number, int volume, int firmwareVersion) {
        super(model, number, volume, firmwareVersion);
    }


    @Override
    public boolean firmware(int firmwareVersion) {
        boolean isFirmwareUpToDate = false;
        if (firmwareVersion >= 20){
            isFirmwareUpToDate = true;
        }
        return isFirmwareUpToDate;
    }

}
