package com.jenk.pipe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PipelineController {
    @GetMapping("maven")
    public String mavenBuild(){
        return "Teja APP Maven Build";
    }
    @GetMapping("docker")
    public String dockerHub(){
      return "Teja docker hub API";
    }
}
