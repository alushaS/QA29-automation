package com.tms.lesson8.domain;

import com.tms.lesson8.service.PhoneQualityCheckService;

public class PhoneQualityCheckServiceImpl implements PhoneQualityCheckService {

    @Override
    public void check(Phone phone) {
        System.out.println("Проверка телефона " + (phone.getModel()) + ":");
        phone.call(phone.getNumber());
        phone.play(phone.getVolume());
        phone.firmware(phone.getFirmwareVersion());
        if (!phone.firmware(phone.getFirmwareVersion())){
            System.out.println("Версия прошивки устарела");
        } else {
            System.out.println("Версия прошивки обновлена");
        }
        System.out.println("Проверка работоспособности телефона завершена");
        System.out.println("================================================");

    }
}
