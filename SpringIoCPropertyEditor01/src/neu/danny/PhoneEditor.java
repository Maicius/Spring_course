package neu.danny;

public class PhoneEditor extends java.beans.PropertyEditorSupport{
	
	
	/**
	 * Spring可以将一个字符串装配给一个java.net.URL类型的属性。你想知道这是怎么实现的吗？
	 * 实际上，这个诀窍背后的魔法不是Spring提供的，而是来自JavaBean API。
	 * java.beans.PropertyEditor接口提供了将字符串值映射成非String类型的方法。
	 * 有一个好用的这个接口的实现---java.beans.PropertyEditorSupport，
	 * 它有两个方法我们会感兴趣：
	 * 		getAsText()方法返回一个表示属性值的字符串。
	 * 		setAsText(String value)将传递进来的字符串赋给Bean的属性。
	 */
	public void setAsText(String textValue){
		
		System.out.println("setAsText()");
		String stripped = stripNonNumeric(textValue);
		String areaCode = stripped.substring(0,3);
		String prefix = stripped.substring(3,6);
		String number = stripped.substring(6);
		
		PhoneNumber phone = new PhoneNumber(areaCode,prefix,number);
		setValue(phone);
	} 
	
	//返回纯数字的字符串
	private String stripNonNumeric(String original){
		StringBuffer allNumeric = new StringBuffer();
		for(int i=0;i<original.length();i++){
			char c = original.charAt(i);
			if(Character.isDigit(c)){//判断c是否为数字
				allNumeric.append(c);
			}
		}
		return allNumeric.toString();
	}
}
