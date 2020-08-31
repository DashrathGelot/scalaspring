package com.scalaspring.model

import javax.persistence.{Entity, GeneratedValue, Id}
import scala.beans.BeanProperty

@Entity
class Student {
  @Id
  @GeneratedValue
  @BeanProperty
  var id: Int = _

  @BeanProperty
  var sName: String = _

  @BeanProperty
  var cpp: Int = _

  @BeanProperty
  var dbms: Int = _

  @BeanProperty
  var java: Int = _
}
