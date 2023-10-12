package ru.netology.radio.hmoop;
public class Radio {
    private final int maxRadioStation;
    private int minRadioStation;
    private int currentRadioStation;
    private int currentVolume;
    public Radio() {
        this.maxRadioStation = 9;
        this.minRadioStation = 0;
    }
    public Radio(int stationsCount) {
        this.maxRadioStation = stationsCount - 1;
    }
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }
    public void nextRadioStation() {
        if (currentRadioStation != maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minRadioStation;
        }
    }
    public void prevRadioStation() {
        if (currentRadioStation != minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }
    public int getCurrentVolume() {
        return currentVolume;
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