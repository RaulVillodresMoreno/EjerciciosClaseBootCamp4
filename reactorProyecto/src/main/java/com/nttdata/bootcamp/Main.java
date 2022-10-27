package com.nttdata.bootcamp;

import reactor.core.publisher.Flux;
public class Main {
	public static void main(String[] args) {
		Flux<String> messageSender = Flux.just("Mensaje1", "Mensaje2", "Mensaje3");
		
		messageSender.subscribe(suscribe -> System.out.println("Observer 1. Suscribed"), 
				next -> System.out.println("Observer 1. Received" + m), 
				error -> System.out.println("Observer 1 Error"),
				completed -> System.out.println("Observer")
				);
	}
}
