package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.DoctorSmallTO;
import com.capgemini.wsb.persistence.entity.DoctorEntity;
public final class DoctorSmallMapper {
    public static DoctorSmallTO mapToTO(final DoctorEntity doctorEntity) {
        if (doctorEntity == null) {
            return null;
        }
        final DoctorSmallTO doctorSmallTO = new DoctorSmallTO();
        doctorSmallTO.setId(doctorEntity.getId());
        doctorSmallTO.setFirstName(doctorEntity.getFirstName());
        doctorSmallTO.setLastName(doctorEntity.getLastName());
        return doctorSmallTO;
    }

    public static DoctorEntity mapToEntity(final DoctorSmallTO doctorSmallTO) {
        if (doctorSmallTO == null) {
            return null;
        }
        final DoctorEntity doctorEntity = new DoctorEntity();
        doctorEntity.setId(doctorSmallTO.getId());
        doctorEntity.setFirstName(doctorSmallTO.getFirstName());
        doctorEntity.setLastName(doctorSmallTO.getLastName());
        return doctorEntity;
    }
}