package com.bridgeit.todo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.bridgeit.todo.controller.UserHandler;


@Configuration
@ComponentScan("com.bridgeit.todo")
public class ApplicationConfiguration {

	@Bean
	public RouterFunction<ServerResponse> route(UserHandler userHandler){
		return RouterFunctions.route(RequestPredicates.GET("/helloworld"),userHandler::helloworld);
	}
}
