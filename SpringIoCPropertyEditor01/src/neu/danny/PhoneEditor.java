package neu.danny;

public class PhoneEditor extends java.beans.PropertyEditorSupport{
	
	
	/**
	 * Spring���Խ�һ���ַ���װ���һ��java.net.URL���͵����ԡ�����֪��������ôʵ�ֵ���
	 * ʵ���ϣ�������ϱ����ħ������Spring�ṩ�ģ���������JavaBean API��
	 * java.beans.PropertyEditor�ӿ��ṩ�˽��ַ���ֵӳ��ɷ�String���͵ķ�����
	 * ��һ�����õ�����ӿڵ�ʵ��---java.beans.PropertyEditorSupport��
	 * ���������������ǻ����Ȥ��
	 * 		getAsText()��������һ����ʾ����ֵ���ַ�����
	 * 		setAsText(String value)�����ݽ������ַ�������Bean�����ԡ�
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
	
	//���ش����ֵ��ַ���
	private String stripNonNumeric(String original){
		StringBuffer allNumeric = new StringBuffer();
		for(int i=0;i<original.length();i++){
			char c = original.charAt(i);
			if(Character.isDigit(c)){//�ж�c�Ƿ�Ϊ����
				allNumeric.append(c);
			}
		}
		return allNumeric.toString();
	}
}
