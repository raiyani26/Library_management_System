import java.util.Scanner;
class Library
{
String email,password,cnfp;
String cnfEmail,cnfPassword;

//this code is for sing up details
void signup()
{    
    Scanner sc=new Scanner(System.in);
    System.out.println("---------------(:Sing Up Your Account:)---------------");
    System.out.println();
    System.out.print("Enter Email:-");
    email=sc.next();
    System.out.print("Enter Password:-");
    password=sc.next();
    System.out.print("Confirm Your Password:-");
    cnfp=sc.next();
    System.out.println();
}
//this code is for login details
void login()
{
   Scanner sc=new Scanner(System.in);
       System.out.println("---------------(:Sing Up Successful:)---------------");
    System.out.println();
    System.out.println("---------------(:Login Your Account:)---------------");
    System.out.println();
    System.out.print("Enter Email:-");
    cnfEmail=sc.next();
    System.out.print("Enter Your Password:-");
    cnfPassword=sc.next();
}

//this code is for book purchase 
void purchase()
	{
	Scanner sc=new Scanner(System.in);

	boolean b=true;
	while(b)
		  {
			System.out.println("----------------(:WELCOME TO OUR MASTI LIBRARY:)----------------");
			System.out.println();
			System.out.println("Press 1 for Purchase ENGLISH BOOKS:-");
			System.out.println("Press 2 for Purchase GUJARATI BOOKS:-");
			System.out.println("Press 3 for exit from Library:-");
			int choice=sc.nextInt();
				switch(choice)
				{
					//this code is for english books category
					case 1:
					System.out.println("-----(:Welcome To ENGLISH BOOKS CATEGORY:)-----");
					System.out.println();
					
					boolean t=true;
					while(t)
					{
						System.out.print("Press 1 Book Number for Purchase:-"+"SEVEN STEP IN THE SKY WRITEN BY KANDANIKA KAPADIYA");
						System.out.println("::--The Book number 101 Price is:-"+"750Rs.");
						System.out.println("Press 2 for exit from ENGLISH BOOKS CATEGORY");
					int choice2=sc.nextInt();
						switch(choice2)
						{
						case 1:
						System.out.println("SEVEN STEP IN THE SKY BOOK IS SUCCESSFULLY PURCHASED");
						System.out.println();
						break;
						
						case 2:
						System.out.println("Thank you for visit in ENGLISH BOOKS CATEGORY");
						System.out.println();
						t=false;
						break;
						default:
						System.out.println("Pleas enter valid book number...");
						}
					}
					break;
					
					//this code is for gujarati book category
					case 2:
					boolean i=true;
					while(i)
					{
						System.out.print("Press 1 Book number for Purchase:-"+"SATYANA PRAYOGO WRITEN BY MOHANDAS KARAMCHANDDAS GANDHIJI");
						System.out.println("::--The Book number 1 Price is:-"+"579Rs.");
						System.out.print("Press 2 Book number for Purchase:-"+"MANVI NI BHAVAI WRITEN BY PANNALAL PATEL");
						System.out.println("::--The Book number 2 Price is:-"+"499Rs.");
						System.out.print("Press 3 Book number for Purchase:-"+"MUCHHALI MA WRITEN BY GIJUBHAI BADHEKA");
						System.out.println("::--The Book number 3 Price is:-"+"249Rs.");
						System.out.print("Press 4 Book number for Purchase:-"+"MANSAI NA DIVA WRITEN BY JAVERCHAND MEGHANI");
						System.out.println("::--The Book number 4 Price is:-"+"549Rs.");
						System.out.print("Press 5 for Book for Purchase:-"+"POST OFFICE WRITEN BY DHUMKETU");
						System.out.println("::--The Book number 5 Price is:-"+"399Rs.");
						System.out.print("Press 6 Book number for Purchase:-"+"YOG MUDRA WRITEN BY KANAIYALAL MUNSI");
						System.out.println("::--The Book number 6 Price is:-"+"529Rs.");
						System.out.println("Press 7 for exit from GUJARATI BOOKS CATEGORY");
						
					   int c=sc.nextInt();
					   System.out.println();
					
						switch(c)
						{
							
							case 1:
							System.out.println("SATYANA PRAYOGO BOOK(NO OF BOOK 102) IS SUCCESSFULLY PURCHASED");
							System.out.println();

							break;
							
							case 2:
							System.out.println("MANVI NI BHAVAI BOOK(NO OF BOOK 103) IS SUCCESSFULLY PURCHASED");
							System.out.println();
							break;
							
							case 3:
							System.out.println("MUCHHALI MA BOOK(NO OF BOOK 104) IS SUCCESSFULLY PURCHASED");
							System.out.println();
							break;
							
							case 4:
							System.out.println("MANSAI NA DIVA BOOK(NO OF BOOK 105) IS SUCCESSFULLY PURCHASED");
							System.out.println();
							break;
							
							case 5:
							System.out.println("POST OFFICE BOOK(NO OF BOOK 106) IS SUCCESSFULLY PURCHASED");
							System.out.println();
							break;
							
							case 6:
							System.out.println("YOG MUDRA BOOK(NO OF BOOK 107) IS SUCCESSFULLY PURCHASED");
							System.out.println();
							break;
							
							case 7:
							System.out.println("THANK YOU FOR VISIT GUJARATI BOOKS CATEGORY");
							System.out.println();
							i=false;
							break;
							
							default:
							System.out.println("Please enter valid Book number...");
							System.out.println();
						}
					}
					break;
					
					case 3:
					b=false;
					break;
					
					default:
					System.out.println("Please enter valid bbooks category number");
				}
			}
	}
}
class Main
{
public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("(:WELCOME TO OUR MASTI LIBRARY SING UP & LOGIN SYSTEM:)");
		Library process1=new Library();
		
		process1.signup();
		String k=process1.email;
		String x=process1.password;
		String y=process1.cnfp;
		String a,b;
			if(x.equals(y))
			{
			Library process2=new Library();
			process2.login();

			a=process2.cnfEmail;
			b=process2.cnfPassword;

				if(a.equals(k)&&b.equals(x))
				{
				System.out.println("               (:Login Successfully:)");
				System.out.println();
				 Library process3=new Library();
				 process3.purchase();
				}
				else
				{
					System.out.println("----------###incorrect email or password##----------");
				}

			}
			else
			{
				System.out.println("Password doesn't Match.Pleas Enter Same Passsord.");
			}
				
				System.out.println("--------------------(:THANK YOU FOR VISIT MASTI LIBRARY:)--------------------");
	}
}