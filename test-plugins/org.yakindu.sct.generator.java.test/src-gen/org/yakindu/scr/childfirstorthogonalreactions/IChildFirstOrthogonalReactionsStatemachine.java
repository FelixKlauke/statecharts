package org.yakindu.scr.childfirstorthogonalreactions;

import org.yakindu.scr.IStatemachine;

public interface IChildFirstOrthogonalReactionsStatemachine extends IStatemachine {

	public interface SCInterface {
	
		public long getA_local();
		
		public void setA_local(long value);
		
		public long getC_local();
		
		public void setC_local(long value);
		
		public long getAa_local();
		
		public void setAa_local(long value);
		
		public long getAc_local();
		
		public void setAc_local(long value);
		
		public long getAaa_local();
		
		public void setAaa_local(long value);
		
		public long getAac_local();
		
		public void setAac_local(long value);
		
		public long getA_check();
		
		public void setA_check(long value);
		
		public long getAa_check();
		
		public void setAa_check(long value);
		
		public long getAaa_check();
		
		public void setAaa_check(long value);
		
		public long getAac_check();
		
		public void setAac_check(long value);
		
		public long getAc_check();
		
		public void setAc_check(long value);
		
		public long getC_check();
		
		public void setC_check(long value);
		
		public long getSm_local();
		
		public void setSm_local(long value);
		
		public void setSCInterfaceOperationCallback(SCInterfaceOperationCallback operationCallback);
	
	}
	
	public interface SCInterfaceOperationCallback {
	
		public long next();
		
		public boolean check(String id);
		
	}
	
	public SCInterface getSCInterface();
	
}
