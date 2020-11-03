package main.java.service;

public class Licensing {

    public Double getLicensingCost(Integer licensingMode, double memory, double documents) {
        double price = 0;
        if (licensingMode == 1) {
            price = documentPriceCalculator(documents);
        } else if (licensingMode == 2) {
            price = dataPriceCalculator(memory);
        }
        return price;
    }

    private Double dataPriceCalculator(double memory) {
        double price = 0;
        int tbStandard = 1000;
        int standardPrice = 100000;
        double sumPrice = 0;

        if (memory <= 99) {
            price = 5000;
        } else if (memory <= 999) {
            price = 50000;
        } else if (memory == 1000) {
            price = 100000;
        } else {
            double tbCurrent = memory / tbStandard;
            for (int i = 1; i < tbCurrent + 1; i++) {
                sumPrice += standardPrice * 0.95;
                price = standardPrice + sumPrice;
            }
        }
        return price;
    }

    private Double documentPriceCalculator(Double documents) {
        double price = 0;
        int tbStandard = 100000000;
        int standardPrice = 50000;
        double remDocuments;

        if (documents <= 999) {
            price = 200;
        } else if (documents <= 49999) {
            price = 5000;
        } else if (documents <= 499999) {
            price = 10000;
        } else if (documents == 100000000) {
            price = 50000;
        } else {
            remDocuments = documents - tbStandard;
            for (int i = 1; i <= remDocuments; i++) {
                price += 0.0005;
            }

        }
        return price + standardPrice;
    }
}

