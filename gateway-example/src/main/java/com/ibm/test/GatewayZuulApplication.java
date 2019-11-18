/*
 * @Description: In User Settings Edit
 * @Author: your name
 * @Date: 2019-08-12 13:44:59
 * @LastEditTime: 2019-08-13 13:15:44
 * @LastEditors: Please set LastEditors
 */
package com.ibm.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GatewayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayZuulApplication.class, args);
	}
}
