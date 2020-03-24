/**
 * Software application for customers shopping books online
 * 
 * Adithya B Shetty  
 * 10C  Roll no.1
 */
import java.util.Scanner;
public class BOOKWORM
{
   double cost=0.0;double sa1=0.0;   
   int z=0;
   String name[]=new String[100];//maximum number of products ordered is 100
   String cover[]=new String[100];
   String pub[]=new String[100];   
   double price[]=new double[100];
   String author[]=new String[100];
     
    public static void main()
    {
        double billamt=0.0;
        Scanner sc=new Scanner(System.in);
        BOOKWORM  obj= new BOOKWORM();
        System.out.println("***********************************************************************************************");
        System.out.println("***********************************  BOOKWORM&$ilverfish_ *************************************");
        System.out.println("***********************************************************************************************");
        System.out.println(" ");
        System.out.println(" ");
                
        System.out.println("If you are in for a mood of shopping then...YOU ARE IN THE RIGHT PLACE");
        System.out.println("     *About 1000 products to choose from!!! ");
        System.out.println("\t*Cash on delivery!!! ");
        System.out.println("\t\t*Easy return policy!!! ");
        System.out.println(" ");
        
        System.out.println("Today's HOT deals");
        System.out.println("   *10% off on SBI credit and debit cards!!!");
        System.out.println("   *7.5% off on Harper Collins books!!!");
        System.out.println("   *5% off on Comic books!!!");
        System.out.println("   *For purchase above Rs.5000, buy any one of the below books for free!!!");
        System.out.println("\t1.KIM(by Rupyard Kipling)   2.Train to Pakistan(by Khushwant Singh)\n\t3. 2 States(by Chethan Bhaghat)  4.The Da Vinci Code(by Dan Brown)\n\t5.Murder on the Orient Express(by Agatha Christie)");
        System.out.println(" ");
               
        System.out.println("Enter your name");
        String nam=sc.nextLine();
        System.out.println(" ");
        System.out.println("Enter the day");
        String a=sc.next();
        System.out.println("Enter the month");
        String m=sc.next();
        System.out.println("Enter the year");
        String y=sc.next();  
        System.out.println(" ");
        
        if((m.equalsIgnoreCase("October"))||(m.equals("10"))||(m.equalsIgnoreCase("Oct")))
        { System.out.println("  DUSSEHRA DHAMAKA!!!\n\t15% off on BILL AMOUNT"); 
         m="October";}
        if((m.equalsIgnoreCase("November"))||(m.equals("11"))||(m.equalsIgnoreCase("Nov")))
         {System.out.println("  GREAT INDIAN FESTIVAL OF LIGHTS SALE!!!\n\t10% off on BILL AMOUNT + CADBURY CELEBRATIONS worth Rs.100 free");
          m="November";}
        if((m.equalsIgnoreCase("January"))||(m.equals("1"))||(m.equalsIgnoreCase("Jan")))
        {System.out.println("   SUPER NEW YEAR SALE!!!\n\tYou are lucky to be exempted from shipping charges!FREE DELIVERY!!!");
         m="January";}
        if((m.equalsIgnoreCase("April"))||(m.equals("4")))
        {System.out.println("   COOL SUMMER SALE!!!\n\tJustBooks Monthly Membership voucher worth Rs.300 free");
         m="April";}
        if((m.equalsIgnoreCase("May"))||(m.equals("5")))
        { System.out.println("   COOL SUMMER SALE!!!\n\tJustBooks Monthly Membership voucher worth Rs.300 free");
         m="May";}
        if((m.equalsIgnoreCase("June"))||(m.equals("6")))        
         m="June";
        if((m.equalsIgnoreCase("July"))||(m.equals("7")))        
         m="July";
        if((m.equalsIgnoreCase("February"))||(m.equals("2"))||(m.equalsIgnoreCase("Feb")))
         m="February";
        if((m.equalsIgnoreCase("March"))||(m.equals("3")))        
         m="March";
        if((m.equalsIgnoreCase("August"))||(m.equals("8"))||(m.equalsIgnoreCase("Aug")))
         m="August";
        if((m.equalsIgnoreCase("September"))||(m.equals("9"))||(m.equalsIgnoreCase("Sept")))
         m="September";
        if((m.equalsIgnoreCase("December"))||(m.equals("12"))||(m.equalsIgnoreCase("Dec")))
         m="December"; 
         
        boolean f=true;        
        while(f==true)
        {
            System.out.println(" ");
            System.out.println("The CHOICES are:\n\t  1.for Fiction\n\t  2.for Non Fiction\n\t  3.for Education\n\t  4.for Comics\n\t  5.for Children Literature");
            System.out.println(" ");
            System.out.println("--------------------Enter your choice--------------------");
            int c=sc.nextInt();
            
            switch(c)
            {
                case 1:
                obj.Fiction();break;
                case 2:
                obj.Non_Fiction();break;
                case 3:
                obj.Education();break;
                case 4:
                obj.Comics();break;
                case 5:
                obj.Children_Literature();break;
                
                default: System.out.println("Please check your input");
            }
            
            System.out.println(" ");
            System.out.println("Enter any letter or digit if you want to continue shopping, else enter a special character");
            char ch=sc.next().charAt(0);
            if(Character.isLetterOrDigit(ch)==true)
            f=true;
            if((Character.isLetterOrDigit(ch)==false)&&(Character.isWhitespace(ch)==false))
            f=false;
        }
        System.out.println(" ");
                
        System.out.println("Enter your address");
        String address=sc.next();String address1=sc.nextLine();
        System.out.println("Enter the name of the city");
        String ci=sc.next();String ci1=sc.nextLine();
        System.out.println("Enter the name of the state");
        String sta=sc.next();String sta1=sc.nextLine();
        String sta2=sta+sta1;
        System.out.println(" ");
        System.out.println(" ");
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ BILL ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
        System.out.println(" ");
        System.out.println("Name: "+ nam+"\t\t\t\t\t\tDate:" +m+" "+a+","+y);
        System.out.println("\t\t\t\t\t\t\tAddress:\n\t\t\t\t\t\t\t" + address+address1+"\n\t\t\t\t\t\t\t"+ ci+" "+ci1+","+sta+" "+sta1 );
        System.out.println(" ");
        System.out.println("Sl.No.| Item name                       | Author             | Publication              | Description          | Price");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        for(int i=0;i<obj.z;i++)
        
           System.out.println((i+1)+"     | "+obj.name[i]+"   | "+obj.author[i]+"   | "+obj.pub[i]+"   | "+obj.cover[i]+"  | Rs."+obj.price[i]);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------"); 
        System.out.println("\t\t\t\t\t\t\t  TOTAL= Rs."+obj.cost);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        
        double vat=(4.5/100)*obj.cost;
        System.out.println("VAT=4.5% \n   *VAT= Rs."+vat);
        double ss=0.0;String day=" ";
        if(sta2.equalsIgnoreCase("karnataka"))
        { ss=60.0;day="2 days";}
        else
        { ss=100.0;day="4 days";}
        
        if(m.equals("January"))
        { System.out.println("Super New Year Sale offer :No Shipping charges!!FREE DELIVERY!!!\n\t*Guaranteed delivery to you in "+ day);ss=0;}            
        else
            System.out.println("Shiping charges= Rs." + ss+"\n   *Guaranteed delivery to you in "+ day);
        billamt=obj.cost+ss+vat;
        System.out.println("Bill amount= Rs." + billamt+"(rounding off)");double save=0.0;double billamt1=0.0;billamt1=billamt;
        System.out.println(" ");
        
        if(m.equals("October"))
        {  System.out.println("DUSSEHRA DHAMAKA!!!15% off on BILL AMOUNT");billamt-=((15.0/100)*billamt);save=billamt1-billamt;
           System.out.println("   *Your bill after discount: Rs."+ billamt+"(rounding off)" ); }
        if(m.equals("November"))
        {  System.out.println("GREAT INDIAN FESTIVAL OF LIGHTS SALE!!!10% off on BILL AMOUNT + CADBURY CELEBRATIONS worth Rs.100 free");billamt-=((10.0/100)*billamt);save=billamt1-billamt;
           System.out.println("   *Your bill after discount: Rs."+ billamt +"(rounding off)");
        }
        if(m.equals("April")||m.equals("May"))
          System.out.println("COOL SUMMER SALE!!!\n    JustBooks Monthly Membership voucher worth Rs.300 free");        
        System.out.println("Total savings: Rs."+ (save+obj.sa1));
            
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        double bill=Math.round(billamt);
        System.out.println("\t\t\t\t\t\t\tGRAND TOTAL= Rs." + bill);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        
        if(bill>=5000.0)
        { System.out.println("Today's HOT deals: For purchase above Rs.5000, buy any one of the below books for free!!!");
          System.out.println("\t1.KIM(by Rupyard Kipling)   2.Train to Pakistan(by Khushwant Singh)  3. 2 States(by Chethan Bhaghat)\n\t4.The Da Vinci Code(by Dan Brown) 5.Murder on the Orient Express(by Agatha Christie)");
          System.out.println(" ");
          System.out.println("--------------------------- Enter your choice -----------------------------");
          int choice1=sc.nextInt();
          System.out.println(" ");
          if(choice1==1)
            System.out.println("KIM(by Rupyard Kipling) will be delivered to you along with your goods");
          else if(choice1==2)
            System.out.println("Train to Pakistan(by Khushwant Singh) will be delivered to you along with your goods");
          else if(choice1==3)
            System.out.println("2 States(by Chethan Bhaghat) will be delivered to you along with your goods");
          else if(choice1==4)
            System.out.println("The Da Vinci Code(by Dan Brown) will be delivered to you along with your goods");
          else if(choice1==5)
            System.out.println("Murder on the Orient Express(by Agatha Christie) will be delivered to you along with your goods");
          else
            System.out.println("Please check your input");
        }
        
        System.out.println(" ");
        System.out.println("\t\tHope you enjoyed shopping with BOOKWORM&$ilverfish !!\n\t\t\t\tPlease, do come back soon!!");
        System.out.println(" ");
        System.out.println("Enter your payment details\n\t1.for Cash\n\t2.for Credit/Debit card");
        int pay=sc.nextInt();
        System.out.println(" ");
        
        switch(pay)
        {
            case 1:
            for(long i=0;i<=10;i++)
            {
                System.out.print(".");
            }
           
            System.out.println("\t\t~~~~~~~ Purchase successful!! ~~~~~~~");
            System.out.println("Cash on delivery\n   *GRAND TOTAL= Rs." + bill +"\nHappy shopping :-)");
            
            break;
            
            case 2:
            System.out.println("Enter the name of the bank");
            String bank=sc.next();String bank1=sc.nextLine();
            System.out.println("Enter your card no.");
            String card=sc.next();
            double bill2=0.0;
            System.out.println(" ");
            System.out.println("  PLEASE WAIT!!");
            System.out.println(" ");
            if(bank.equalsIgnoreCase("SBI")||(bank.equalsIgnoreCase("STATE")&&bank1.equalsIgnoreCase(" BANK OF INDIA")))
            {
                bill-=(10.0/100*bill);
                bill2=Math.round(bill);
            for(long i=-1999999999;i<=1999999999;i++)
            {
            }
            System.out.println("\t\t~~~~~~~ Purchase successful!! ~~~~~~~");
            System.out.println("10% discount for shopping with SBI\n   *GRAND TOTAL= Rs." + bill2 +"\nHappy shopping with SBI :-)");
            }
            else 
           {
            for( long i=-1000000000;i<=1000000000;i++)
            {
            }
            System.out.println("\t\t~~~~~ Purchase successful!! ~~~~~");
            System.out.println("*GRAND TOTAL= Rs." + bill +"\nHappy shopping with "+ bank + " "+ bank1+ " :-)");
            }
            break;
            
            default: System.out.println("Please check your input");
        }       
    }
   
    
   public void Fiction()
   {
       double price1=0.0; double save1=0.0;
       Scanner sc=new Scanner(System.in);
       System.out.println("WELCOME TO THE FICTION SECTION!!!\n\t*We provide a wide range of selections\n\t   *We are glad to announce that we have received the latest books");
       System.out.println(" ");
       System.out.println("The choices are:\n\t1.for Classics\n\t2.for Drama\n\t3.for Mythology\n\t4.for Science fiction\n\t5.for Historical fiction\n\t6.for Fantasy");
       System.out.println("\t7.for Crime & Mystery\n\t8.for Horror\n\t9.for Romance");
       System.out.println(" ");
       System.out.println("--------------------Enter your choice--------------------");
       int ch=sc.nextInt();
       System.out.println(" ");
       switch(ch)
       {
           
        case 1:
        System.out.println("The choices are:\n\t1.for Around the World in 80 days\n\t2.for Animal Farm\n\t3.for Malgudi Days\n\t4.for Adventures of Tom Swayer\n\t5.for Kidnapped");
        System.out.println("\t6.for Robinson Crusoe\n\t7.for Rusty and the Magic Mountain\n\t8.for Gulliver's travels\n\t9.for Three Musketeers\n\t10.for Moby Dick\n\t11.for Oliver Twist\n\t12.for Three Men in a Boat");
        System.out.println(" ");
        System.out.println("--------------------Enter your choice--------------------");
        int ch1=sc.nextInt();
        System.out.println(" ");
        if(ch1==1)
           {
           name[z]="Around the World in 80 days";price[z]=125.0;pub[z]="Harper Collins";cover[z]="Paperback & 224 pages";author[z]="Jules Verne";
           System.out.println("Around the World in 80 days\n\tCustomer review:****\n\tAuthor:Jules Verne\n\tPaperback & 224 pages\n\tPublication: Harper Collins\n\tCost of your purchase= Rs.125");
           price1=price[z];price[z]-=((7.5/100)*price[z]);save1=price1-price[z];System.out.println(" ");System.out.println("\tCost of your purchase after 7.5% discount= Rs." +price[z]+"\n\tYou save: Rs."+save1);cost=cost+price[z];sa1=sa1+save1;z++;       
        
        }
        else if(ch1==2)
         {
           name[z]="Animal farm";price[z]=75.0;pub[z]="Penguin India";cover[z]="Paperback & 104 pages";author[z]="George Orwell";
           System.out.println("Animal farm\n\tCustomer review:****\n\tAuthor:George Orwell\n\tPaperback & 104 pages\n\tPublication: Penguin India\n\tCost of your purchase= Rs.75");
           cost=cost+75.0;z++;
        }
        else if(ch1==3)
         {
           name[z]="Malgudi Days";price[z]=75.0;pub[z]="Indian Thought Publications";cover[z]="Paperback & 179 pages";author[z]="R.K. Narayan";
           System.out.println("Malgudi Days\n\tCustomer review:****\n\tAuthor:R.K. Narayan \n\tPaperback & 179 pages\n\tPublication:Indian Thought Publications \n\tCost of your purchase= Rs.75");
           cost=cost+75.0;z++;
        }
        else if(ch1==4)
         {
           name[z]="Adventures of Tom Swayer";price[z]=140.0;pub[z]="Vintage Children's Classics";cover[z]="Paperback: 368 pages";author[z]="Mark Twain";
           System.out.println("Adventures of Tom Swayer\n\tCustomer review:***\n\tAuthor:Mark Twain \n\tPaperback: 368 pages\n\tPublication:Vintage Children's Classics \n\tCost of your purchase= Rs.140");
           cost=cost+140.0;z++;
        }
        else if(ch1==5)
         {
           name[z]="Kidnapped";price[z]=165.0;pub[z]="Campfire";cover[z]="Paperback: 72 pages";author[z]="Robert Louis Stevenson";
           System.out.println("Kidnapped\n\tCustomer review:***\n\tAuthor:Robert Louis Stevenson \n\tPaperback: 72 pages\n\tPublication:Campfire \n\tCost of your purchase= Rs.165");
           cost=cost+165.0;z++;
        }
        else if(ch1==6)
         {
           name[z]="Robinson Crusoe";price[z]=120.0;pub[z]="Harper Collins";cover[z]="Paperback: 304 pages";author[z]="Daniel Defoe ";
           System.out.println("Robinson Crusoe\n\tCustomer review:****\n\tAuthor:Daniel Defoe  \n\tPaperback: 304 pages \n\tPublication:Harper Collins \n\tCost of your purchase= Rs.120");
           price1=price[z];price[z]-=((7.5/100)*price[z]);save1=price1-price[z];System.out.println(" ");System.out.println("\tCost of your purchase after 7.5% discount= Rs." +price[z]+"\n\tYou save: Rs."+save1);cost=cost+price[z];sa1=sa1+save1;z++;
           
        }
        else if(ch1==7)
         {
          name[z]="Rusty and the Magic Mountain";price[z]=180.0;pub[z]="Puffin";cover[z]="Hardcover: 120 pages";author[z]="Ruskin Bond";
           System.out.println("Rusty and the Magic Mountain\n\tCustomer review:****\n\tAuthor:Ruskin Bond \n\tHardcover: 120 pages \n\tPublication:Puffin \n\tCost of your purchase= Rs.180");
           cost=cost+180.0;z++;
        }
        else if(ch1==8)
         {
           name[z]="Gulliver's travels";price[z]=140.0;pub[z]="Ladybird Classics";cover[z]="Hardcover: 72 pages";author[z]="Jonathan Swift ";
           System.out.println("Gulliver's travels\n\tCustomer review:****\n\tAuthor:Jonathan Swift  \n\tHardcover: 72 pages \n\tPublication:Ladybird Classics \n\tCost of your purchase= Rs.140");
           cost=cost+140.0;z++;
        }
        else if(ch1==9)
         {
           name[z]="Three Musketeers";price[z]=100.0;pub[z]="Usborne Publishers";cover[z]="Paperback";author[z]=" Alexander Dumas";
           System.out.println("Three Musketeers\n\tCustomer review:****\n\tAuthor:Alexander Dumas \n\tPaperback \n\tPublication:Usborne Publishers \n\tCost of your purchase= Rs.100");
           cost=cost+100.0;z++;
        }
        else if(ch1==10)
         {
           name[z]="Moby Dick";price[z]=100.0;pub[z]="IBS Books (UK)";cover[z]="Hardcover: 104 pages";author[z]="Herman Melville";
           System.out.println("Moby Dick\n\tCustomer review:*****\n\tAuthor:Herman Melville \n\tHardcover: 104 pages \n\tPublication:IBS Books (UK) \n\tCost of your purchase= Rs.100");
           cost=cost+100.0;z++;
        }
        else if(ch1==11)
         {
           name[z]="Oliver Twist";price[z]=110.0;pub[z]=" PROJAPOTI";cover[z]="Paperback: 336 pages";author[z]="Charles Dickens";
           System.out.println("Oliver Twist\n\tCustomer review:*****\n\tAuthor:Charles Dickens \n\tPaperback: 336 pages \n\tPublication:PROJAPOTI \n\tCost of your purchase= Rs.110");
           cost=cost+110.0;z++;
        }
        else if(ch1==12)
         {
           name[z]="Three Men in a Boat";price[z]=150.0;pub[z]="OM Classics";cover[z]="Hardcover";author[z]="Jerome K. Jerome";
           System.out.println("Three Men in a Boat\n\tCustomer review:***\n\tAuthor:Jerome K. Jerome \n\tHardcover \n\tPublication:OM Classics \n\tCost of your purchase= Rs.150");
           cost=cost+150.0;z++;
        }
        else
           System.out.println("Please, check your input");
        break;
           
        case 2:
        System.out.println("The choices are:\n\t1.for Romeo & Juliet\n\t2.for Macbeth\n\t3.for Hamlet");
        System.out.println(" ");
        System.out.println("--------------------Enter your choice--------------------");
        int ch2=sc.nextInt();
        System.out.println(" ");
        if(ch2==1)
         {
           name[z]="Romeo & Juliet";price[z]=50.0;pub[z]=" Mahaveer Publishers";cover[z]="Paperback: 128 pages";author[z]=" William Shakespeare ";
           System.out.println("Romeo & Juliet\n\tCustomer review:****\n\tAuthor:William Shakespeare \n\tPaperback: 128 pages \n\tPublication:Mahaveer Publishers \n\tCost of your purchase= Rs.50.0");
           cost=cost+50.0;z++;
        }
        else if(ch2==2)
         {
           name[z]="Macbeth";price[z]=160.0;pub[z]="UBS Publishers' Distributors Pvt. Ltd. (2006)";cover[z]="Paperback: 308 pages";author[z]="William Shakespeare";
           System.out.println("Macbeth\n\tCustomer review:****\n\tAuthor:William Shakespeare \n\tPaperback: 308 pages \n\tPublication:UBS Publishers' Distributors Pvt. Ltd. (2006) \n\tCost of your purchase= Rs.160");
           cost=cost+160.0;z++;
        }
        else if(ch2==3)
         {
         name[z]="Hamlet";price[z]=85.0;pub[z]="Maple Press ";cover[z]="Paperback 176 pages";author[z]="William Shakespeare";
           System.out.println("Hamlet\n\tCustomer review:****\n\tAuthor:William Shakespeare \n\tPaperback: 176 pages \n\tPublication:Maple Press \n\tCost of your purchase= Rs.85");
           cost=cost+85.0;z++;
        }
        else
           System.out.println("Please, check your input");
        break;
           
        case 3:
        System.out.println("The choices are:\n\t1.for Ramayana\n\t2.for Mahabharatha\n\t3.for Legend of Hercules\n\t4.for Odyssey");
        System.out.println(" ");
        System.out.println("--------------------Enter your choice--------------------");
        int ch3=sc.nextInt();
        System.out.println(" ");
        if(ch3==1)
        {
          name[z]="Ramayana";price[z]=475.0;pub[z]="Bharatiya Vidya Bhavan";cover[z]="Paperback: 696 pages";author[z]="Valmiki";
           System.out.println("Ramayana\n\tCustomer review:****\n\tAuthor:Valmiki \n\tPaperback: 696 pages \n\tPublication:Bharatiya Vidya Bhavan \n\tCost of your purchase= Rs.475");
           cost=cost+475.0;z++;
        }
        else if(ch3==2)
         {
           name[z]="Mahabharatha";price[z]=800.0;pub[z]="Penguin India";cover[z]="Paperback: 912 pages";author[z]="Maharishi Vyasa";
           System.out.println("Mahabharatha\n\tCustomer review:*****\n\tAuthor:Maharishi Vyasa \n\tPaperback: 912 pages \n\tPublication:Penguin India \n\tCost of your purchase= Rs.800");
           cost=cost+800.0;z++;
        }
        else if(ch3==3)
         {
           name[z]="Legend of Hercules";price[z]=350.0;pub[z]="Osprey Publishing";cover[z]="Paperback: 80 pages";author[z]="Fred Van Lente";
           System.out.println("Legend of Hercules\n\tCustomer review:*****\n\tAuthor:Fred Van Lente \n\tPaperback: 80 pages \n\tPublication:Osprey Publishing \n\tCost of your purchase= Rs.350");
           cost=cost+350.0;z++;
        }
        else if(ch3==4)
         {
           name[z]="Odyssey";price[z]=129.0;pub[z]="Wordsworth Editions Ltd";cover[z]="Paperback: 512 pages";author[z]="Homer ";
           System.out.println("Odyssey\n\tCustomer review:***\n\tAuthor:Homer \n\tPaperback: 512 pages \n\tPublication:Wordsworth Editions Ltd \n\tCost of your purchase= Rs.129");
           cost=cost+129.0;z++;
        }
        else
           System.out.println("Please, check your input");
        break;
           
        case 4:
        System.out.println("The choices are:\n\t1.for Martian\n\t2.for The Three-Body Problem\n\t3.for Frankestein\n\t4.for Time Machine\n\t5.for War of the Worlds\n\t6.for Divergent");
        System.out.println(" ");
        System.out.println("--------------------Enter your choice--------------------");
        int ch4=sc.nextInt();
        System.out.println(" ");
        if(ch4==1)
        {
           name[z]="Martian";price[z]=130.0;pub[z]="Del Rey";cover[z]="Paperback: 384 pages";author[z]="Andy Weir";
           System.out.println("Martian\n\tCustomer review:*****\n\tAuthor:Andy Weir \n\tPaperback: 384 pages \n\tPublication:Del Rey \n\tCost of your purchase= Rs.130");
           cost=cost+130.0;z++;
        }
        else if(ch4==2)
         {
           name[z]="The Three-Body Problem";price[z]=1132;pub[z]="Tor Books";cover[z]="Hardcover: 400 pages";author[z]="CIXIN LIU";
           System.out.println("The Three-Body Problem\n\tCustomer review:*****\n\tAuthor:CIXIN LIU \n\tHardcover: 400 pages \n\tPublication:Tor Books \n\tCost of your purchase= Rs.1132");
           cost=cost+1132.0;z++;
        }
        else if(ch4==3)
         {
           name[z]="Frankestein";price[z]=140.0;pub[z]="Harper Collins";cover[z]="Paperback: 240 pages";author[z]="Mary Shelley";
           System.out.println("Frankestein\n\tCustomer review:****\n\tAuthor:Mary Shelley \n\tPaperback: 240 pages \n\tPublication:Harper Collins \n\tCost of your purchase= Rs.140");
           price1=price[z];price[z]-=((7.5/100)*price[z]);save1=price1-price[z];System.out.println(" ");System.out.println("\tCost of your purchase after 7.5% discount= Rs." +price[z]+"\n\tYou save: Rs."+save1);cost=cost+price[z];sa1=sa1+save1;z++;
        }
        else if(ch4==4)
         {
           name[z]="Time Machine";price[z]=88.0;pub[z]=" FINGERPRINT ";cover[z]="Paperback";author[z]="H.G. Wells ";
           System.out.println("Time Machine\n\tCustomer review:****\n\tAuthor:H.G. Wells \n\tPaperback \n\tPublication:FINGERPRINT  \n\tCost of your purchase= Rs.88");
           cost=cost+88.0;z++;
        }
        else if(ch4==5)
         {
           name[z]="War of the Worlds";price[z]=113.0;pub[z]="Om Books International";cover[z]="Hardcover";author[z]="H.G. Wells ";
           System.out.println("War of the Worlds\n\tCustomer review:****\n\tAuthor:H.G. Wells \n\tHardcover \n\tPublication:Om Books International \n\tCost of your purchase= Rs.113");
           cost=cost+113.0;z++;
        }
        else if(ch4==6)
         {
           name[z]="Divergent";price[z]=229.0;pub[z]="UK Children's";cover[z]="Paperback: 496 pages";author[z]="Veronica Roth";
           System.out.println("Divergent\n\tCustomer review:****\n\tAuthor:Veronica Roth \n\tPaperback: 496 pages \n\tPublication:UK Children's \n\tCost of your purchase= Rs.229");
           cost=cost+229.0;z++;
        }
        else
           System.out.println("Please, check your input");
        break;
           
        case 5:
        System.out.println("The choices are:\n\t1.for Adventures of Robin Hood\n\t2.for To Kill a Mockingbird \n\t3.for Kite Runner\n\t4.for The Book Theif\n\t5.for Alchemist\n\t6.for The Call of the Wild\n\t7.for A Tale of Two Cities");
        System.out.println(" ");
        System.out.println("--------------------Enter your choice--------------------");
        int ch5=sc.nextInt();
        System.out.println(" ");
        if(ch5==1)
        {
           name[z]="Adventures of Robin Hood";price[z]=256.0;pub[z]="Penguin USA";cover[z]="Paperback: 416 pages";author[z]="Howard Pyle";
           System.out.println("Adventures of Robin Hood\n\tCustomer review:*****\n\tAuthor:Howard Pyle \n\tPaperback: 416 pages \n\tPublication:Penguin USA \n\tCost of your purchase= Rs.256");
           cost=cost+256.0;z++;
        }
        else if(ch5==2)
         {
           name[z]="To Kill a Mockingbird ";price[z]=200.0;pub[z]="RHUK";cover[z]="Paperback: 320 pages";author[z]="Harper Lee";
           System.out.println("To Kill a Mockingbird \n\tCustomer review:*****\n\tAuthor:Harper Lee \n\tPaperback: 320 pages \n\tPublication:RHUK \n\tCost of your purchase= Rs.200");
           cost=cost+200.0;z++;
        }
        else if(ch5==3)
         {
           name[z]="Kite Runner";price[z]=200.0;pub[z]="Bloomsbury Publishing India Private Limited";cover[z]="Paperback: 343 pages";author[z]="Khaled Hosseini";
           System.out.println("Kite Runner\n\tCustomer review:****\n\tAuthor:Khaled Hosseini \n\tPaperback: 343 pages \n\tPublication:Bloomsbury Publishing India Private Limited \n\tCost of your purchase= Rs.200");
           cost=cost+200.0;z++;
        }
        else if(ch5==4)
         {
           name[z]="The Book Theif";price[z]=350.0;pub[z]="RHUK";cover[z]="Paperback: 560 pages";author[z]="Markus Zusak";
           System.out.println("The Book Theif\n\tCustomer review:****\n\tAuthor:Markus Zusak \n\tPaperback: 560 pages \n\tPublication:RHUK \n\tCost of your purchase= Rs.350");
           cost=cost+350.0;z++;
        }
        else if(ch5==5)
         {
           name[z]="Alchemist";price[z]=150.0;pub[z]="Harper Collins";cover[z]="Paperback: 208 pages";author[z]="Paulo Coelho";
           System.out.println("Alchemist\n\tCustomer review:****\n\tAuthor:Paulo Coelho \n\tPaperback: 208 pages \n\tPublication:Harper Collins \n\tCost of your purchase= Rs.150");
           price1=price[z];price[z]-=((7.5/100)*price[z]);save1=price1-price[z];System.out.println(" ");System.out.println("\tCost of your purchase after 7.5% discount= Rs." +price[z]+"\n\tYou save: Rs."+save1);cost=cost+price[z];sa1=sa1+save1;z++;
           
        }
        else if(ch5==6)
         {
          name[z]="The Call of the Wild";price[z]=150.0;pub[z]="Campfire ";cover[z]="Paperback: 72 pages";author[z]="Jack London";
           System.out.println("The Call of the Wild\n\tCustomer review:*****\n\tAuthor:Jack London \n\tPaperback: 72 pages \n\tPublication:Campfire  \n\tCost of your purchase= Rs.150");
           cost=cost+150.0;z++;
        }        
        else if(ch5==7)
         {
          name[z]="A Tale of Two Cities";price[z]=110.0;pub[z]="Om Books International";cover[z]="Hardcover: 240 pages";author[z]="Charles Dickens";
           System.out.println("A Tale of Two Cities\n\tCustomer review:*****\n\tAuthor:Charles Dickens \n\tHardcover: 240 pages \n\tPublication:Om Books International \n\tCost of your purchase= Rs.110");
           cost=cost+110.0;z++;
        }
        else
           System.out.println("Please, check your input");
        break;
           
        case 6:
        System.out.println("The choices are:\n\t1.for Harry Potter and the Cursed Child \n\t2.for Chronicles of Narnia\n\t3.for Percy Jackson and the Lightening Theif\n\t4.for Lord of the Rings");
        System.out.println(" ");
        System.out.println("--------------------Enter your choice--------------------");
        int ch6=sc.nextInt();
        System.out.println(" ");
        if(ch6==1)
        {
           name[z]="Harry Potter and the Cursed Child";price[z]=450.0;pub[z]="Little Brown";cover[z]="Hardcover: 352 pages";author[z]="J.K. Rowling";
           System.out.println("Harry Potter and the Cursed Child\n\tCustomer review:****\n\tAuthor:J.K. Rowling \n\tHardcover: 352 pages \n\tPublication:Little Brown \n\tCost of your purchase= Rs.450");
           cost=cost+450.0;z++;
        }
        else if(ch6==2)
         {
           name[z]="Chronicles of Narnia";price[z]=1200.0;pub[z]="Harper Collins";cover[z]="Paperback: 768 pages";author[z]="C.S. Lewis";
           System.out.println("Chronicles of Narnia\n\tCustomer review:*****\n\tAuthor:C.S. Lewis \n\tPaperback: 768 pages \n\tPublication:Harper Collins \n\tCost of your purchase= Rs.1200");
           price1=price[z];price[z]-=((7.5/100)*price[z]);save1=price1-price[z];System.out.println(" ");System.out.println("\tCost of your purchase after 7.5% discount= Rs." +price[z]+"\n\tYou save: Rs."+save1);cost=cost+price[z];sa1=sa1+save1;z++;
           
        }
        else if(ch6==3)
         {
           name[z]="Percy Jackson and the Lightening Theif";price[z]=200.0;pub[z]=" Penguin UK";cover[z]="Paperback: 384 pages";author[z]="Rick Riordan";
           System.out.println("Percy Jackson and the Lightening Theif\n\tCustomer review:*****\n\tAuthor:Rick Riordan \n\tPaperback: 384 pages \n\tPublication:Penguin UK \n\tCost of your purchase= Rs.200");
           cost=cost+200.0;z++;
        }
        else if(ch6==4)
         {
          name[z]="Lord of the Rings";price[z]=512.0;pub[z]="Harper Collins";cover[z]="Paperback: 1178 pages";author[z]="J.R.R. Tolkien";
           System.out.println("Lord of the Rings\n\tCustomer review:****\n\tAuthor:J.R.R. Tolkien \n\tPaperback: 1178 pages \n\tPublication:Harper Collins \n\tCost of your purchase= Rs.512");
          price1=price[z];price[z]-=((7.5/100)*price[z]);save1=price1-price[z];System.out.println(" ");System.out.println("\tCost of your purchase after 7.5% discount= Rs." +price[z]+"\n\tYou save: Rs."+save1);cost=cost+price[z];sa1=sa1+save1;z++;
        }        
        else
           System.out.println("Please, check your input");
        break;
           
        case 7:
        System.out.println("The choices are:\n\t1.for Inferno\n\t2.for And Then There Were None\n\t3.for Sherlock Holmes\n\t4.for The Forgotten Man");
        System.out.println(" ");
        System.out.println("--------------------Enter your choice--------------------");
        int ch7=sc.nextInt();
        System.out.println(" ");
        if(ch7==1)
        {
           name[z]="Inferno";price[z]=850.0;pub[z]="Corgi";cover[z]="Paperback: 624 pages";author[z]="Dan Brown";
           System.out.println("Inferno\n\tCustomer review:****\n\tAuthor:Dan Brown \n\tPaperback: 624 pages \n\tPublication:Corgi \n\tCost of your purchase= Rs.850");
           cost=cost+850.0;z++;
        }
        else if(ch7==2)
         {
           name[z]="And Then There Were None";price[z]=130.0;pub[z]="Harper";cover[z]="Paperback";author[z]="Agatha Christie";
           System.out.println("And Then There Were None\n\tCustomer review:****\n\tAuthor:Agatha Christie \n\tPaperback \n\tPublication:Harper \n\tCost of your purchase= Rs.130");
           cost=cost+130.0;z++;
        }
        else if(ch7==3)
         {
          name[z]="Sherlock Holmes";price[z]=420.0;pub[z]="RHUS";cover[z]="Paperback";author[z]="Arthur Conan Doyle";
           System.out.println("Sherlock Holmes\n\tCustomer review:****\n\tAuthor:Arthur Conan Doyle \n\tPaperback \n\tPublication:RHUS \n\tCost of your purchase= Rs.420");
           cost=cost+420.0;z++;
        }
        else if(ch7==4)
         {
          name[z]="The Forgotten Man";price[z]=270.0;pub[z]="Orion Publishing Group";cover[z]="Paperback: 416 pages";author[z]="Robert Crais";
           System.out.println("The Forgotten Man\n\tCustomer review:*****\n\tAuthor:Robert Crais \n\tPaperback: 416 pages \n\tPublication:Orion Publishing Group \n\tCost of your purchase= Rs.270");
           cost=cost+270.0;z++;
        }        
        else
           System.out.println("Please, check your input");               
        break;
           
        case 8:
        System.out.println("The choices are:\n\t1.for Goosebumps: Escape from Horrorland\n\t2.for Dracula\n\t3.for The Shining");
        System.out.println(" ");
        System.out.println("--------------------Enter your choice--------------------");
        int ch8=sc.nextInt();
        System.out.println(" ");
        if(ch8==1)
        {
           name[z]="Goosebumps: Escape from Horrorland";price[z]=190.0;pub[z]="Scholastic Incorporated";cover[z]=" Paperback: 132 pages";author[z]="R.L. Stine";
           System.out.println("Goosebumps: Escape from Horrorland\n\tCustomer review:*****\n\tAuthor:R.L. Stine \n\tPaperback: 132 pages \n\tPublication:Scholastic Incorporated \n\tCost of your purchase= Rs.190");
           cost=cost+190.0;z++;
        }
        else if(ch8==2)
         {
           name[z]="Dracula";price[z]=120.0;pub[z]="Fingerprint Publishing";cover[z]="Paperback: 368 pages";author[z]="Bram Stoker ";
           System.out.println("Dracula\n\tCustomer review:****\n\tAuthor:Bram Stoker \n\tPaperback: 368 pages \n\tPublication:Fingerprint Publishing \n\tCost of your purchase= Rs.120");
           cost=cost+120.0;z++;
        }
        else if(ch8==3)
         {
           name[z]="The Shining";price[z]=500.0;pub[z]="Hodder And Stoughton";cover[z]="Paperback: 512 pages";author[z]="Stephen King";
           System.out.println("The Shining\n\tCustomer review:*****\n\tAuthor:Stephen King \n\tPaperback: 512 pages \n\tPublication:Hodder And Stoughton \n\tCost of your purchase= Rs.500");
           cost=cost+500.0;z++;
        }
        else
           System.out.println("Please, check your input");               
        break;
           
        case 9:
        System.out.println("The choices are:\n\t1.for One Indian Girl\n\t2.for Half Girlfriend");
        System.out.println(" ");
        System.out.println("--------------------Enter your choice--------------------");
        int ch9=sc.nextInt();
        System.out.println(" ");
        if(ch9==1)
        {
           name[z]="One Indian Girl";price[z]=108.0;pub[z]="Rupa Publications India";cover[z]="Paperback: 280 pages";author[z]="Chetan Bhagat";
           System.out.println("One Indian Girl\n\tCustomer review:***\n\tAuthor:Chetan Bhagat \n\tPaperback: 280 pages \n\tPublication:Rupa Publications India \n\tCost of your purchase= Rs.108");
           cost=cost+108.0;z++;
        }
        else if(ch9==2)
         {
           name[z]="Half Girlfriend";price[z]=88.0;pub[z]="Rupa Publications India";cover[z]="Paperback: 280 pages";author[z]="Chetan Bhagat";
           System.out.println("Half Girlfriend\n\tCustomer review:****\n\tAuthor:Chetan Bhagat \n\tPaperback: 280 pages \n\tPublication:Rupa Publications India \n\tCost of your purchase= Rs.88");
           cost=cost+88.0;z++;
        }
        
        else
           System.out.println("Please, check your input");
        break;
           
        default:System.out.println("Please check your input");
        }
    }
    
    public void Non_Fiction()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("WELCOME TO THE NON-FICTION SECTION!!!\n\t*We provide a wide range of selections\n\t   *We are glad to announce that we have received the latest books");
       System.out.println(" ");
       System.out.println("The choices are:\n\t1.for Oxford English Dictionary\n\t2.for Biography\n\t3.for Religeon\n\t4.for Reference");       
       System.out.println(" ");
       System.out.println("--------------------Enter your choice--------------------");
       int ch=sc.nextInt(); 
       System.out.println(" ");
       switch(ch)
       {
           
        case 1:
        name[z]="Oxford English Dictionary";price[z]=400.0;pub[z]=" Oxford University Press";cover[z]="Paperback: 1820 pages";author[z]="-";
        System.out.println("Oxford English Dictionary\n\tCustomer review:**** \n\tPaperback: 1820 pages \n\tPublication:Oxford University Press \n\tCost of your purchase= Rs.400");
        cost=cost+400.0;z++;
        break;
           
        case 2:
        System.out.println("The choices are:\n\t1.for Wings Of Fire\n\t2.for A Beautiful Mind:John Nash\n\t3.for I Am Malala\n\t4.for Playing It My Way\n\t5.for The Bite in the Apple: Steve Jobs ");
        System.out.println(" ");
        System.out.println("--------------------Enter your choice--------------------");
        int ch2=sc.nextInt();
        System.out.println(" ");
        if(ch2==1)
        {
           name[z]="Wings Of Fire";price[z]=172.0;pub[z]="Universities Press";cover[z]="Paperback: 180 pages";author[z]="Dr. APJ Abdul Kalam";
           System.out.println("Wings Of Fire\n\tCustomer review:****\n\tAuthor:Dr. APJ Abdul Kalam \n\tPaperback: 180 pages \n\tPublication:Universities Press \n\tCost of your purchase= Rs.172");
           cost=cost+172.0;z++;
        }
        else if(ch2==2)
        {
           name[z]="A Beautiful Mind:John Nash";price[z]=300.0;pub[z]="Simon & Schuster";cover[z]="Paperback: 624 pages";author[z]="Sylvia Nasar";
           System.out.println("A Beautiful Mind:John Nash\n\tCustomer review:****\n\tAuthor:Sylvia Nasar \n\tPaperback: 624 pages \n\tPublication:Simon & Schuster \n\tCost of your purchase= Rs.300");
           cost=cost+300.0;z++;
        }              
        else if(ch2==3)
        {
           name[z]="I Am Malala";price[z]=158.0;pub[z]=" Orion Publishing Group";cover[z]="Paperback: 320 pages";author[z]="Malala Yousafzai ";
           System.out.println("I Am Malala\n\tCustomer review:****\n\tAuthor:Malala Yousafzai \n\tPaperback: 320 pages \n\tPublication:Orion Publishing Group \n\tCost of your purchase= Rs.158");
           cost=cost+158.0;z++;
        }
        else if(ch2==4)
        {
           name[z]="Playing It My Way";price[z]=695.0;pub[z]="Hodder And Stoughton";cover[z]="Hardcover: 486 pages";author[z]="Sachin Tendulkar";
           System.out.println("Playing It My Way\n\tCustomer review:****\n\tAuthor:Sachin Tendulkar \n\tHardcover: 486 pages \n\tPublication:Hodder And Stoughton \n\tCost of your purchase= Rs.695");
           cost=cost+695.0;z++;
        }        
        else if(ch2==5)
        {
           name[z]="The Bite in the Apple: Steve Jobs ";price[z]=490.0;pub[z]="Pan Macmillan India";cover[z]="Paperback: 307 pages";author[z]="Chrisann Brennan";
           System.out.println("The Bite in the Apple: Steve Jobs \n\tCustomer review:****\n\tAuthor:Chrisann Brennan \n\tPaperback: 307 pages \n\tPublication:Pan Macmillan India\n\tCost of your purchase= Rs.490");
           cost=cost+490.0;z++;
        }
        else
           System.out.println("Please, check your input");      
        break;
           
        case 3:
        System.out.println("The choices are:\n\t1.for Bhaghvath Gita\n\t2.for Bible\n\t3.for Quran\n\t4.for Astrology:Teach Yourself");
        System.out.println(" ");
        System.out.println("--------------------Enter your choice--------------------");
        int ch3=sc.nextInt();
        System.out.println(" ");
        if(ch3==1)
        {
           name[z]="Bhaghvath Gita";price[z]=408.0;pub[z]="Yogoda Satsanga Society of India";cover[z]="Paperback: 1312 pages";author[z]="Paramahansa Yogananda";
           System.out.println("Bhaghvath Gita\n\tCustomer review:*****\n\tAuthor:Paramahansa Yogananda \n\tPaperback: 1312 pages \n\tPublication:Yogoda Satsanga Society of India \n\tCost of your purchase= Rs.408");
           cost=cost+408.0;z++;
        }
        else if(ch3==2)
         {
           name[z]="Bible";price[z]=310.0;pub[z]="Random House ";cover[z]=" Paperback: 1120 pages";author[z]="-";
           System.out.println("Bible\n\tCustomer review:****\n\tPaperback: 1120 pages \n\tPublication:Random House  \n\tCost of your purchase= Rs.310");
           cost=cost+310.0;z++;
        }
        else if(ch3==3)
           {
           name[z]="Quran";price[z]=250.0;pub[z]="Oxford";cover[z]="Paperback: 512 pages";author[z]="M.A.S. Abdel Haleem";
           System.out.println("Quran\n\tCustomer review:****\n\tAuthor:M.A.S. Abdel Haleem \n\tPaperback: 512 pages \n\tPublication:Oxford \n\tCost of your purchase= Rs.250");
           cost=cost+250.0;z++;
        }
        else if(ch3==4)
           {
           name[z]="Astrology:Teach Yourself";price[z]=124.0;pub[z]="Lotus Press ";cover[z]="Paperback: 126 pages";author[z]="Jaipuria Sharma ";
           System.out.println("Astrology:Teach Yourself\n\tCustomer review:*****\n\tAuthor:Jaipuria Sharma \n\tPaperback: 126 pages \n\tPublication:Lotus Press  \n\tCost of your purchase= Rs.124");
           cost=cost+124.0;z++;
        }
        else
           System.out.println("Please, check your input");
        break;
           
        case 4:
        System.out.println("The choices are:\n\t1.for Discovery Kids:Encyclopedia of Everything \n\t2.for 101 Science Experiments\n\t3.for GK Quiz 2016\n\t4.for Travel Guide:India\n\t5.for Khazana of Indian Recipes\n\t6.for National Geographic Animal Encyclopedia");
        System.out.println(" ");
        System.out.println("--------------------Enter your choice--------------------");
        int ch4=sc.nextInt();
        System.out.println(" ");
        if(ch4==1)
        {
           name[z]="Discovery Kids:Encyclopedia of Everything ";price[z]=691.0;pub[z]="Parragon Publishing";cover[z]="Hardcover: 219 pages";author[z]="-";
           System.out.println("Discovery Kids:Encyclopedia of Everything \n\tCustomer review:****\n\tHardcover: 219 pages \n\tPublication:Parragon Publishing \n\tCost of your purchase= Rs.691");
           cost=cost+691.0;z++;
        }
        else if(ch4==2)
        {
           name[z]="101 Science Experiments";price[z]=245.0;pub[z]="DK Children";cover[z]="Paperback: 120 pages";author[z]="Neil Ardley ";
           System.out.println("101 Science Experiments\n\tCustomer review:****\n\tAuthor:Neil Ardley \n\tPaperback: 120 pages \n\tPublication:DK Children \n\tCost of your purchase= Rs.245");
           cost=cost+245.0;z++;
        }               
        else if(ch4==3)
        {
           name[z]="GK Quiz 2016";price[z]=427.0;pub[z]="Pearson Education";cover[z]="Paperback: 1280 pages";author[z]="Edgar Thorpe ";
           System.out.println("GK Quiz 2016\n\tCustomer review:****\n\tAuthor:Edgar Thorpe \n\tPaperback: 1280 pages \n\tPublication:Pearson Education \n\tCost of your purchase= Rs.427");
           cost=cost+427.0;z++;
        }
        else if(ch4==4)
        {
           name[z]="Travel Guide:India";price[z]=1471.0;pub[z]="Lonely Planet Publications";cover[z]="Paperback: 1248 pages";author[z]="Sarina Singh and Mark Elliott";
           System.out.println("Travel Guide:India\n\tCustomer review:****\n\tAuthor:Sarina Singh and Mark Elliott \n\tPaperback: 1248 pages \n\tPublication:Lonely Planet Publications \n\tCost of your purchase= Rs.1471");
           cost=cost+1471.0;z++;
        }        
        else if(ch4==5)
        {
           name[z]="Khazana of Indian Recipes";price[z]=224.0;pub[z]="Popular Prakashan Pvt Ltd";cover[z]="Hardcover: 122 pages";author[z]="Sanjeev Kapoor";
           System.out.println("Khazana of Indian Recipes\n\tCustomer review:*****\n\tAuthor:Sanjeev Kapoor \n\tHardcover: 122 pages \n\tPublication:Popular Prakashan Pvt Ltd \n\tCost of your purchase= Rs.224");
           cost=cost+224.0;z++;
        }
        else if(ch4==6)
        {
           name[z]="National Geographic Animal Encyclopedia";price[z]=975.0;pub[z]="National Geographic Children's Books";cover[z]="Hardcover: 304 pages";author[z]="Lucy Spelman";
           System.out.println("National Geographic Animal Encyclopedia\n\tCustomer review:*****\n\tAuthor:Lucy Spelman \n\tHardcover: 304 pages \n\tPublication:National Geographic Children's Books \n\tCost of your purchase= Rs.975");
           cost=cost+975.0;z++;
        }
        else
           System.out.println("Please, check your input");
        break;
        
        default:System.out.println("Please check your input");
        }
    }
    
      public void Education()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("WELCOME TO THE EDUCATION SECTION!!!\n\t*We provide a wide range of selections\n\t   *We are glad to announce that we have received the latest books");
       System.out.println(" ");
       System.out.println("The choices are:\n\t1.for School text books\n\t2.for Learn JAVA Programming\n\t3.for Complete NEET Guide\n\t4.for Study package for NTSE");
       System.out.println("\t5.for How to crack IIT-JEE exams\n\t6.for Karnataka CET Explorer ");
       System.out.println(" ");
       System.out.println("--------------------Enter your choice--------------------");
       int ch=sc.nextInt();
       System.out.println(" ");
       
       switch(ch)
       {
           case 1:           
           String syl=" ";
           System.out.println("Enter the syllabus: 1.ICSE\n\t\t    2:CBSE\n\t\t    3.State");
           int sy=sc.nextInt();
           if(sy==1)
               { price[z]=200.0; syl="ICSE";}
           else if(sy==2)
               {price[z]=150.0; syl="CBSE";}
           else if(sy==3)
               { price[z]=80.0; syl="State";}
           else
               {System.out.println("Please, check your input");}
           System.out.println(" ");    
           System.out.println("Enter the standard in which your ward is studying");
           String std=sc.next();
           System.out.println("Enter the subject");
           String sub=sc.next();String sub1=sc.nextLine();
           name[z]="Class "+std+ ": "+syl+" "+sub+sub1;
           pub[z]=syl+" Board";cover[z]="-";author[z]="-";
           System.out.println(" ");
           System.out.println(name[z]+"\n\t  Publication: "+pub[z]+"\n\t  Cost of your purchase= Rs."+price[z]);
           cost=cost+price[z];z++;
           break;
           
           case 2:
           name[z]="Learn JAVA Programming";price[z]=646.0;pub[z]="McGraw Hill Education";cover[z]="Paperback: 1312 pages";author[z]="Herbert Schildt";
           System.out.println("Learn JAVA Programming\n\tCustomer review:****\n\tAuthor:Herbert Schildt \n\tPaperback: 1312 pages \n\tPublication:McGraw Hill Education \n\tCost of your purchase= Rs.646");
           cost=cost+646.0;z++;
           break;
           
           case 3:
           name[z]="Complete NEET Guide";price[z]=360.0;pub[z]="MTG Learning Media Private Limited";cover[z]="Paperback: 700 pages";author[z]="MTG Editorial Board ";
           System.out.println("Complete NEET Guide\n\tCustomer review:*****\n\tAuthor:MTG Editorial Board \n\tPaperback: 700 pages \n\tPublication:MTG Learning Media Private Limited \n\tCost of your purchase= Rs.360");
           cost=cost+360.0;z++;
           break;
           
           case 4:
           name[z]="Study package for NTSE";price[z]=695.0;pub[z]="McGraw Hill Education";cover[z]="Paperback: 1240 pages";author[z]="McGraw Hill Education ";
           System.out.println("Study package for NTSE\n\tCustomer review:*****\n\tAuthor:McGraw Hill Education \n\tPaperback: 1240 pages \n\tPublication:McGraw Hill Education \n\tCost of your purchase= Rs.695");
           cost=cost+695.0;z++;
           break;
           
           case 5:
           name[z]="How to crack IIT-JEE exams";price[z]=237.0;pub[z]="Arihant Publications";cover[z]="Paperback: 530 pages";author[z]="D.C. Pandey ";
           System.out.println("How to crack IIT-JEE exams\n\tCustomer review:*****\n\tAuthor:D.C. Pandey \n\tPaperback: 530 pages \n\tPublication:Arihant Publications \n\tCost of your purchase= Rs.237");
           cost=cost+237.0;z++;
           break;
           
           case 6:
           name[z]="Karnataka CET Explorer";price[z]=384.0;pub[z]="MTG Learning Media Private Limited";cover[z]="Paperback: 592 pages";author[z]="MTG Editorial Board";
           System.out.println("Karnataka CET Explorer\n\tCustomer review:****\n\tAuthor:MTG Editorial Board \n\tPaperback: 592 pages \n\tPublication:MTG Learning Media Private Limited \n\tCost of your purchase= Rs.384");
           cost=cost+384.0;z++;
           break;
                      
           default:System.out.println("Please check your input");
        }
    }
    
    public void Comics()
   {
       double price1=0.0;double save1=0.0;
       Scanner sc=new Scanner(System.in);
       System.out.println("WELCOME TO THE COMICS SECTION!!!\n\t*We provide a wide range of selections\n\t   *We are glad to announce that we have received the latest books");
       System.out.println(" ");
       System.out.println("The choices are:\n\t1.for TINTIN: The Secret of the Unicorn\n\t2.for Asterix in Olympic Games\n\t3.for Suppandi\n\t4.for Amazing Spiderman\n\t5.for ACK Comics:250 titles");       
       System.out.println(" ");
       System.out.println("--------------------Enter your choice--------------------");
       int ch=sc.nextInt();
       System.out.println(" ");
       
       switch(ch)
       {
           case 1:
           name[z]="TINTIN: The Secret of the Unicorn";price[z]=316.0;pub[z]="Egmont";cover[z]="Paperback: 64 pages";author[z]="Herge";
           System.out.println("TINTIN: The Secret of the Unicorn\n\tCustomer review:*****\n\tAuthor:Herge \n\tPaperback: 64 pages \n\tPublication:Egmont \n\tCost of your purchase= Rs.316");
           price1=price[z];price[z]-=((5.0/100)*price[z]);save1=price1-price[z];System.out.println(" ");System.out.println("\tCost of your purchase after 5% discount= Rs." +price[z]+"\n\tYou save: Rs."+save1);cost=cost+price[z];sa1=sa1+save1;z++;
           break;
           
           case 2:
           name[z]="Asterix in Olympic Games";price[z]=383.0;pub[z]="French & European Pubns.";cover[z]="Hardcover: 48 pages";author[z]="Rene Goscinny and Albert Uderzo ";
           System.out.println("Asterix in Olympic Games\n\tCustomer review:****\n\tAuthor:Rene Goscinny and Albert Uderzo \n\tHardcover: 48 pages \n\tPublication:French & European Pubns. \n\tCost of your purchase= Rs.383");
           price1=price[z];price[z]-=((5.0/100)*price[z]);save1=price1-price[z];System.out.println(" ");System.out.println("\tCost of your purchase after 5% discount= Rs." +price[z]+"\n\tYou save: Rs."+save1);cost=cost+price[z];sa1=sa1+save1;z++;
           break;
           
           case 3:
           name[z]="Suppandi";price[z]=120.0;pub[z]="Amar Chitra Katha Private Limited ";cover[z]="Paperback: 72 pages";author[z]="Luis Fernandes ";
           System.out.println("Suppandi\n\tCustomer review:****\n\tAuthor:Luis Fernandes \n\tPaperback: 72 pages \n\tPublication:Amar Chitra Katha Private Limited \n\tCost of your purchase= Rs.120");
           price1=price[z];price[z]-=((5.0/100)*price[z]);save1=price1-price[z];System.out.println(" ");System.out.println("\tCost of your purchase after 5% discount= Rs." +price[z]+"\n\tYou save: Rs."+save1);cost=cost+price[z];sa1=sa1+save1;z++;
           break;
           
           case 4:
           name[z]="Amazing Spiderman";price[z]=1915.0;pub[z]="Hachette Book Group";cover[z]="Paperback: 504 pages";author[z]="Stan Lee ";
           System.out.println("Amazing Spiderman\n\tCustomer review:****\n\tAuthor:Stan Lee \n\tPaperback: 504 pages \n\tPublication:Hachette Book Group \n\tCost of your purchase= Rs.1915");
           price1=price[z];price[z]-=((5.0/100)*price[z]);save1=price1-price[z];System.out.println(" ");System.out.println("\tCost of your purchase after 5% discount= Rs." +price[z]+"\n\tYou save: Rs."+save1);cost=cost+price[z];sa1=sa1+save1;z++;
           break;
           
           case 5:
           name[z]="ACK Comics:250 titles";price[z]=15000.0;pub[z]="Amar Chitra Katha";cover[z]="Paperback: 11999 pages";author[z]="Anant Pai";
           System.out.println("ACK Comics:250 titles\n\tCustomer review:*****\n\tAuthor:Anant Pai \n\tPaperback: 11999 pages \n\tPublication:Amar Chitra Katha \n\tCost of your purchase= Rs.15000");
           price1=price[z];price[z]-=((5.0/100)*price[z]);save1=price1-price[z];System.out.println(" ");System.out.println("\tCost of your purchase after 5% discount= Rs." +price[z]+"\n\tYou save: Rs."+save1);cost=cost+price[z];sa1=sa1+save1;z++;
           break; 
           
           default:System.out.println("Please check your input");
        }
    }
    
    public void Children_Literature()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("WELCOME TO THE CHILDREN LITERATURE SECTION!!!\n\t*We provide a wide range of selections\n\t   *We are glad to announce that we have received the latest books");
       System.out.println(" ");
       System.out.println("The choices are:\n\t1.for Panchatantra\n\t2.for Geronimo Stilton:The Cheese Experiment\n\t3.for Thea Stilton:The Journey to Atlantis\n\t4.for Peter Pan\n\t5.for Snow White and the Seven Dwarfs ");
       System.out.println("\t6.for 365 Fairy Tales\n\t7.for Alice in Wonderland\n\t8.for Witty tales of Akbar & Birbal\n\t9.for Charlie & the choclate factory\n\t10.for Jungle Book");
       System.out.println(" ");
       System.out.println("--------------------Enter your choice--------------------");
       int ch=sc.nextInt();
       System.out.println(" ");
       
       switch(ch)
       {
           case 1:
           name[z]="Panchatantra";price[z]=120.0;pub[z]="Om books";cover[z]="Hard cover & 80 pages";author[z]="Pandit Vishnu Sharma ";
           System.out.println("Panchatantra\n\tAuthor:Pandit Vishnu Sharma\n\tHard cover & 80 pages\n\tPublication: Om books\n\tCost of your purchase= Rs.120");
           cost=cost+120.0;z++;
           break;
           
           case 2:
           name[z]="Geronimo Stilton:The Cheese Experiment";price[z]=210.0;pub[z]="Scholastic";cover[z]="Paperback: 128 pages";author[z]="Geronimo Stilton ";
           System.out.println("Geronimo Stilton:The Cheese Experiment\n\tCustomer review:****\n\tAuthor:Geronimo Stilton \n\tPaperback: 128 pages \n\tPublication:Scholastic \n\tCost of your purchase= Rs.210");
           cost=cost+210.0;z++;
           break;
           
           case 3:
           name[z]="Thea Stilton:The Journey to Atlantis";price[z]=265.0;pub[z]="Scholastic";cover[z]="Hardcover: 320 pages";author[z]="Geronimo Stilton";
           System.out.println("Thea Stilton:The Journey to Atlantis\n\tCustomer review:*****\n\tAuthor:Geronimo Stilton \n\tHardcover: 320 pages \n\tPublication:Scholastic \n\tCost of your purchase= Rs.265");
           cost=cost+265.0;z++;
           break;
           
           case 4:
           name[z]="Peter Pan";price[z]=72.0;pub[z]="Pegasus";cover[z]="Paperback: 143 pages";author[z]="J.M. Barrie";
           System.out.println("Peter Pan\n\tCustomer review:*****\n\tAuthor:J.M. Barrie \n\tPaperback: 143 pages \n\tPublication:Pegasus \n\tCost of your purchase= Rs.72");
           cost=cost+72.0;z++; 
           break;
           
           case 5:
           name[z]="Snow White and the Seven Dwarfs ";price[z]=159.0;pub[z]="Penguin UK ";cover[z]="Hardcover: 48 pages";author[z]="Walt Disney";
           System.out.println("Snow White and the Seven Dwarfs\n\tCustomer review:****\n\tAuthor:Walt Disney \n\tHardcover: 48 pages \n\tPublication:Penguin UK \n\tCost of your purchase= Rs.159");
           cost=cost+159.0;z++;
           break;
           
           case 6:
           name[z]="365 Fairy Tales";price[z]=278.0;pub[z]="Dreamland Publication";cover[z]="Hardcover: 200 pages";author[z]="-";
           System.out.println("365 Fairy Tales\n\tCustomer review:****\n\tHardcover: 200 pages \n\tPublication:Dreamland Publication \n\tCost of your purchase= Rs.278");
           cost=cost+278.0;z++;
           break;
           
           case 7:
           name[z]="Alice in Wonderland";price[z]=105.0;pub[z]="Scholastic";cover[z]="Paperback: 160 pages";author[z]="Lewis Carroll";
           System.out.println("Alice in Wonderland\n\tCustomer review:****\n\tAuthor:Lewis Carroll \n\tPaperback: 160 pages \n\tPublication:Scholastic \n\tCost of your purchase= Rs.105");
           cost=cost+105.0;z++;
           break;
           
           case 8:
           name[z]="Witty tales of Akbar & Birbal";price[z]=140.0;pub[z]="Penguin Books Limited ";cover[z]="Paperback: 224 pages";author[z]="Amita Sarin";
           System.out.println("Witty tales of Akbar & Birbal\n\tCustomer review:*****\n\tAuthor:Amita Sarin \n\tPaperback: 224 pages \n\tPublication:Penguin Books Limited \n\tCost of your purchase= Rs.140");
           cost=cost+140.0;z++;
           break;
           
           case 9:
           name[z]="Charlie & the choclate factory";price[z]=255.0;pub[z]=" Puffin";cover[z]="Paperback: 208 pages";author[z]="Roald Dahl ";
           System.out.println("Charlie & the choclate factory\n\tCustomer review:*****\n\tAuthor:Roald Dahl \n\tPaperback: 208 pages \n\tPublication:Puffin \n\tCost of your purchase= Rs.255");
           cost=cost+255.0;z++;
           break;
           
           case 10:
           name[z]="Jungle Book";price[z]=100.0;pub[z]="Disney";cover[z]="Hardcover: 48 pages";author[z]="Rudyard Kipling";
           System.out.println("Jungle Book\n\tCustomer review:****\n\tAuthor:Rudyard Kipling \n\tHardcover: 48 pages \n\tPublication:Disney \n\tCost of your purchase= Rs.100");
           cost=cost+100.0;z++;
           break;
           
           default:System.out.println("Please check your input");
        }
    }
}

           
            
            
                 
                 
        
  

        
        
