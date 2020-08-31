package com.scalaspring.service

import com.scalaspring.model.Student
import com.scalaspring.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentService @Autowired() (private val studentrepo: StudentRepository){
  def getStudents = studentrepo.findAll()
  def getStudent(id: Int) = studentrepo.findById(id)
  def createStudent(student: Student) = studentrepo.save(student)
  def deleteStudent(id: Int) = studentrepo.deleteById(id)
}
