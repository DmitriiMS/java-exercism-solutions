class NaturalNumber {

    private int number;
    private int aliquotSum;

    public NaturalNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.number = number;
    }

    public Classification getClassification() {
        if(isPrime(number)){
            return Classification.DEFICIENT;
        }
        calculateAliquotSum();
        if(aliquotSum > number) {
            return Classification.ABUNDANT;
        }else if (aliquotSum < number) {
            return Classification.DEFICIENT;
        }else {
            return Classification.PERFECT;
        }
    }

    private void calculateAliquotSum() {
        aliquotSum++;
        for(int i = 2; i < Math.sqrt(number); i++) {
            if(number % i == 0) {
                aliquotSum += i + number/i;
            }
        }
    }

    private boolean isPrime(int num){
        if(num == 1 || num == 2) { return true; }
        if(num % 2 == 0) { return false;}
        for(int i = 3; i < Math.sqrt(num); i += 2) {
            if(num % i == 0) { return false; }
        }
        return true;
    }
}
