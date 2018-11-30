class waystofindchar
{

    public static void main(String args[]){

          Scanner c=new Scanner(System.in);

           System.out.println("Enter a name : ");

           String s=c.next();

           int x=0;

           System.out.println("characters are:");

           while(x<s.length()){

            System.out.println(x+ "=" + s.charAt(x));

            x++;

           }

           System.out.println("End");

     

    }

}
