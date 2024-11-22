package com.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/data")
public class Aws {
	@GetMapping(value="/sst")
	public String getMethodName(String a) {
	    return "AWS";
}
}

