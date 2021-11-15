package com.xivs.WebLab3333.MainPage;

import java.time.LocalDateTime;

public class HistoryItem {
    private Double x;
    private Double y;
    private Double r;
    private Boolean isHit;


    public HistoryItem(Double x, Double y, Double r, Boolean isHit){
        this.x = x;
        this.y = y;
        this.r = r;
        this.isHit = isHit;


    }
    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getR() {
        return r;
    }

    public void setR(Double r) {
        this.r = r;
    }

    public Boolean getHit() {
        return isHit;
    }

    public void setHit(Boolean hit) {
        isHit = hit;
    }


}
