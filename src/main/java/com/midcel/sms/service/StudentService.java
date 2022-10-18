package com.midcel.sms.service;

import com.midcel.sms.dto.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();

    void createStudent(StudentDto studentDto);

    StudentDto getStudentById(Long studentId);

    void updateStudent(StudentDto studentDto);

    void deleteStudent(Long studentId);
}
