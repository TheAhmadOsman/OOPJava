package exercise9;

/**
 * 
 * Class Ex9Converter
 * @author Ahmad M. Osman - Original template by Dr. Roman Yasinovskyy
 * @assignment Week 6: Exercise 9
 * 
**/

public class Ex9Converter {
  public Double c2f(Double valueFrom) {
      double valueTo = (valueFrom * 9 / 5) + 32;
      return valueTo;
  }

  public Double c2k(Double valueFrom) {
      double valueTo = valueFrom + 273.15;
      return valueTo;
  }

  public Double f2c(Double valueFrom) {
      double valueTo = (valueFrom - 32) * 5/9;
      return valueTo;
  }

  public Double f2k(Double valueFrom) {
      double valueTo = (valueFrom - 32) * 5/9 + 273.15;
      return valueTo;
  }

  public Double k2c(Double valueFrom) {
      double valueTo = valueFrom - 273.15;
      return valueTo;
  }

  public Double k2f(Double valueFrom) {
      double valueTo = (valueFrom - 273.15) * 9/5 + 32;
      return valueTo;
  }
}
