package com.scalaspring

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.{EnableAutoConfiguration, SpringBootApplication}
import org.springframework.boot.context.properties.EnableConfigurationProperties
import com.scalaspring.config.ApplicationProperties

@SpringBootApplication
@EnableAutoConfiguration
@EnableConfigurationProperties(Array(classOf[ApplicationProperties]))
class ScalaspringConf {

}

object ScalaspringApplication extends App {
	SpringApplication.run(classOf[ScalaspringConf])
}