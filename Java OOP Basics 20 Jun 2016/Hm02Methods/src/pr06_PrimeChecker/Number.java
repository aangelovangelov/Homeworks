package pr06_PrimeChecker;

public class Number {

    private Integer number;
    private Boolean isPrime;

    public Number(Integer number, Boolean isPrime) {
        this.number = this.findNextPrime(number);
        this.isPrime = this.primeChecker(number);
    }

    public Integer getNumber() {
        return this.number;
    }

    public Boolean isPrime() {
        return this.isPrime;
    }

    public Boolean primeChecker(Integer number) {
        Boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public Integer findNextPrime(Integer number) {
        while (true) {
            number++;
            if (this.primeChecker(number)) {
                return number;
            }
        }
    }
}
