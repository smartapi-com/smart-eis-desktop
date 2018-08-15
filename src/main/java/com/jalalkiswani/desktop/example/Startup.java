package com.jalalkiswani.desktop.example;

import java.util.Properties;

import com.jk.db.dataaccess.orm.hibernate.JKEntityManagerFactory;
import com.jk.db.dynamic.meta.EntityMetaUtil;
import com.jk.desktop.JKDesktopApplication;
import com.jk.desktop.ui.UIPanelFactoryImpl;
import com.jk.util.JK;

public class Startup {
	public static void main(String[] args) {
		JKDesktopApplication.start();
		
//		System.out.println(EntityMetaUtil.getEntityMeta("sec_privileges").getSource());
//		UIPanelFactoryImpl i=new  UIPanelFactoryImpl();
//		i.createMasterDetailWithListPanel("sec_privileges", new Properties());
	}
}
