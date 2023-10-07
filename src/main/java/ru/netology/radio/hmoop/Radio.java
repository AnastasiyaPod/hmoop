package ru.netology.radio.hmoop;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
    public void nextRadioStation() {
        if (currentRadioStation != 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }
    public void prevRadioStation() {
        if (currentRadioStation != 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void increaseVolume() {
        if (currentVolume != 100) {
            currentVolume = currentVolume + 1;
        } else {
            int volume = currentVolume;
        }
    }
    public void reduseVolume() {
        if (currentVolume != 0) {
            currentVolume = currentVolume - 1;
        } else {
            int volume = currentVolume;
        }
    }
}