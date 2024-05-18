package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.dto.VisitTO;
import com.capgemini.wsb.service.DoctorService;
import com.capgemini.wsb.service.PatientService;
import com.capgemini.wsb.service.VisitService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PatientServiceImplTest {

    @Autowired
    PatientService patientService;

    @Autowired
    VisitService visitService;

    @Autowired
    DoctorService doctorService;

    @Test
    void findById(){
        //given
        //when
        PatientTO patientTO =  patientService.findById(1L);
        //then
        assertTrue(patientTO.getInsurance());
    }

    @Test
    void deleteById() {
        //given
        //when
        patientService.deleteById(1L);
        //then
        assertNull(patientService.findById(1L));
        assertNull(visitService.findById(1L));
        assertNull(visitService.findById(2L));
        assertNotNull(doctorService.findById(1L));
    }

    @Test
    void getPatientVisits() {
        //given
        //when
        List<VisitTO> visitTOList = patientService.getPatientVisits(1L);
        //then
        assertEquals(2, visitTOList.size());
    }
}