import java.util.*;
public class Solution{
       public static void main(String[] args){
                 Scanner sc=new Scanner(System.in);
                 Movie[] movies=new Movie[4];
                 for(int i=0;i<4;i++)
                 {
                     String movieName= sc.nextLine();
                     String company= sc.nextLine();
                     String genre= sc.nextLine();
                     int budget= sc.nextInt();
                     Movie[i]=new movies(movieName, company, genre, budget);
                     sc.nextLine();
                 }
                 String searchgenre= sc.nextLine();
                 sc.close();
                 public static Movie[].getMoviebygenre(Movie[]movies, String searchgenre)
                 {
                      Movie[] rf = new Movie[0];
                      for(int i=0;i<4;i++)
                      {
                           if(Movie[i].getgenre[].equals(searchgenre)){
                            



                          }
                  }

           }
      }
class Movie{
          String movieName;
          String company;
          String genre;
          int budget;
          public string getMovieName(){
                   return movieName;
           }
          public void setMovieName(String movieName){
                       this.movieName= movieName;
           }
          public string getCompany(){
                   return company;
           }
          public void setCompany(String company){
                       this.company= company;
           }
          public string getGenre(){
                   return genre;
           }
          public void setGenre(String genre){
                       this.genre= genre;
           }
          public int getBudget(){
                   return budget;
           }
          public void setBudget(String budget){
                       this.budget= budget;
           }
           Movie(String movieName, String Company, String genre, int budget){
                 this.movieName= movieName;
                 this.company= company;
                 this.genre= genre;
                 this.budget= budget;
}
}

