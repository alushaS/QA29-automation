package com.tms.lesson8.domain;

public abstract class Phone {


    private String model;
    private String number;
    private int volume;
    private int firmwareVersion;

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public int getVolume() {
        return volume;
    }

    public int getFirmwareVersion() {
        return firmwareVersion;
    }

    public Phone(String model, String number, int volume, int firmwareVersion) {
        this.model = model;
        this.number = number;
        this.volume = volume;
        this.firmwareVersion = firmwareVersion;
    }


    public void call(String number) {
        System.out.println("Вызов на номер " + number + " принят");
    }

    public void play(int volume) {
        System.out.println("Музыка воспроизводится на громкости " + volume);
    }

    public abstract boolean firmware(int firmwareVersion);


}

