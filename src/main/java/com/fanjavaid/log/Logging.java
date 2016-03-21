/**
 * 
 */
package com.fanjavaid.log;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;

/**
 * @author fanjavaid
 *
 */
public class Logging implements MethodInterceptor {
	private static final Logger log = Logger.getLogger(Logging.class.getName());
	
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		Object results = null;
		
		log.debug("[LOG] Method called : " + invocation.getMethod().getName());
		if (invocation.getArguments().length == 0) {
			log.debug("[LOG] No argument passed");
		} else {
			for (Object arg : invocation.getArguments()) {
				log.debug("[LOG] Argument passed : " + arg);
			}
		}
		
		try {
			log.debug("[LOG] Processing...");
			
			results = invocation.proceed();
			
			log.debug("[LOG] Result : " + results);
		} catch (Exception e) {
			// TODO: handle exception
			log.error("[LOG] Error : " + e.getMessage());
		}
		
		return results;
	}

}
