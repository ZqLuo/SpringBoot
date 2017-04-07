package com.example;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	@RequestMapping("/")
	String index(){

		System.out.print("123");
		return "Hello World!";
	}

	public static void main(String[] args) {
		//定制Banner,在Resource文件夹下新建banner.txt，http://patorjk.com/software/taag 生成内容

		SpringApplication app = new SpringApplication(DemoApplication.class);
		//关闭banner
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
}
