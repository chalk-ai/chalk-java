package ai.chalk.client;

import java.util.function.Supplier;

class Lazy<T> implements Supplier<T> {
    private final Supplier<T> supplier;
    private volatile T value;

    Lazy(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    @Override
    public T get() {
        if (value == null) {
            synchronized (this) {
                value = supplier.get();
            }
        }
        return value;
    }
}
