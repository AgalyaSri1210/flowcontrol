class Question13{
	public static void main(String args[]){
		int cnt=0;
		for(int i=10;i<=99;i++){
			if(i%2!=0 && i%3!=0){
				for(int j=5;j<=Math.sqrt(i);j++)
					if(i%j==0)
						cnt++;
				if(cnt==0)
					System.out.println(i);
			}
			cnt=0;
		}
	}
}