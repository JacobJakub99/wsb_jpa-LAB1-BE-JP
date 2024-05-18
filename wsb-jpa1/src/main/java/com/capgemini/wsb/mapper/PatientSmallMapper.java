package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.PatientSmallTO;
import com.capgemini.wsb.persistence.entity.PatientEntity;

public final class PatientSmallMapper {
    public static PatientSmallTO mapToTO(final PatientEntity patientEntity) {
        if (patientEntity == null) {
            return null;
        }
        final PatientSmallTO patientSmallTO = new PatientSmallTO();
        patientSmallTO.setId(patientEntity.getId());
        patientSmallTO.setFirstName(patientEntity.getFirstName());
        patientSmallTO.setLastName(patientEntity.getLastName());
        return patientSmallTO;
    }

    public static PatientEntity mapToEntity(final PatientSmallTO patientSmallTO) {
        if (patientSmallTO == null) {
            return null;
        }
        final PatientEntity patientEntity = new PatientEntity();
        patientEntity.setId(patientSmallTO.getId());
        patientEntity.setFirstName(patientSmallTO.getFirstName());
        patientEntity.setLastName(patientSmallTO.getLastName());
        return patientEntity;
    }
}