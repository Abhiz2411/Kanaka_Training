import java.util.*;

class Time
{
	private int hour;
	private int min;
	private int s;
	
	public String getTime()
	{
		String time = ""+this.hour+":"+this.min+":"+this.s+"";
		return time;
	}
	
	public void setTime(int h,int m,int sec)
	{
		this.hour = h;
		this.min = m;
		this.s = sec;
	}
	
	public String addTime(Time t3)
	{
		
		int sf = this.s + t3.s;
		int carryS = 0;
		
		if(sf>=60)
		{
			carryS = sf - 60;
			sf = carryS;
		}
		
		int mf = this.min + t3.min;
		if(carryS>0)
		{
			mf = mf + 1;
		}
		int carryM = 0;
		
		if(mf>=60)
		{
			carryM = mf - 60;
			mf = carryM;
		}
		
		int hf = this.hour + t3.hour;
		if(carryM>0)
		{
			hf = hf + 1;
		}
		int carryF = 0;
		
		String finalTime;
		if(hf>=24)
		{
			carryF = 1;
			finalTime = "Day 2: "+carryF+":"+mf+":"+sf+"";
		}
		else	
		{
			finalTime = "Day 1: "+hf+":"+mf+":"+sf+"";
		}
		
		return finalTime;
	}
}

class Demo1
{
	public static void main(String[] args)
	{
		Time t1 = new Time();
		Time t2 = new Time();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter t1 hour: ");
		int h1 = sc.nextInt();
		System.out.println("Enter t1 minutes: ");
		int m1 = sc.nextInt();
		System.out.println("Enter t1 seconds: ");
		int s1 = sc.nextInt();
		
		System.out.println("\n");
		
		System.out.println("Enter t2 hour: ");
		int h2 = sc.nextInt();
		System.out.println("Enter t2 minutes: ");
		int m2 = sc.nextInt();
		System.out.println("Enter t2 seconds: ");
		int s2 = sc.nextInt();
		
		t1.setTime(h1,m1,s1);
		t2.setTime(h2,m2,s2);
		
		System.out.println("\n");
		
		System.out.println("### T1 time : "+t1.getTime()+"  ###");
		System.out.println("### T2 time : "+t2.getTime()+"  ###");
		
		System.out.println("\n");
		
		System.out.println("------ Added time: "+t1.addTime(t2)+"  ------");
	}
}