package Factory;

public class PrinterFactory {

	public Printer getPrinter(String type, String side) {
		if (type == null) {
			System.out.println("Printer type missing");
			return null;
		}
		else
			if (type.equalsIgnoreCase("English"))
				if(side.equalsIgnoreCase("Single"))
					return new EnglishPrinter(true);
				else if(side.equalsIgnoreCase("Double"))
					return new EnglishPrinter(false);
				else
					return new EnglishPrinter();
		else if (type.equalsIgnoreCase("German"))
				if(side.equalsIgnoreCase("Single"))
					return new GermanPrinter(true);
				else if(side.equalsIgnoreCase("Double"))
					return new GermanPrinter(false);
				else
					return new GermanPrinter();
		System.out.println("Printer type not supported");
		return null;
	}
}
