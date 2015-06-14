package jp.co.jizai.sample.java7.lenrning.beans;

import java.beans.IntrospectionException;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyDescriptor;

public class MyBeanTest {
	
	static class MyBeanPropertyListener implements PropertyChangeListener {

		@Override
		public void propertyChange(PropertyChangeEvent evt) {
			
			System.out.println("evt.getPropertyName() = " +  evt.getPropertyName());
			System.out.println("evt.getSource()       = " + evt.getSource());
			System.out.println("evt.getOldValue()     = " + evt.getOldValue());
			System.out.println("evt.getNewValue()     = " + evt.getNewValue());
		}
	}
	
	public static void main(String[] args) throws Exception {
		MyBean myBean = new MyBean();
		myBean.addPropertyChangeListener(new MyBeanPropertyListener());
		myBean.setValue("hello");
		
		PropertyDescriptor nameProp = new PropertyDescriptor("value", MyBean.class);
		System.out.println(nameProp.getReadMethod().invoke(myBean));
		System.out.println(nameProp.getWriteMethod().invoke(myBean, "goodbye"));
		System.out.println(nameProp.getReadMethod().invoke(myBean));
	}
	
}
