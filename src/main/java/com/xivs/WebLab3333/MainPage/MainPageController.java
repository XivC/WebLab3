package com.xivs.WebLab3333.MainPage;

import javax.inject.Inject;

public class MainPageController {
    @Inject
    DataFormController dataFormController;
    @Inject
    History history;

    private boolean calculateShot(double x, double y, double r){
        
    }
    public void submit(){
        double x = this.dataFormController.getX();
        double y = this.dataFormController.getYValue();
        double r = this.dataFormController.getR();
        boolean isHit = this.calculateShot(x, y, r);

    }

}
