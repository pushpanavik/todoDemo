package com.bridgeit.todo.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
public class UserHandler {

	public Mono<ServerResponse> helloworld(ServerRequest request) {
		return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
				.body(BodyInserters.fromObject("Hello World!"));
	}
}
