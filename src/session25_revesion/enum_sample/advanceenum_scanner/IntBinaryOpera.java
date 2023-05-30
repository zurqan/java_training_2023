package session25_revesion.enum_sample.advanceenum_scanner;

public enum IntBinaryOpera {
    ADD("+") {
        @Override
        public int doOperation(int firstNumber, int secondNumber) {
            return firstNumber + secondNumber;
        }
    },
    MIN("-") {
        @Override
        public int doOperation(int firstNumber, int secondNumber) {
            return firstNumber - secondNumber;
        }
    },
    MULTI("*") {
        @Override
        public int doOperation(int firstNumber, int secondNumber) {
            return firstNumber * secondNumber;
        }
    },
    DIVIDE("/") {
        @Override
        public int doOperation(int firstNumber, int secondNumber) {
            return firstNumber / secondNumber;
        }
    };

    private final String symbol;

    IntBinaryOpera(String symbol) {
        this.symbol = symbol;
    }

    public abstract int doOperation(int firstNumber, int secondNumber);

    public String getSymbol() {
        return symbol;
    }
}
