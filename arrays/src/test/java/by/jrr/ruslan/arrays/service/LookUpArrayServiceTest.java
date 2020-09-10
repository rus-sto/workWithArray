package by.jrr.ruslan.arrays.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LookUpArrayServiceTest {

    @Test
    void findMaxTest() {
        LookUpArrayService lookUpArrayService = new LookUpArrayService();
        int[] array = {2, 4, 6, 8, 1, 3};
        int expected = 8;
        int actual = lookUpArrayService.findMax(array);
        assertEquals(expected, actual);
    }
    @Test
    void findMaxTestArrayZero() {
        LookUpArrayService lookUpArrayService = new LookUpArrayService();
        int[] array = {};
        int expected = 0;
        int actual = lookUpArrayService.findMax(array);
        assertEquals(expected, actual);
    }

     @Test
    void findMinTest() {
        LookUpArrayService lookUpArrayService = new LookUpArrayService();
        int[] array = {2, 4, 6, 8, 1, 3};
        int expected = 1;
        int actual = lookUpArrayService.findMin(array);
        assertEquals(expected, actual);
    }
    @Test
    void findMinTestArrayZero() {
        LookUpArrayService lookUpArrayService = new LookUpArrayService();
        int[] array = {};
        int expected = 0;
        int actual = lookUpArrayService.findMin(array);
        assertEquals(expected, actual);
    }

    @Test
    void indexOfMaxTest() {
        LookUpArrayService lookUpArrayService = new LookUpArrayService();
        int[] array = {2, 4, 6, 8, 1, 3};
        int expected = 3;
        int actual = lookUpArrayService.indexOfMax(array);
        assertEquals(expected, actual);
    }
    @Test
    void indexOfMaxTestArrayZero() {
        LookUpArrayService lookUpArrayService = new LookUpArrayService();
        int[] array = {};
        int expected = -1;
        int actual = lookUpArrayService.indexOfMax(array);
        assertEquals(expected, actual);
    }

    @Test
    void indexOfMinTest() {
        LookUpArrayService lookUpArrayService = new LookUpArrayService();
        int[] array = {2, 4, 6, 8, 1, 3};
        int expected = 4;
        int actual = lookUpArrayService.indexOfMin(array);
        assertEquals(expected, actual);
    }
    @Test
    void indexOfMinTestArrayZero() {
        LookUpArrayService lookUpArrayService = new LookUpArrayService();
        int[] array = {};
        int expected = -1;
        int actual = lookUpArrayService.indexOfMin(array);
        assertEquals(expected, actual);
    }

    @Test
     void indexOfTest() {
        LookUpArrayService lookUpArrayService = new LookUpArrayService();
        int[] array = {2, 4, 6, 8, 1, 3};
        int value=6;
        int expected =2;
        int actual = lookUpArrayService.indexOf(array,value);
        assertEquals(expected,actual);
    }
    @Test
    void indexOfTestArrayZero() {
        LookUpArrayService lookUpArrayService = new LookUpArrayService();
        int[] array = {};
        int value=6;
        int expected =-1;
        int actual = lookUpArrayService.indexOf(array,value);
        assertEquals(expected,actual);
    }

}