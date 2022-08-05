public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    //Станции
    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    // Текущая станция
    public void station() {
        if (currentStation >= 9) {
            currentStation++;
        }
    }

    // следущая
    public void nextStation() {
        if (currentStation > 0) {
            currentStation++;
        }
    }

    //Предыдущая станция
    public void pastStation() {
        if (currentStation > 0) {
            currentStation--;
        }
    }

    // Станция С 9 на 0
    public void lopedStation() {
        if (currentStation >= 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    // Станция с 0 на 9
    public void reverseStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    //Текущая громкость
    public void volume() {
        if (currentVolume <= 0) {
            currentVolume++;
        }
    }

    //Повышение громкости
    public void nextVolume() {
        if (currentVolume > 0) {
            currentVolume++;
        }
    }

    //граничная
    public void pastVolume() {
        if (currentVolume >= 10) {
            currentVolume++;
        } else {
            currentVolume = 10;
        }
    }

    //
    public void volumem() {
        if (currentVolume > 0) {
            currentVolume--;
        }


    }
}
