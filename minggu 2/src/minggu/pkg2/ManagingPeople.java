/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu.pkg2;

/**
 *
 * @author USER
 */
public class ManagingPeople 
{
    
    public static void main(String[] args)
    {
                Person p1 = new Person("arial", 37);
                Person p2 = new Person("joseph", 15);
                
                if(p1.getAge()==p2.getAge())
                {
                    System.out.println(p1.getName()+" is the same age as "+p2.getName());
                }
                else
                {
                    System.out.println(p1.getName()+" is NOT the same age as "+p2.getName());
                }
    }
}

