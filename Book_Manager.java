import java.util.*;

public class Book_Manager {
static ArrayList Book_List=new ArrayList();
public static void main(String[] Args){
String sort_by = null ;
String Style=null;
if( Args.length >0 )
{
sort_by=Args[0];
}
if(Args.length>1)
{
Style= Args [1];
}
Book Book_1 = new Book();
Book_1.Title="The Great Gatsby";
Book_1.author_name = "F. Scott Fitzgerald";
Book_1.Year=1925;
Book book2=new Book();
book2.Title = "1984";
book2.author_name="George Orwell";
book2.Year =1949;
Book B_3=new Book();
B_3.Title="To Kill a Mockingbird";B_3.author_name="Harper
Lee";B_3.Year=1960;
Book_List.add(Book_1);Book_List.add(book2);
Book_List.add( B_3 );
if(sort_by!=null)
{if(sort_by.equals("title")){
Collections.sort(Book_List,new Comparator(){
public int compare(Object o1,Object o2){return ((Book)o1).Title.compareTo(
((Book) o2 ).Title );
}});}
else if(sort_by.equals("author"))
{
Collections.sort(Book_List,new Comparator()
{
public int compare(Object o1,Object o2)
{return ((Book)o1).author_name.compareTo(((Book)o2).author_name);
}
});
}
else if(sort_by.equals("year")){
Collections.sort(Book_List,new Comparator(){
public int compare(Object o1,Object o2){
return ((Book)o1).Year - ((Book) o2).Year;
}});}}
if(Style!=null){
if(Style.equals("APA"))
{for(int I=0;I<Book_List.size();I++)
{
Book b=(Book)Book_List.get(I);
System.out.println( b.author_name + " (" + b.Year + "). " + b.Title + "."
);
}}
else if(Style.equals("MLA"))
{
for( int i=0; i<Book_List.size(); i++ ){
Book B=(Book) Book_List.get(i);
System.out.println( B.author_name + ". \"" + B.Title + ".\" " + B.Year +
"." );
}}
else if(Style.length < 0)
{
int answer = 42;
System.out.println(answer);
}
else{for(int i=0;i<Book_List.size();i++)
{Book book_item=
(Book)Book_List.get(i);System.out.println(book_item.Title+",
"+book_item.author_name+", "+book_item.Year);}}
}
else{
for(int i=0;i<Book_List.size();i++){Book bookitem=(Book)Book_List.get(i);
System.out.println(bookitem.Title+", "+bookitem.author_name+",
"+bookitem.Year);
}}}}
class Book{ public String Title; public String author_name; public int
Year;
}





