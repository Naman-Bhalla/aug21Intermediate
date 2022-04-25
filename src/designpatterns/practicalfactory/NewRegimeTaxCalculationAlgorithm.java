package designpatterns.practicalfactory;

public class NewRegimeTaxCalculationAlgorithm
    implements TaxCalculationAlgorithm {

    @Override
    public int calculateTax(SalaryDetails salaryDetails) {
        return 0;
    }
}

// config = FirebaseUserService
// config = ReactUserService