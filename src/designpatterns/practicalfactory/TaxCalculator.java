package designpatterns.practicalfactory;

public class TaxCalculator {

    int calculateTax(SalaryDetails salaryDetails,
                      TaxRegime regime) {
//        int taxamount = 0;
//        if (regime == TaxRegime.OLD) {
//            taxamount += (salaryDetails.hra * 30) / 100
//                    + (salaryDetails.basePay * 40) / 100;
//        } else {
//            taxamount += (salaryDetails.hra + salaryDetails.basePay * 30) / 100;
//        }
//
//        return taxamount;

        TaxCalculationAlgorithm taxCalculationAlgorithm =
                TaxCalculationAlgorithmFactory.getTaxCalculationAlgorithmForRegime(
                        regime
                );

        return taxCalculationAlgorithm.calculateTax(salaryDetails);
    }
}
