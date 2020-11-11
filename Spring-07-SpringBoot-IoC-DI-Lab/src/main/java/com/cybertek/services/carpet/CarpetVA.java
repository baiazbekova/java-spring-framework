package com.cybertek.services.carpet;

import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrices.Carpet;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CarpetVA implements Carpet {

    //dummy data that will run one time first time
    private static final Map<City, BigDecimal> sqPriceForCity = new HashMap<>();

    static{
        sqPriceForCity.put(City.MCLean, new BigDecimal("4.32"));
        sqPriceForCity.put(City.ARLINGTON, new BigDecimal("2.98"));
        sqPriceForCity.put(City.FAIRFAX, new BigDecimal("5.02"));
    }



    @Override
    public BigDecimal getSqFtPrice(City city) {

        //entrySet() converts map to set
        //below is stream
       Optional<Map.Entry <City,BigDecimal>> collect = sqPriceForCity.entrySet().stream().filter(x -> x.getKey() == city).findFirst();









        return null;
    }
}
