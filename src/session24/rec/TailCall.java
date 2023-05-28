package session24.rec;

import session11.Supplier;

public abstract class TailCall<R> {


    public abstract boolean isSuspend();//check state

    public abstract R eval();

    public abstract TailCall<R> resume();//state-depend method


    public static <R> TailCall<R> result(R value){
        return new Result<>(value);
    }

    public static <R> TailCall<R> suspend(Supplier<TailCall<R>> nextCall){
        return new Resume<>(nextCall);
    }

    private static class Result<R> extends TailCall<R> {

        private final R result;

        private Result(R result) {
            this.result = result;
        }

        @Override
        public boolean isSuspend() {
            return false;
        }

        @Override
        public R eval() {
            return result;
        }

        @Override
        public TailCall<R> resume() {
            throw new IllegalStateException("You can not call resume on final result");
        }
    }

    private static class Resume<R> extends TailCall<R>{

        private final Supplier<TailCall<R>> next;

        private Resume(Supplier<TailCall<R>> next) {
            this.next = next;
        }

        @Override
        public boolean isSuspend() {
            return true;
        }

        @Override
        public R eval() {
            TailCall<R> _next = this;
            while (_next.isSuspend()){
                _next=_next.resume();
            }

            return _next.eval();
        }

        @Override
        public TailCall<R> resume() {
            return next.get();
        }
    }
}
