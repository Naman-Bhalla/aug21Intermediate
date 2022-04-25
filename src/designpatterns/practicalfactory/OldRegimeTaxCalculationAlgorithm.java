package designpatterns.practicalfactory;

public class OldRegimeTaxCalculationAlgorithm
    implements TaxCalculationAlgorithm {
    @Override
    public int calculateTax(SalaryDetails salaryDetails) {
        return 0;
    }
}
