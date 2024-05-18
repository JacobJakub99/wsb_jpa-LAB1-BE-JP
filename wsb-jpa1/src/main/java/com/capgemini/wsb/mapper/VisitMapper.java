package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.VisitTO;
import com.capgemini.wsb.persistence.entity.VisitEntity;

import java.util.stream.Collectors;

public final class VisitMapper {

    public static VisitTO mapToTO(final VisitEntity visitEntity) {
        if (visitEntity == null)
        {
            return null;
        }
        final VisitTO visitTO = new VisitTO();
        visitTO.setId(visitEntity.getId());
        visitTO.setDescription(visitEntity.getDescription());
        visitTO.setTime(visitEntity.getTime());
        visitTO.setPatient(PatientSmallMapper.mapToTO(visitEntity.getPatient()));
        visitTO.setDoctor(DoctorSmallMapper.mapToTO(visitEntity.getDoctor()));
        if (visitEntity.getMedicalTreatments() != null) {
            visitTO.setMedicalTreatments(visitEntity.getMedicalTreatments().stream().map(MedicalTreatmentMapper::mapToTO).collect(Collectors.toList()));
        }
        return visitTO;
    }

    public static VisitEntity mapToEntity(final VisitTO visitTO) {
        if (visitTO == null)
        {
            return null;
        }
        final VisitEntity visitEntity = new VisitEntity();
        visitEntity.setId(visitTO.getId());
        visitEntity.setDescription(visitTO.getDescription());
        visitEntity.setTime(visitTO.getTime());
        visitEntity.setPatient(PatientSmallMapper.mapToEntity(visitTO.getPatient()));
        visitEntity.setDoctor(DoctorSmallMapper.mapToEntity(visitTO.getDoctor()));

        if (visitTO.getMedicalTreatments() != null) {
            visitEntity.setMedicalTreatments(visitTO.getMedicalTreatments().stream().map(MedicalTreatmentMapper::mapToEntity).collect(Collectors.toList()));
        }
        return visitEntity;
    }
}