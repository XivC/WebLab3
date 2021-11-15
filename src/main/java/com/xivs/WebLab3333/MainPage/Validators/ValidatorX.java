package com.xivs.WebLab3333.MainPage.Validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("validatorX")
public class ValidatorX implements Validator<String> {

    private final FacesMessage numberFormatExceptionMessage = new FacesMessage("Введите число");
    private final FacesMessage outOfBoundsExceptionMessage = new FacesMessage("Число выходит за допустимые пределы");
    @Override
    public void validate(FacesContext context, UIComponent component, String value) throws ValidatorException {
        double x;
        try{
            x = Double.parseDouble(value);
        }
        catch (NumberFormatException ex){
          numberFormatExceptionMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
          throw new ValidatorException(numberFormatExceptionMessage);
        }
        double upperBound = 3D;
        double lowerBound = -5D;
        if (x < lowerBound || x > upperBound){
            outOfBoundsExceptionMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(outOfBoundsExceptionMessage);

        }
    }
}
