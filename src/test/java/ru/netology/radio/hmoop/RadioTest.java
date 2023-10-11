package ru.netology.radio.hmoop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void countSetRadioStation() {
        Radio cond= new Radio (10);
        cond.setCurrentRadioStation(9);
        int expected = 9;
        int actual = cond.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadioStation() {
        Radio radio= new Radio();
        radio.setCurrentRadioStation(1);
        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinSetRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belovMinSetRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxSetRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moreMaxSetRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextSetRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);
        radio.nextRadioStation();
        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextToMaxSetRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.nextRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextWithMaxSetRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevSetRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.prevRadioStation();
        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevMinSetRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        int expected = 50;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MoreMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belovMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(65);
        radio.increaseVolume();
        int expected = 66;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(60);
        radio.reduseVolume();
        int expected = 59;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduseMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}