package com.boot.demo.justgifit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author bsunil
 *
 */
@SpringBootApplication
public class JustGifItApplication {
	/**
	 * to trigger the boot app
	 */
	public static void main(final String[] args) {
		System.out.println("Hello from spring boot");
		SpringApplication.run(JustGifItApplication.class, args);
	}
}
