package com.xivs.WebLab3333.MainPage.Listeners;


import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.event.*;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class YCheckBoxSelectedListener implements ValueChangeListener {

    @Override
    public void processValueChange(ValueChangeEvent event) throws AbortProcessingException {
        FacesContext context = event.getFacesContext();
        String y_checkbox_id = "y_checkbox_";
        String selfId = event.getComponent().getId();
        System.out.println("12323223");
        LinkedList<UIComponent> y_checkboxes = (LinkedList<UIComponent>) context.getViewRoot().getFacets().values().stream().filter(
                comp ->  {
                    if (!comp.getId().equals(selfId) && comp.getId().matches(y_checkbox_id)){
                        ((UIInput)comp).setValue(false);
                        return true;
                    }
                    return false;
                }
        ).collect(Collectors.toList());
    }
}
