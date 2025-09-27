package com.fundamentals.concurrency.executor;

import java.util.concurrent.Executor;

public class DirectExecutor implements Executor {
    @Override
    public void execute(Runnable r) {
        r.run();
    }
}
