package com.xivs.WebLab3333.MainPage;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;

public class History implements Serializable {
        public LinkedList<HistoryItem> history;
        public History(){
            this.history = new LinkedList<>();
        }
        public void addItem(HistoryItem item){
            this.history.add(item);
        }
        public LinkedList<HistoryItem> getHistory(){
            return this.history;
        }
}
