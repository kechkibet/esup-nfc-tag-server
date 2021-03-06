package org.esupportail.nfctag.service.ldap;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.esupportail.nfctag.security.GroupService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:META-INF/spring/applicationContext*.xml"})
public class GroupServiceTest {
	
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	public final static String ROLE_TO_TEST = "ROLE_ADMIN";

	@Resource
	GroupService groupService;
	
	@Resource
	Map<String, String> nfcMappingGroupesRoles;
	
	@Test
	public void testConsistenceGroup() {
		List<String> groups = groupService.getGroups("test");
	}

}
