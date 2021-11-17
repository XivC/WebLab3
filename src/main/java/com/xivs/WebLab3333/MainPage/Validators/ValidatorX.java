package com.xivs.WebLab3333.MainPage.Validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("validatorX")
public class ValidatorX implements Validator<Object> {

    private final FacesMessage numberFormatExceptionMessage = new FacesMessage("Введите число");
    private final FacesMessage outOfBoundsExceptionMessage = new FacesMessage("Число выходит за допустимые пределы");

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        double x;
        try {
            x = Double.parseDouble(value.toString());
        } catch (Exception ex) {
            ((UIInput) component).setValid(false);
            ((UIInput) component).setValue(0);
            numberFormatExceptionMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
            context.addMessage(component.getClientId(context), numberFormatExceptionMessage);
            throw new ValidatorException(numberFormatExceptionMessage);
        }
        double upperBound = 3D;
        double lowerBound = -5D;
        if (x < lowerBound || x > upperBound) {
            ((UIInput) component).setValid(false);
            ((UIInput) component).setValue(0);
            outOfBoundsExceptionMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
            context.addMessage(component.getClientId(context), outOfBoundsExceptionMessage);
            throw new ValidatorException(outOfBoundsExceptionMessage);

        }
    }
}
