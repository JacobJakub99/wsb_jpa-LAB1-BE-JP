package com.capgemini.wsb.persistence.dao;

import com.capgemini.wsb.persistence.entity.PatientEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class PatientDaoTest {

    @Autowired
    private PatientDao patientDao;

    @Test
    void findPatientByLastNameTest() {
        //given
        //when
        List<PatientEntity> patientEntityList = patientDao.findPatientByName("Zieliński");
        //then
        assertEquals(1, patientEntityList.size());
    }

    @Test
    void findPatientsWithMoreThanXVisits(){
        //given
        //when
        int x = 1;
        //then
        assertEquals(5, patientDao.findPatientsWithMoreThanXVisits(x).size());
    }

    @Test
    void findPatientsWithInsurance(){
        //given
        //when
        List<PatientEntity> patientEntityList = patientDao.findPatientsWithInsurance();
        //then
        assertEquals(3, patientEntityList.size());
    }
}