/**
 * 
 */
package com.fanjavaid.log;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;

/**
 * @author fanjavaid
 *
 */
public class AfterLoggingModule implements AfterReturningAdvice {

	private Logger logger = Logger.getLogger(AfterLoggingModule.class.getName());
	
	public void afterReturning(Object returnValue, Method method, Object[] args,
			Object target) throws Throwable {
		// TODO Auto-generated method stub
		logger.debug("[AFTER] Method called : " + method.getName());
		if (args.length == 0)
			logger.debug("[AFTER] No argument passed");
		
		for (Object arg : args) {
			logger.debug("[AFTER] Argument Passed :" + arg);
		}
		
		logger.debug("[AFTER] Returning results : " + returnValue);
	}

}
