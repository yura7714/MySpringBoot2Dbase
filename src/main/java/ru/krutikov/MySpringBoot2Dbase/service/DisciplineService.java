package ru.krutikov.MySpringBoot2Dbase.service;

import org.springframework.stereotype.Service;
import ru.krutikov.MySpringBoot2Dbase.entity.Discipline;

import java.util.List;

@Service
public interface DisciplineService {
    List<Discipline> getAllDisciplines();

    Discipline saveDiscipline(Discipline discipline);

    Discipline getDiscipline(int id);

    int deleteDiscipline(int id);
}
