-- Dodawanie adresów
INSERT INTO ADDRESS (id, address_line1, address_line2, city, postal_code)
VALUES
    (1, 'ul. Ogrodowa 2', NULL, 'Warszawa', '00-002'),
    (2, 'ul. Polna 6', NULL, 'Kraków', '30-006'),
    (3, 'ul. Zielona 12', NULL, 'Gdańsk', '80-012'),
    (4, 'ul. Łąkowa 22', NULL, 'Wrocław', '50-022'),
    (5, 'ul. Wierzbowa 4', NULL, 'Poznań', '60-004');

-- Dodawanie lekarzy
INSERT INTO DOCTOR (id, first_name, last_name, telephone_number, email, doctor_number, specialization)
VALUES
    (1, 'Adam', 'Kowalczyk', '234567890', 'adam.kowalczyk@example.com', 'DOC124', 'GP'),
    (2, 'Barbara', 'Wiśniewska', '876543210', 'barbara.wisniewska@example.com', 'DOC457', 'DERMATOLOGIST'),
    (3, 'Cezary', 'Wójcik', '654321987', 'cezary.wojcik@example.com', 'DOC790', 'OCULIST'),
    (4, 'Dorota', 'Nowakowska', '321987654', 'dorota.nowakowska@example.com', 'DOC125', 'SURGEON'),
    (5, 'Ewa', 'Lewandowska', '789654123', 'ewa.lewandowska@example.com', 'DOC458', 'GP');

-- Dodawanie pacjentów
INSERT INTO PATIENT (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, insurance)
VALUES
    (1, 'Grzegorz', 'Zieliński', '112233445', 'grzegorz.zielinski@example.com', 'PAT004', '1991-06-16', TRUE),
    (2, 'Hanna', 'Mazur', '223344556', 'hanna.mazur@example.com', 'PAT005', '1984-11-21', FALSE),
    (3, 'Irena', 'Kwiatkowska', '334455667', 'irena.kwiatkowska@example.com', 'PAT006', '1979-04-26', TRUE),
    (4, 'Jacek', 'Wojciechowski', '445566778', 'jacek.wojciechowski@example.com', 'PAT007', '1986-08-15', FALSE),
    (5, 'Karolina', 'Lewicka', '556677889', 'karolina.lewicka@example.com', 'PAT008', '1993-01-06', TRUE);

-- Dodawanie wizyt
-- Wizyty dla pacjenta 1
INSERT INTO VISIT (id, description, time, PATIENT_ID, DOCTOR_ID)
VALUES
    (1, 'Konsultacja GP', '2024-06-01 10:00:00', 1, 1),
    (2, 'Kontrola po leczeniu', '2024-06-10 14:00:00', 1, 1);

-- Wizyty dla pacjenta 2
INSERT INTO VISIT (id, description, time, PATIENT_ID, DOCTOR_ID)
VALUES
    (3, 'Badanie dermatologiczne', '2024-06-02 11:00:00', 2, 2),
    (4, 'Konsultacja kontrolna', '2024-06-12 10:30:00', 2, 2);

-- Wizyty dla pacjenta 3
INSERT INTO VISIT (id, description, time, PATIENT_ID, DOCTOR_ID)
VALUES
    (5, 'Badanie wzroku', '2024-06-03 09:00:00', 3, 3),
    (6, 'Szczepienie', '2024-06-13 13:00:00', 3, 3);

-- Wizyty dla pacjenta 4
INSERT INTO VISIT (id, description, time, PATIENT_ID, DOCTOR_ID)
VALUES
    (7, 'Konsultacja chirurgiczna', '2024-06-04 10:15:00', 4, 4),
    (8, 'Kontrola po zabiegu', '2024-06-14 12:30:00', 4, 4);

-- Wizyty dla pacjenta 5
INSERT INTO VISIT (id, description, time, PATIENT_ID, DOCTOR_ID)
VALUES
    (9, 'Konsultacja GP', '2024-06-05 11:00:00', 5, 5),
    (10, 'Badanie kontrolne', '2024-06-15 15:30:00', 5, 5);

-- Dodawanie leczenia medycznego
INSERT INTO MEDICAL_TREATMENT (id, description, type, VISIT_ID)
VALUES
    (1, 'Przepisanie leków', 'RTG', 1),
    (2, 'Badanie kontrolne', 'EKG', 2),
    (3, 'Badanie dermatologiczne', 'USG', 3),
    (4, 'Badanie obrazowe', 'RTG', 4),
    (5, 'Szczepienie', 'USG', 5),
    (6, 'Kontrola po szczepieniu', 'EKG', 6),
    (7, 'Zabieg chirurgiczny', 'RTG', 7),
    (8, 'Rehabilitacja', 'USG', 8),
    (9, 'Konsultacja GP', 'EKG', 9),
    (10, 'Badanie kontrolne', 'RTG', 10);
