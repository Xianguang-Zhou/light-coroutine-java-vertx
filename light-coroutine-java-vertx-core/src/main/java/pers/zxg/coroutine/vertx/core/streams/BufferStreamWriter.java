/*
 * Copyright (c) 2022, Xianguang Zhou <xianguang.zhou@outlook.com>. All rights reserved.
 */
package pers.zxg.coroutine.vertx.core.streams;

import io.vertx.core.Future;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.streams.WriteStream;
import pers.zxg.coroutine.Coroutine.Weaver.NotWeaved;

/**
 * @author <a href="mailto:xianguang.zhou@outlook.com">Xianguang Zhou</a>
 */
public class BufferStreamWriter extends StreamWriter<Buffer> {

	public BufferStreamWriter(WriteStream<Buffer> stream) {
		super(stream);
		throw new NotWeaved();
	}

	public Future<Void> write(String data) {
		throw new NotWeaved();
	}

	public Future<Void> write(byte[] data) {
		throw new NotWeaved();
	}

	public Future<Void> writeStrings(Iterable<String> data) {
		throw new NotWeaved();
	}

	public Future<Void> writeByteArrays(Iterable<byte[]> data) {
		throw new NotWeaved();
	}

	public Future<Void> writeBuffers(Iterable<Buffer> data) {
		throw new NotWeaved();
	}
}
