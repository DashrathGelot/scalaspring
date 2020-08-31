package com.scalaspring.web.rest

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import com.scalaspring.service.SampleService
import org.springframework.web.bind.annotation.{RequestMapping, RequestParam, RestController}

@RestController
@RequestMapping(Array("/api"))
class SampleController @Autowired() (private val sampleService: SampleService) {

  private val log = LoggerFactory.getLogger(classOf[SampleController])

  @RequestMapping(Array("/sample"))
  def sample(@RequestParam name: String) : String = {
    log.debug("inside sample()")
    sampleService.sayHello(name)
  }
}
