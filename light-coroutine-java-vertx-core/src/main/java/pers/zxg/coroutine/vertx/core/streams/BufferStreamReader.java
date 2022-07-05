/*
 * Copyright (c) 2022, Xianguang Zhou <xianguang.zhou@outlook.com>. All rights reserved.
 */
package pers.zxg.coroutine.vertx.core.streams;

import java.io.EOFException;
import java.util.concurrent.ExecutionException;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.parsetools.JsonEvent;
import io.vertx.core.streams.ReadStream;
import pers.zxg.coroutine.Coroutine.OutsideCall;
import pers.zxg.coroutine.Coroutine.Suspend;
import pers.zxg.coroutine.Coroutine.Weaver.NotWeaved;

/**
 * @author <a href="mailto:xianguang.zhou@outlook.com">Xianguang Zhou</a>
 */
public class BufferStreamReader extends StreamReader<Buffer> {

	public BufferStreamReader(ReadStream<Buffer> stream) {
		super(stream);
		throw new NotWeaved();
	}

	public Buffer readAll() throws Suspend, ExecutionException, OutsideCall {
		throw new NotWeaved();
	}

	public Buffer read(int n) throws Suspend, ExecutionException, OutsideCall {
		throw new NotWeaved();
	}

	public Buffer readLine() throws Suspend, ExecutionException, OutsideCall {
		throw new NotWeaved();
	}

	public Buffer readExactly(int n) throws Suspend, EOFException, ExecutionException, OutsideCall {
		throw new NotWeaved();
	}

	public Buffer readUntil() throws Suspend, EOFException, ExecutionException, OutsideCall {
		throw new NotWeaved();
	}

	public Buffer readUntil(String separator) throws Suspend, EOFException, ExecutionException, OutsideCall {
		throw new NotWeaved();
	}

	public Buffer readUntil(Buffer separator) throws Suspend, EOFException, ExecutionException, OutsideCall {
		throw new NotWeaved();
	}

	public JsonEvent readJsonObject() throws Suspend, EOFException, ExecutionException, OutsideCall {
		throw new NotWeaved();
	}

	public JsonEvent readJsonArray() throws Suspend, EOFException, ExecutionException, OutsideCall {
		throw new NotWeaved();
	}
}
