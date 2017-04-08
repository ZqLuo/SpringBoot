package com.example;

import com.example.properties.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;

//@RestController
@SpringBootApplication
@ConditionalOnWebApplication
public class DemoApplication {

	@Value("${book.author}")
	private String bookAuthoer;
	@Value("${book.name}")
	private String bookName;
	@Autowired
	private AuthorSettings authorSettings;

//	@RequestMapping("/")
//	String index(){
//		return "book name is:" + bookName + " and book author is " + authorSettings.getName();
//	}

	public static void main(String[] args) {
		//定制Banner,在Resource文件夹下新建banner.txt，http://patorjk.com/software/taag 生成内容

		SpringApplication app = new SpringApplication(DemoApplication.class);
		//关闭banner
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
}
