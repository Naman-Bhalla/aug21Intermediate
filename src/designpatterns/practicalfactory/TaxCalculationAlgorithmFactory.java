package designpatterns.practicalfactory;

public class TaxCalculationAlgorithmFactory {

    public static TaxCalculationAlgorithm
        getTaxCalculationAlgorithmForRegime(TaxRegime regime) {
        if (regime == TaxRegime.OLD) {
            return new OldRegimeTaxCalculationAlgorithm();
        } else if (regime == TaxRegime.NEW) {
            return new NewRegimeTaxCalculationAlgorithm();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static TaxCalculationAlgorithm
        getNewRegimeTaxCalculator() {
        return new NewRegimeTaxCalculationAlgorithm();
    }


}
