
import java.util.HashMap;
import java.util.Map;

public class Price {

	private Map<String,Double> rates;
	private Double value;
	
	public Price(Double value) {
		this.value = value;
		rates = new HashMap<String,Double>();
		rates.put("USD", 1d);
		rates.put("GBP", 0.6);
		rates.put("EUR", 0.8);
	}
	
	//TODO: We appear to be mutating a value in a get method 	
	public Double convert(String toCurrency) {
		
		if (toCurrency.equals("USD")) {
			return value;
		}
		else {
			Double conversion = rates.get("USD") / rates.get(toCurrency);
			return conversion * value;
		}
	}
	
	public String toString() {
		return this.value.toString();
	}
	
	//TODO: Definitely an escaping reference
	public Double getRates(String currency) {
		return rates.get(currency);
	}
	
}
