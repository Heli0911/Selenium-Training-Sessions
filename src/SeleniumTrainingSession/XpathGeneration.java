package SeleniumTrainingSession;

public class XpathGeneration {

	// input[@id='{0}']
	// input[@id='{0}' and @name='{1}']
	// input[@id='{0}' and @name='{1}' and @type='{2}']

	public static String createXpath(String xpathExp, Object... args) {
		for (int i = 0; i < args.length; i++) {
			xpathExp = xpathExp.replace("{" + i + "}", (CharSequence) args[i]);
		}
		return xpathExp;

	}

	public static void main(String[] args) {

		String x1 = createXpath("//input[@id='{0}']", "test");
		System.out.println(x1);

		String x2 = createXpath("//input[@id='{0}' and @name='{1}']", "email", "username");
		System.out.println(x2);

		String x3 = createXpath("//input[@id='{0}' and @name='{1}' and @type='{2}']", "email", "username", "text");
		System.out.println(x3);

	}

}
