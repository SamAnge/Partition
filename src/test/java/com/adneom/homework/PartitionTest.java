package com.adneom.homework;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class PartitionTest {

    private Partition instance;
    private List<Integer> inputList;

    @Before
    public void setUp(){
        instance = new Partition();
        inputList = Arrays.asList(1, 2, 3, 0, 4, 5, 6, 0, 7, 8);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldFailedWhenPartitionSizeIs0() {
        int expectedLength = 0;
        instance.partition(inputList, expectedLength);

        assertThat("The expectedLength should be equal to 0 ", expectedLength, is(0));

    }

    @Test
    public void shouldReturned10WhenPartitionSizeIs1() {
        int expectedLength = 1;
        List<List <Integer>> subSets = instance.partition(inputList, expectedLength);

        List<Integer> lastPartition = subSets.get(9);
        List<Integer> expectedLastPartition = Collections.singletonList(8);

        assertEquals(subSets.size(), 10);
        assertEquals(lastPartition, expectedLastPartition);
    }

    @Test
    public void shouldReturned5SubListsWhenPartitionSizeIs2() {

        int expectedListSize = 2;
        List<List <Integer>> subSets = instance.partition(inputList, expectedListSize);

        List<Integer> lastPartition = subSets.get(4);
        List<Integer> expectedLastPartition = Arrays.asList(7, 8);

        assertEquals(subSets.size(), 5);
        assertEquals(lastPartition, expectedLastPartition);
    }

    @Test
    public void shouldReturned4SubListsWhenPartitionSizeIs3() {
        int expectedListSize = 3;
        List<List <Integer>> subSets = instance.partition(inputList, expectedListSize);

        List<Integer> lastPartition = subSets.get(3);
        List<Integer> expectedLastPartition = Collections.singletonList(8);

        assertEquals(subSets.size(), 4);
        assertEquals(lastPartition, expectedLastPartition);
    }
}