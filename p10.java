/* F 5 D 3 B 1
   F 5 D 3 B 1
   F 5 D 3 B 1
   F 5 D 3 B 1
   F 5 D 3 B 1
   F 5 D 3 B 1
*/

class P10{
	public static void main(String[] args){
		for(int i=1;i<=6;i++){
			char ch='F';
			int n=6;
			for(int j=1;j<=6;j++){
				if(j%2==0){
					System.out.print(n+" ");
					n--;
					ch--;
				}else{
					System.out.print(ch+" ");
					ch--;
					n--;
				}
			}
			System.out.println();
		}
	}
}


