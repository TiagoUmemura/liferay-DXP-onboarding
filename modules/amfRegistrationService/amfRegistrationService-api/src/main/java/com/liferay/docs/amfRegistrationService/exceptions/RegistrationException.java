package com.liferay.docs.amfRegistrationService.exceptions;

import com.liferay.portal.kernel.exception.PortalException;

import java.util.List;

public class RegistrationException extends PortalException {
    private List<String> errors;

    public RegistrationException(){}

    public RegistrationException(List<String> errors){
        this.errors = errors;
    }

    public List<String> getErrors() {
        return errors;
    }
}
