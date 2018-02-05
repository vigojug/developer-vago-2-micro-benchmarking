package org.vigojug.developervago2;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Threads;
import org.openjdk.jmh.annotations.Warmup;

public class NoSenseBenchmark {

    @Benchmark
    // Don't use this in a real benchmark
    @Warmup(iterations = 1)
    @Measurement(iterations = 1)
    public void benchmarkA() {
        NoSense.a();
    }

    @Benchmark
    // Don't use this in a real benchmark
    @Warmup(iterations = 1)
    @Measurement(iterations = 1)
    public void benchmarkB() {
        NoSense.b();
    }

}
