package com.phanidharsai.designpatterns.structural.adaptor.main;

import com.phanidharsai.designpatterns.structural.adaptor.spare.MuscleCar;

public class CarMapper implements Car{
    MuscleCar mC = new MuscleCar();
    @Override
    public void ride(String input) {
        mC.rideMe(input);
    }
}
