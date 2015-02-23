package com.ddlab.dozer.type4;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import com.ddlab.dozer.type4.destnpkg.Person1;
import com.ddlab.dozer.type4.srcpkg.MyPerson;

/**
 * The Class TestFlatBean2Nested is used as a test class to copy from Flat type
 * bean to a Bean of nested objects
 * 
 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
 * @since 2013
 */
public class TestFlatBean2Nested {
	
	
	private static final Logger out = Logger
			.getLogger(TestFlatBean2Nested.class);



	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("flat2NestedBeanMapping.xml");

		Mapper mapper = new DozerBeanMapper(list);

		MyPerson p = new MyPerson();
		p.setAge(333);
		p.setName("XX");
		p.setDoorNo(13);
		p.setStName("street11");
		p.setCname("India");
		p.setCcode("111");
		p.setFd(23.45f);

		Person1 p1 = new Person1();
		mapper.map(p, p1, "a");

		out.info(p1.getAge1());
		out.info(p1.getName1());
		out.info(p1.getAdrs1().getDoorNo1());
		out.info(p1.getAdrs1().getStName1());
		out.info(p1.getAdrs1().getCountry().getName());
		out.info(p1.getAdrs1().getCountry().getCode());
		out.info(p1.getAdrs1().getCountry().getBd());
	}

}
