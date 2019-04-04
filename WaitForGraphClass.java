
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class WaitForGraphClass {

 

   public String WaitForGraph(String time) throws IOException
   {
      char locktype = ' ', lockItem =' ';
      int count = 0,  i = 0 ,t=0,k = 0,m=0,g=0,d=0,a=-1,w=-1,TransNum = 0;
      Item I = new Item();
      String wait="";
      Transaction T = new Transaction();
      Transaction [] translist = new Transaction [100];
      Item[] itemlist = new Item[100]; 
      Item[] waitlist = new Item[100];
      int[][] cycle=new int[2][100];
      int[]det= new int[100];
   
      
      BufferedReader br;
      br = new BufferedReader(new FileReader(new File("/Users/robaahmad/Desktop/Transactions.txt")));
      String line;
      while ((line=br.readLine()) != null &&( count+1)<=Integer.parseInt(time)) {
         count++;
      
         if ("begin".equals(line.substring(0, 5))) {
            
            T.setTransNum(Integer.parseInt(""+line.charAt(6)));
            T.setTransTime(count);
            translist[t]=new Transaction(T.getTransNum(),T.getTransTime());
            t++;
         }
         else if (("lock".equals(line.substring(0, 4)))){
            
            locktype = line.charAt(5);
            lockItem = line.charAt(7);
            TransNum = Integer.parseInt(""+line.charAt(10));
            for(int l=0;l<t ;l++){ 
               if (translist[l].getTransNum() == TransNum) {
                  T = new Transaction(TransNum, translist[l].getTransTime());
                  itemlist[k] = new Item(locktype,lockItem,T);
                  k++;
               }}
                           
            
          
            while (i < k  ){            
               if (itemlist[i].gettype() == locktype && itemlist[i].getItem() == lockItem&&TransNum!=itemlist[i].getT().getTransNum())
               {
                  if ((locktype == 'X') || ((locktype == 'S' && itemlist[i].gettype() == 'X') && (itemlist[i].getItem() == lockItem))) {
                           
                     waitlist[m++] = new Item(locktype, lockItem, T);
                     cycle[0][g]=itemlist[i].getT().getTransNum();
                     cycle[1][g++]=TransNum;
                     
                  
                  
                  } 
                  
               }
               ++i;
            
            }
            i=0;
         
         }
         else if (("commit".equals(line.substring(0, 6)))||"abort".equals(line.substring(0, 5))) {
            for (int j = 0; j <m; j++) {
               if (waitlist[j].getT().getTransNum() == (line.charAt(7))) {
                  waitlist[j] = null;
               }
            }
            
         }
         if(count==Integer.parseInt(time))
         {
          
            for(int l=0;l<g;l++)
            {
               for(int y=0;y<g;y++)
               {
               
                  for(int u=0;u<g;u++){
                     if( cycle[0][y]== cycle[1][u]&&cycle[0][y]!=w)
                     {
                        w=cycle[0][y];
                        a=y;
                        break; 
                     }
                  }
               
               
                  if(a!=-1)
                     break;
               
               }
             
               if(a!=-1)
               {
                  for(int s=0;s<g;s++){
                     if(cycle[1][a]==cycle[0][s]){
                        if(cycle[1][a]==w)
                        {
                           
                           return "There is a deadlock at this time";
                           
                        }
                        if(a!=g-1)
                        {
                           a=s;
                           s=-1;
                        }
                     }    
                  }
                  a=-1;
               }                 
            }  
            return "There is no a deadlock at this time";
         }
      
      
      }
      return "Enter a valid time";
      
   }

}

 
