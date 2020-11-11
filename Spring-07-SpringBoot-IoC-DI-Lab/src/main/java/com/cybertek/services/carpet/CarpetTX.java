package com.cybertek.services.carpet;

import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrices.Carpet;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class CarpetTX implements Carpet {

    private static final Map<City, BigDecimal> sqPriceForCity = new HashMap<>();

    static {
        sqPriceForCity.put(City.DALLAS, new BigDecimal("1.22"));
        sqPriceForCity.put(City.AUSTIN, new BigDecimal("0.98"));
        sqPriceForCity.put(City.SAN_ANTONIO, new BigDecimal("2.05"));
    }


    @Override
    public BigDecimal getSqFtPrice(City city) {

        //if the city is not in the list, then return zero. logic for invalid data
        BigDecimal defaultValue = BigDecimal.ZERO;

        //entrySet() converts map to set
        //below is stream
        //Optional will return exception but it will say that there is no value. if there was no Optional, it would return null pointer exception
        //when there is null pointer exception, you cant understand if the obj is not created or there is no value
        Optional<Map.Entry <City,BigDecimal>> collect = sqPriceForCity.entrySet().stream().filter(x -> x.getKey() == city).findFirst();

        return collect.isPresent() ? collect.get().getValue() : defaultValue;

    }

}
