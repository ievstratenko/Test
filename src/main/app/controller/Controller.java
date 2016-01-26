package app.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Value("${myprop}" )
	Object value;

	@Resource
	Environment e;

	@RequestMapping
	Object test(@RequestParam(value = "prop", required = false) String prop) {
		return new Date().toString() + " =myfeature= " + (prop == null ? "" : e.getProperty(prop));
	}
}
