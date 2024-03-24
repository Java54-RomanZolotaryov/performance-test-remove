package telran.removal;

public class SymbolsRemoveStandard implements SymbolsRemove {

	@Override
	public String removeSymbol(String str, char symbol) {
		String metacharacters = ".^$*+?()[]{}\\|";
		String charAsString = String.valueOf(symbol);
		if (metacharacters.indexOf(symbol) > -1) {
			charAsString = "\\" + charAsString;
		}
		return str.replaceAll(charAsString, "");
	}
	
}
