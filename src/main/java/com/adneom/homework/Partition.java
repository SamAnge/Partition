package com.adneom.homework;

import com.google.common.collect.Lists;

import java.util.List;

class Partition {

    List<List <Integer>> partition(List<Integer> inputList, int subListSize){
        return Lists.partition(inputList, subListSize);
    }
}