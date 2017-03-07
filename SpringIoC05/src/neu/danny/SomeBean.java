package neu.danny; 

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SomeBean {
    private String[] someStrAry;
    private Some[] someObjArray;
    private List someList;
    private Map someMap;
    private Set someSet;
    private Properties someProps;
    

    public Properties getSomeProps() {
		return someProps;
	}
	public void setSomeProps(Properties someProps) {
		this.someProps = someProps;
	}
	public String[] getSomeStrArray() {
        return someStrAry;
    }
    public void setSomeStrAry(String[] someStrAry) {
        this.someStrAry = someStrAry;
    }
    public Some[] getSomeObjArray() {
        return someObjArray;
    }
    public void setSomeObjArray(Some[] someObjArray) {
        this.someObjArray = someObjArray;
    }
    public List getSomeList() {
        return someList;
    }
    public void setSomeList(List someList) {
        this.someList = someList;
    }
    public Map getSomeMap() {
        return someMap;
    }
    public void setSomeMap(Map someMap) {
        this.someMap = someMap;
    }
	public Set getSomeSet() {
		return someSet;
	}
	public void setSomeSet(Set someSet) {
		this.someSet = someSet;
	}


}
