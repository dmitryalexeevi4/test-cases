package com.github.dmitryalexeevi4.pages;

import java.util.*;

public class CommonData {
    public final static String KEY_CAR_COUNT_FROM_MAIN_PAGE = "advCountFromMainPage";
    public final static String KEY_MODEL_COUNT_FROM_CAR_PAGE = "modelAdvCountFromCarPage";

    private static CommonData INSTANCE;

    private final Map<String, Integer> pageData;

    public static CommonData instance() {
        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new CommonData();
        }
        return INSTANCE;
    }

    private CommonData() {
        pageData = new HashMap<>();
    }

    public void saveData(String key, int data) {
        pageData.put(key, data);
    }

    public int getData(String key) {
        return pageData.get(key);
    }
}
