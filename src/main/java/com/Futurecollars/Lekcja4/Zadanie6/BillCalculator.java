package com.Futurecollars.Lekcja4.Zadanie6;

public class BillCalculator {
    double BillValue;
    float service;
    double promo;
    short addPay;

    double calculateBasicBill(double BillValue, float service) {
        this.BillValue = BillValue;
        this.service = service;
        return service + BillValue;

    }

    double calculateBillWithAdditionalPay(double BillValue, float service, short addPay) {
        this.BillValue = BillValue;
        this.service = service;
        this.addPay = addPay;
        return service + BillValue + addPay;

    }

    double calculateBillWithPromo(double BillValue, float service, double promo) {
        this.BillValue = BillValue;
        this.service = service;
        this.promo = promo;
        return service + BillValue - (BillValue / promo);

    }


}
