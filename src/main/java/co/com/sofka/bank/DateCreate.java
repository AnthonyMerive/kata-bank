package co.com.sofka.bank;

import java.util.Date;

import org.jbehave.core.steps.ParameterConverters.DateConverter;

public class DateCreate {

    public static Date date(String dateString) {
        DateConverter dateConverter = new DateConverter();
        return dateConverter.convertValue(dateString, java.util.Date.class);
    }

}