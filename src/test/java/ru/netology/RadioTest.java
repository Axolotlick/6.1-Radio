package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    //Station

    @Test
    public void shouldTurnUpNextStation () {
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        rad.nextStation();
        int expected = 2;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownPrevStation () {
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        rad.prevStation();
        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStation () {
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        int expected = 1;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }


    @Test
    public void shouldChangeMaxStationToMinIfClickingNext () {
        Radio rad = new Radio();
        rad.setCurrentStation(rad.getMaxStation());
        rad.nextStation();
        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeMinStationToMaxIfClickingPrev () {
        Radio rad = new Radio();
        rad.setCurrentStation(rad.getMinStation());
        rad.prevStation();
        int expected = 9;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax () {
        Radio rad = new Radio();
        rad.setCurrentStation(rad.getMaxStation() + 1);
        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationBelowMin () {
        Radio rad = new Radio();
        rad.setCurrentStation(rad.getMinStation() - 1);
        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStation() {
        Radio rad = new Radio();
        rad.setMaxStation(10);
        int expected = 10;
        int actual = rad.getMaxStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinStation() {
        Radio rad = new Radio();
        rad.setMinStation(1);
        int expected = 1;
        int actual = rad.getMinStation();

        assertEquals(expected, actual);
    }

//Volume

    @Test
    public void shouldNotSetVolumeAboveMax () {
        Radio rad = new Radio();
        rad.setCurrentVolume(rad.getMaxVolume() + 1);
        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin () {
        Radio rad = new Radio();
        rad.setCurrentVolume(rad.getMinVolume() - 1);
        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume () {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        rad.increaseVolume();
        int expected = 2;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume () {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreasesWhenVolumeIsAlreadyMax () {
        Radio rad = new Radio();
        rad.setCurrentVolume(rad.getMaxVolume());
        rad.increaseVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreasesWhenVolumeIsAlreadyMin () {
        Radio rad = new Radio();
        rad.setCurrentVolume(rad.getMinVolume());
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    public void shouldSetMinVolume () {
        Radio rad = new Radio();
        rad.setMinVolume(1);
        int expected = 1;
        int actual = rad.getMinVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume () {
        Radio rad = new Radio();
        rad.setMaxVolume(11);
        int expected = 11;
        int actual = rad.getMaxVolume();

        assertEquals(expected, actual);
    }

}