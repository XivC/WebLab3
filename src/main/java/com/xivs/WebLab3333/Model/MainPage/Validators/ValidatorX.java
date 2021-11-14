package com.xivs.WebLab3333.Model.MainPage.Validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class ValidatorX implements Validator<String> {

    private final double lowerBound = -5D;
    private final double upperBound = 3D;
    private final FacesMessage numberFormatExceptionMessage = new FacesMessage("");
    @Override
    public void validate(FacesContext context, UIComponent component, String value) throws ValidatorException {
        double x;
        try{
            x = Double.parseDouble(value);
        }
        catch (NumberFormatException ex){

        }
    }
}
