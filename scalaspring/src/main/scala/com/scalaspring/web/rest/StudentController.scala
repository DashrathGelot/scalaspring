package com.scalaspring.web.rest

import com.scalaspring.model.Student
import com.scalaspring.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{PathVariable, RequestBody, RequestMapping, RequestMethod, RestController}

@RestController
class StudentController @Autowired()(private val studentService: StudentService) {

  @RequestMapping(Array("/students"))
  def getStudents = studentService.getStudents

  @RequestMapping(Array("/student/{id}"))
  def getStudent(@PathVariable("id") id: Int) = studentService.getStudent(id)

  @RequestMapping(method = Array(RequestMethod.POST), value = Array("/student"))
  def createStudent(@RequestBody student: Student) = studentService.createStudent(student)

  @RequestMapping(method = Array(RequestMethod.PUT), value=Array("/student"))
  def updateStudent(@RequestBody student: Student) = studentService.createStudent(student)

  @RequestMapping(method = Array(RequestMethod.DELETE), value = Array("/student/{id}"))
  def deleteStudent(@PathVariable("id") id: Int) = studentService.deleteStudent(id)
}
