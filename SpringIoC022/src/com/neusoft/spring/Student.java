package com.neusoft.spring;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Student {
	private Classes classes;	//�༶
	private int sno;		//ѧ��
	private String name;	//����
	private double[] score;	//���ſγ̵ķ���
	
	private List<String> course;	//�γ��б�
	private Set<String> hobby;		//�������
	private Map<String, Object> other;		//����Map
	
	public Classes getClasses() {
		return classes;
	}
	public void setClasses(Classes classes) {
		this.classes = classes;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double[] getScore() {
		return score;
	}
	public void setScore(double[] score) {
		this.score = score;
	}
	public List getCourse() {
		return course;
	}
	public void setCourse(List course) {
		this.course = course;
	}
	public Set getHobby() {
		return hobby;
	}
	public void setHobby(Set hobby) {
		this.hobby = hobby;
	}
	public Map<String, Object> getOther() {
		return other;
	}
	public void setOther(Map<String, Object> other) {
		this.other = other;
	}
	
	//����toString�������������
	public String toString(){
		return classes+"\n sno="+sno+"\n name="+name+"\n score="+print(score)
			+"\n course="+course+"\n hobby="+hobby+"\n other="+print(other);
	}
	
	//����������
	public String print(double[] score){
		StringBuffer str=new StringBuffer("[");
		for(int i=0; i<score.length-1; i++){
			str.append(score[i]).append(", ");
		}	
		str.append(score[score.length-1]);
		str.append("]");
		return str.toString();
	}
	
	//��Map�����
	public String print(Map m){		
		StringBuffer str = new StringBuffer("[");
		Set s = m.keySet();
		Iterator iter = s.iterator();
		while(iter.hasNext()){
			Object o = iter.next();
			str.append("("+o+" "+m.get(o)+")").append(", ");
		}
		String ss = str.substring(0,str.length()-2);
		ss +="]";
		return ss;
	}
}
