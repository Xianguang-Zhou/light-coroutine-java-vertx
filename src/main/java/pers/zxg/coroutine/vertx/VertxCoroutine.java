/*
 * Copyright (c) 2022, Xianguang Zhou <xianguang.zhou@outlook.com>. All rights reserved.
 */
package pers.zxg.coroutine.vertx;

import java.util.concurrent.ExecutionException;

import io.vertx.core.Future;
import pers.zxg.coroutine.Coroutine.OutsideCall;
import pers.zxg.coroutine.Coroutine.Suspend;
import pers.zxg.coroutine.Coroutine.Weaver.NotWeaved;

/**
 * @author <a href="mailto:xianguang.zhou@outlook.com">Xianguang Zhou</a>
 */
public class VertxCoroutine {

	public static class OutOfVertxContexts extends RuntimeException {
	}

	public static <T> T await(Future<T> future) throws Suspend, ExecutionException, OutsideCall, OutOfVertxContexts {
		throw new NotWeaved();
	}
}
