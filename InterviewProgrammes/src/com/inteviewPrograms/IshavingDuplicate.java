package com.inteviewPrograms;

public boolean IshavingDuplicate(int num) {
	
	int i[] = new int[5];
	{
	while(num>0) {
		
		int digit=num%10;
		cont[digit]++;
		if(count[digit]>1) {
			
			return true;
		}
		
		num=num/10;
		
	}
	
	return false;
}
	

	public static void main(String[] args) {
		List<int> list= {1,.....500};
		
		for(int num: list) {
			
			if(ishavingDuplicate(num)) {
				
				// check sum now
				int sum=getSum(num);
				if(sum<=5) {
					SOP(num);
				}
			}
		
		
	}

}

	public int getSum(int num) {
		int sum=0;
		while(num>0) {
			sum=sum+(num%10);
			num=num/10;
		}
		return sum;
	}
	}