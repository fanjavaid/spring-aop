/**
 * 
 */
package com.fanjavaid.log;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author fanjavaid
 *
 */
public class BeforeLoggingModule implements MethodBeforeAdvice {

	private static final Logger logger = Logger.getLogger(BeforeLoggingModule.class.getName());
	
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		// TODO Auto-generated method stub
		logger.debug("[BEFORE] Method Called : " + method.getName());
		
		if (args.length == 0) {
			logger.debug("[BEFORE] No Argument Passed");
		} else {
			for (Object arg : args) {
				logger.debug("[BEFORE] Argument Passed : " + arg);
			}
		}
	}

}
