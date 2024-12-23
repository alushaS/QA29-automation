package com.tms.lesson8.domain;

public class MainApp {

    public static void main(String[] args) {

        Phone phone = new Phone("Phone", "+375447651465", 8, 2) {
            @Override
            public boolean firmware(int firmwareVersion) {
                boolean isFirmwareUpToDate = false;
                if (firmwareVersion >= 3){
                    isFirmwareUpToDate = true;
                }
                return isFirmwareUpToDate;
            }
        };

        Phone samsung = new AndroidPhone("Samsung Galaxy", "+375293295760", 10, 15);

        Phone iPhone = new ApplePhone("iPhone 15", "+375293295760", 10, 21);

        Phone windowsPhone = new WindowsPhone("Surface Duo", "+375441234567", 9, 2);


        PhoneQualityCheckServiceImpl checkService = new PhoneQualityCheckServiceImpl();

        checkService.check(phone);

        checkService.check(samsung);

        checkService.check(iPhone);

        checkService.check(windowsPhone);

    }
}
