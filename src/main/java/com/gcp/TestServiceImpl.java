package com.gcp;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	TestDao testDao;
	
	@Override
	@Transactional
	public Test saveTest(Test test) {
		
		testDao.save(test);
		return test;
	}

}
