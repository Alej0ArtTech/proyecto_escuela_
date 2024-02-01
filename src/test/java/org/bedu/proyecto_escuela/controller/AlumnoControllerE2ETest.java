package org.bedu.proyecto_escuela.controller;


import org.bedu.proyecto_escuela.mapper.AlumnoMapper;
import org.bedu.proyecto_escuela.repository.AlumnoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;


@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//Anotacion para trabajar con mock en ambiente MVC:
@AutoConfigureMockMvc
//
@ExtendWith(SpringExtension.class)
@SpringBootTest

class AlumnoControllerE2ETest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private AlumnoRepository repository;

    private AlumnoMapper mapper = new AlumnoMapper();

    @BeforeEach
    public void setup() {
        repository.deleteAll();
    }

    @Test
    @DisplayName("GET /A")



}

