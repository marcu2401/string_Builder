/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sb;

/**
 *
 * @author Márk
 */
public class SB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //literálként
        StringBuilder szoveg =new StringBuilder("avakadabrak");
        szoveg.charAt(0);   //elso
        szoveg.length();
        szoveg.charAt(szoveg.length()-1); //utolso 8. index
        szoveg.indexOf("rak");   //
        szoveg.substring(0,5);  //(0-tol, 5-db szam)avaka ad vissza az 5. mar nincs benne 
        szoveg.substring(6); //dabrakot ad vissza 
       
        //barmit hozza lehet füzni!!!
        szoveg.append(2);
        szoveg.append(true);
        szoveg.append("kulimutyy");
        szoveg.toString().toUpperCase();  //2truekulimutyy add vissza   raadasul nagy betuisen
       
       
        
        //barhova barmit megadhatjuk hogy hova pontosan 
        szoveg.insert(3,"laci");
        szoveg.insert(szoveg.length(),"laci");           //vegere szur be 
         
        
        //paraméterként
        String s = "asd asdasd";
        StringBuilder sb2= new StringBuilder(szoveg);
        s.startsWith("as");     //igaz e hogy ez az eleje
        s.endsWith("d");            //igaz e hogy ez a vege
        s.replace("a", "s");  //lecserel
        s.replaceAll("a", "d");     //mindent lecserel 
        s.replaceFirst("s", "d");  //elsot cserweli le 
        s.contains("asd");   //true vagy false
        s.split("a");   //az a karakterekne tordeli es egy listat avagy tombot ad vissza
        s.split(" "); //a szokozoknel valaszt el
        s.split("a", 1);  //CSAK az elso a betutol azaz egy szot rak a tombe jele nesetben
//lehet üres is 
         StringBuilder sb3= new StringBuilder();
         
         //karakter tomb 
         char data[] = {'a', 'b', 'c'};
         
         //hozzáfuzes
        String asd = "Indul";
        asd = asd.concat(" a");
        asd = asd.concat(" gorog");
        asd = asd.concat(" aludni");
        System.out.println(asd);
    }  
    
}
