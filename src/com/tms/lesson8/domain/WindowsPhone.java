package com.tms.lesson8.domain;

public class WindowsPhone extends Phone{

    public WindowsPhone(String model, String number, int volume, int firmwareVersion) {
        super(model, number, volume, firmwareVersion);
    }

    @Override
    public void call(String number) {
        System.out.println("Звонок выполнен на " + getModel());
    }

    @Override
    public boolean firmware(int firmwareVersion) {
        return false;
    }
}
