package telran.removal;

public class SymbolsRemoveStandard implements SymbolsRemove {

	@Override
	public String removeSymbol(String str, char symbol) {
		
//		My implementation
//		======================================================
		
//		String meta_characters = ".^$*+?()[]{}\\|";
//		String charAsString = String.valueOf(symbol);
//		if (metacharacters.indexOf(symbol) > -1) {
//			charAsString = "\\" + charAsString;
//		}
//		return str.replaceAll(charAsString, "");
		
//		Yuri's implementation
//		======================================================
		
//		use of REGEX : \\Q - start of blocked quote
//					   \\E - end of blocked quote
//		this is used to avoid meta_characters, and use them as literals: * ? +
		return str.replaceAll("\\Q" + symbol + "\\E", "");
	}
}
