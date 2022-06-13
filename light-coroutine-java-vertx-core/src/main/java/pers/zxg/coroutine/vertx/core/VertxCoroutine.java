/*
 * Copyright (c) 2022, Xianguang Zhou <xianguang.zhou@outlook.com>. All rights reserved.
 */
package pers.zxg.coroutine.vertx.core;

import java.util.concurrent.ExecutionException;

import io.vertx.core.Context;
import io.vertx.core.Future;
import pers.zxg.coroutine.Coroutine.Callable;
import pers.zxg.coroutine.Coroutine.OutsideCall;
import pers.zxg.coroutine.Coroutine.Runnable;
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

	public static java.util.concurrent.Future<Void> run(Runnable runnable, Context context) {
		throw new NotWeaved();
	}

	public static <T> java.util.concurrent.Future<T> run(Callable<T> callable, Context context) {
		throw new NotWeaved();
	}
}
