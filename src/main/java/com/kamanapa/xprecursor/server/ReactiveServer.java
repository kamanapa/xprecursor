package com.kamanapa.xprecursor.server;

import reactor.core.publisher.Mono;

import java.util.function.Function;

public interface ReactiveServer {
  static ReactiveServer create(String host, int port) {
    return new DefaultReactiveServer(host, port);
  }
  ReactiveServer handle(Function<Connection, Mono<Void>> connectionsHandler);
  Mono<Void> start();
}