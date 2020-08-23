package edu.learn.openshift.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/api")
public class OpenShiftDemoController {

	@GetMapping("/")
	@ApiOperation(value = "simple message")
	public String welcome() {
		return "Welcome to Openshift";
	}

	@GetMapping("/{user}")
	@ApiOperation(value = "simple message with param")
	public String welcome(@ApiParam(value = "parameter for the message", required = true) @PathVariable String user) {
		return "Welcome to Openshift user " + user;
	}
}
