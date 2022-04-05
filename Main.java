import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    char zn;
    String zd;
    
    System.out.println("Podaj jakieś zdanie");
    zd=myObj.nextLine();
       
    int size=zd.length();
    char slowo[]=new char[size];
    for(int i=0;i<size;i++)
      slowo[i]=zd.charAt(i);
    int change=0;
    int liczbowo;
   for (int i=0;i<size;i++)
      {
        liczbowo=slowo[i];
        if(liczbowo>64&& liczbowo<91)
        {
          liczbowo=liczbowo+32;
          zn=(char)liczbowo;
          slowo[i]=zn;
          change++;
        }else if(liczbowo==32)
        {
          liczbowo=95;
          zn=(char)liczbowo;
          slowo[i]=zn;
          change++;
        }else
        {
          liczbowo=liczbowo-32;
          zn=(char)liczbowo;
          slowo[i]=zn;
          change++;
        }
      }
    for (int i=0;i<size;i++)
      {
        System.out.print(slowo[i]);
      }
    
    System.out.println();
    System.out.print("Liczba zmian: "+change);
    System.out.println();
    System.out.println("Liczba znaków: "+size);
  }
}