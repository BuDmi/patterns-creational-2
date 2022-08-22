package org.example;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for(int value: source) {
            if (value > this.treshold) {
                logger.log("Элемент '" + value + "' проходит");
                result.add(value);
            } else {
                logger.log("Элемент '" + value + "' не проходит");
            }
        }
        logger.log("Прошло фильтр: " + result.size() + " из " + source.size() + " элементов");
        return result;
    }
}