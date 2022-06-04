/*
 * Copyright (c) 2022, Xianguang Zhou <xianguang.zhou@outlook.com>. All rights reserved.
 */
package pers.zxg.coroutine.vertx.core.streams;

import io.vertx.core.Future;
import io.vertx.core.streams.WriteStream;
import pers.zxg.coroutine.Coroutine.OutsideCall;
import pers.zxg.coroutine.Coroutine.Suspend;
import pers.zxg.coroutine.Coroutine.Weaver.NotWeaved;

/**
 * @author <a href="mailto:xianguang.zhou@outlook.com">Xianguang Zhou</a>
 */
public class StreamWriter<T> {

	public StreamWriter(WriteStream<T> stream) {
		throw new NotWeaved();
	}

	public Future<Void> write(T data) {
		throw new NotWeaved();
	}

	public void drain() throws Suspend, OutsideCall {
		throw new NotWeaved();
	}

	public Future<Void> end(T data) {
		throw new NotWeaved();
	}

	public Future<Void> end() {
		throw new NotWeaved();
	}

	public WriteStream<T> stream() {
		throw new NotWeaved();
	}
}
