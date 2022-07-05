/*
 * Copyright (c) 2022, Xianguang Zhou <xianguang.zhou@outlook.com>. All rights reserved.
 */
package pers.zxg.coroutine.vertx.core;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

import io.vertx.core.Context;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Promise;
import io.vertx.core.WorkerExecutor;
import pers.zxg.coroutine.Coroutine;
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

	public static <T> T executeBlocking(Handler<Promise<T>> blockingCodeHandler)
			throws Suspend, ExecutionException, OutsideCall, OutOfVertxContexts {
		throw new NotWeaved();
	}

	public static <T> T executeBlocking(Handler<Promise<T>> blockingCodeHandler,
			boolean ordered) throws Suspend, ExecutionException, OutsideCall, OutOfVertxContexts {
		throw new NotWeaved();
	}

	public static <T> T callBlocking(Callable<T> blockingCode)
			throws Suspend, ExecutionException, OutsideCall, OutOfVertxContexts {
		throw new NotWeaved();
	}

	public static <T> T callBlocking(Callable<T> blockingCode, boolean ordered)
			throws Suspend, ExecutionException, OutsideCall, OutOfVertxContexts {
		throw new NotWeaved();
	}

	public static <T> T executeBlocking(WorkerExecutor workerExecutor, Handler<Promise<T>> blockingCodeHandler)
			throws Suspend, ExecutionException, OutsideCall {
		throw new NotWeaved();
	}

	public static <T> T executeBlocking(WorkerExecutor workerExecutor, Handler<Promise<T>> blockingCodeHandler,
			boolean ordered) throws Suspend, ExecutionException, OutsideCall {
		throw new NotWeaved();
	}

	public static <T> T callBlocking(WorkerExecutor workerExecutor, Callable<T> blockingCode)
			throws Suspend, ExecutionException, OutsideCall, OutOfVertxContexts {
		throw new NotWeaved();
	}

	public static <T> T callBlocking(WorkerExecutor workerExecutor, Callable<T> blockingCode, boolean ordered)
			throws Suspend, ExecutionException, OutsideCall, OutOfVertxContexts {
		throw new NotWeaved();
	}

	public static java.util.concurrent.Future<Void> run(Coroutine.Runnable runnable, Context context) {
		throw new NotWeaved();
	}

	public static <T> java.util.concurrent.Future<T> run(Coroutine.Callable<T> callable, Context context) {
		throw new NotWeaved();
	}
}
