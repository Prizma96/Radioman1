package ru.netology.smarthouse;

public class Radio {

    private int currentStation;
    private int numberOfStations = 10;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
    }

    public Radio(int numberOfStations) {
        if (numberOfStations < 10) {
            numberOfStations = 10;
        }
        this.numberOfStations = numberOfStations;
    }


    public int getNumberOfStations() {
        return numberOfStations;
    }

    public void setNumberOfStations(int numberOfStations) {
        if (numberOfStations < 10) {
            numberOfStations = 10;
        }
        this.numberOfStations = numberOfStations;
    }

    public int getMaxStation() {
        maxStation = numberOfStations - 1;
        return maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation < numberOfStations - 1)
            currentStation = currentStation + 1;
    }

    public void prevStation() {
        if (currentStation > minStation)
            currentStation = currentStation - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    }

    public void plusVolume() {
        if (currentVolume < maxVolume) {
            currentVolume += 1;
        }
    }

    public void minusVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

}