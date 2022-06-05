/*
 * Copyright (c) 2022, Xianguang Zhou <xianguang.zhou@outlook.com>. All rights reserved.
 */
package pers.zxg.coroutine.vertx.core.streams;

import java.io.EOFException;
import java.util.concurrent.ExecutionException;

import io.vertx.core.streams.ReadStream;
import pers.zxg.coroutine.Coroutine.OutsideCall;
import pers.zxg.coroutine.Coroutine.Suspend;
import pers.zxg.coroutine.Coroutine.Weaver.NotWeaved;

/**
 * @author <a href="mailto:xianguang.zhou@outlook.com">Xianguang Zhou</a>
 */
public class StreamReader<T> {

	public StreamReader(ReadStream<T> stream) {
		throw new NotWeaved();
	}

	public T read() throws Suspend, EOFException, ExecutionException, OutsideCall {
		throw new NotWeaved();
	}

	public boolean atEnd() {
		throw new NotWeaved();
	}

	public ReadStream<T> stream() {
		throw new NotWeaved();
	}
}
