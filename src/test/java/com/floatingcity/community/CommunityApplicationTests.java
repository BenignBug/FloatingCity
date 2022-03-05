package com.floatingcity.community;

import com.floatingcity.community.dao.DemoDao;
import com.floatingcity.community.service.DemoService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
class CommunityApplicationTests implements ApplicationContextAware {

	private ApplicationContext applicationContext;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Test
	public void testApplicationContext() {
		System.out.println(applicationContext);
		DemoDao demoDao = applicationContext.getBean(DemoDao.class);
		System.out.println(demoDao.select());
	}

	@Test
	public void testBeanManagement() {
		DemoService demoService = applicationContext.getBean(DemoService.class);
		System.out.println(demoService);
	}

	@Test
	public void testBeanConfig() {
		// 此方法比较笨比
		SimpleDateFormat spf = applicationContext.getBean(SimpleDateFormat.class);
		System.out.println(spf.format(new Date()));
	}

	//依赖注入方式获取bean
	@Autowired
	private DemoDao demodao;

	@Autowired
	private DemoService demoService;

	@Autowired
	private SimpleDateFormat simpleDateFormat;

	@Test
	public void testDI() {
		System.out.println(demodao);
		System.out.println(demoService);
		System.out.println(simpleDateFormat);
		System.out.println("haha");
	}

}
