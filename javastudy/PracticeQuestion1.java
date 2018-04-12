package javastudy;

public class PracticeQuestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//1번 문제
		
		System.out.println("1부터 20까지의 정수 중에서 3의 배수의 총 합을 구하세요.");
		int sum = 0;
		for(int i=1;i<=20;i++) {
			if(i%3==0) {
				sum += i;
			}
		}
		System.out.println("총 합은 "+sum+"입니다.");
		
		
		
	//2번 문제
	
		System.out.println("1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 총 합을 구하세요.");
		sum=0;
		for(int i=1;i<=20;i++) {
			if(i%2!=0) {
				if(i%3!=0) {
				sum += i;	
				System.out.println(sum);
				}
			}	
			
		}
		System.out.println("총 합은 "+sum+"입니다.");
		
		
		
	//2번문제 variation
		sum=0;
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				continue;
			}
			else if(i%3==0) {
				continue;
			}
			else { 
				sum += i;
			}
			System.out.println(sum);
		}
		System.out.println("총 합은 "+sum+"입니다.");
				
	
	}
	
}


