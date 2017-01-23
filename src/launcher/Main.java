package launcher;

import net.webservicex.Currency;
import net.webservicex.CurrencyConvertor;
//Anupam Push
public class Main {
	public static void main(String[] args) {
		CurrencyConvertor cc=new CurrencyConvertor();
		double ccres=cc.getCurrencyConvertorSoap().conversionRate(Currency.USD,Currency.INR);
		System.out.println("Conversion rate :"+ccres);
		System.out.println("Hello World");
	}

}
