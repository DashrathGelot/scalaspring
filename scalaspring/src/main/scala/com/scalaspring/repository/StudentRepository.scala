package com.scalaspring.repository

import com.scalaspring.model.Student
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
trait StudentRepository extends CrudRepository[Student, Int]
