package com.adneom.homework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        List <Integer> finalList = new ArrayList <>();
        for ( String number : args ) {
            String elementArray = number.replace(",", "");
            int digit = Integer.valueOf(elementArray);
            finalList.add(digit);
        }

        int indexLength = finalList.size() - 1;
        int partLength = finalList.get(indexLength);

        LOGGER.info("PART LENGTH = {} ", partLength);

        finalList.remove(indexLength);
        LOGGER.info("List elements {} ", finalList);

        Partition partition = new Partition();
        LOGGER.info("FINAL RESULT {} ", partition.partition(finalList, partLength));
    }
}
