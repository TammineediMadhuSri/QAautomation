package com.crm.data;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class CrmTestData {

	static CrmLoginData crmLogindata = null;

	public static CrmLoginData getTestData() {
		try {
			File file = new File("src//test//data//crm_data.xml");
			JAXBContext jaxbcontext = JAXBContext.newInstance(CrmLoginData.class);
			Unmarshaller unmarshaller = jaxbcontext.createUnmarshaller();
			crmLogindata = (CrmLoginData) unmarshaller.unmarshal(file);
		} catch (Exception e) {
			System.out.println("Check the Xml file");
			e.printStackTrace();

		}
		return crmLogindata;
	}

}
