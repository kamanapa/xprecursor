package com.kamanapa.xprecursor.server;

import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.nio.ByteBuffer;

public interface Connection extends AutoCloseable {
  Flux<ByteBuffer> receive();
  Mono<Void> send(Publisher<ByteBuffer> dataStream);
}