package Factory;

public class HelloWorldOO {

	public static void main(String[] args) {
		// Not using Factory Pattern may require user to understand the Printer classes.
		Printer ePrinter = new EnglishPrinter();
		ePrinter.print();
		Printer ePrinter1 = new EnglishPrinter(true);
		ePrinter1.print();
		Printer gPrinter = new GermanPrinter();
		gPrinter.print();
		Printer gPrinter1 = new GermanPrinter(false);
		gPrinter1.print();

		// Using Factory Pattern allows users to input request without knowing details.
		PrinterFactory pf = new PrinterFactory();
		Printer ePrinter2 = pf.getPrinter("English", "Single");
		Printer gPrinter2 = pf.getPrinter("German", "Double");
		ePrinter2.print();
		gPrinter2.print();
	}
}
