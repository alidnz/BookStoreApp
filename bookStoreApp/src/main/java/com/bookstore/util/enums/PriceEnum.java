package com.bookstore.util.enums;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public enum PriceEnum {
    İstanbul(3),
    Ankara(2),
    İzmir(1);

    private static final Map<Integer, PriceEnum> valueMap = new HashMap<>();

    static{
        for(PriceEnum p : PriceEnum.values()){
            valueMap.put(p.getValue(), p);
        }
    }

    private Integer value;

    PriceEnum(Integer value) {
        this.value = value;
    }
}