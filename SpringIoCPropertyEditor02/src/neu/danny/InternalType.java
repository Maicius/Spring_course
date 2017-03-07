package neu.danny;

import java.awt.Color;
import java.io.File;
import java.net.URL;
import java.util.Locale;


public class InternalType {
	
	private Boolean isTrue;
	private Double isDouble;
	private String isString;
	private Color isColor;
	private Class phoneNumber;
	private File isFile;
	private Locale isLocale;
	private URL isURL;
	private String[] isStringArray;
	
	
	public Boolean getIsTrue() {
		return isTrue;
	}
	public void setIsTrue(Boolean isTrue) {
		this.isTrue = isTrue;
	}
	public Double getIsDouble() {
		return isDouble;
	}
	public void setIsDouble(Double isDouble) {
		this.isDouble = isDouble;
	}
	public String getIsString() {
		return isString;
	}
	public void setIsString(String isString) {
		this.isString = isString;
	}
	public Color getIsColor() {
		return isColor;
	}
	public void setIsColor(Color isColor) {
		this.isColor = isColor;
	}
	public File getIsFile() {
		return isFile;
	}
	public void setIsFile(File isFile) {
		this.isFile = isFile;
	}
	public Locale getIsLocale() {
		return isLocale;
	}
	public void setIsLocale(Locale isLocale) {
		this.isLocale = isLocale;
	}
	public URL getIsURL() {
		return isURL;
	}
	public void setIsURL(URL isURL) {
		this.isURL = isURL;
	}
	public String[] getIsStringArray() {
		return isStringArray;
	}
	public void setIsStringArray(String[] isStringArray) {
		this.isStringArray = isStringArray;
	}
	public Class getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Class phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
