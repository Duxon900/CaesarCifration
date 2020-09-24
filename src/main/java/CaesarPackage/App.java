/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package CaesarPackage;

import java.lang.CharSequence;

public class App {
    public static String alfabebt="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String alfaBerria="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static App nireApp=null;

    public static void main(String args[]){

        nireApp=new App();

        nireApp.desordenatuGakoarekin("zxcvbnmasdfghjklqwertyuiop");
        System.out.println(alfaBerria+" da zure alfabetua");
        String mezuGarbia="ez gaude gerraren alde";

        String kriptograma=nireApp.zifratu(mezuGarbia);
        System.out.println(kriptograma);

        System.out.println("####################################");

        kriptograma=nireApp.deszifratu(kriptograma);
        System.out.println(kriptograma);

    }

    private void desordenatuGakoarekin(String gakoa){
        String emaitza;
        gakoa=gakoa.toUpperCase();
        emaitza=gakoa;

        for(int i=0;i<alfabebt.length();i++){
            char lag=alfabebt.charAt(i);
            boolean bool=false;
            int a=0;

            while(!bool && a<gakoa.length()){
                char unekoa=gakoa.charAt(a);
                if(unekoa==lag){
                    bool=true;
                }
                a++;
            }

            if (!bool) emaitza=emaitza+lag;

        }

        alfaBerria=emaitza;

    }



    private void desordenatu(String aldatzeko){
        char[] lista=aldatzeko.toCharArray();
        lista=fisherYates(lista);

        String emaitza="";
        for (int i=0;i<lista.length;i++){
            emaitza=emaitza+lista[i];
        }

        alfaBerria=emaitza;
    }
    //Fisher-Yates shuffle eraginkorra da lista txikiak desordenatzeko, gure kasuan 26 elementuko lista da
    private char[] fisherYates(char[] lista){
        for (int i=0;i<lista.length;i++){
            int auzaz=(int)(Math.random()*25+1);
            swap(lista,i,auzaz);
        }
        return lista;
    }

    private void swap(char[] lista, int a, int b){
        char lag=lista[a];
        lista[a]=lista[b];
        lista[b]=lag;
    }

   public String zifratu(String mezua){
        mezua=mezua.toUpperCase();
        char[] lista=mezua.toCharArray();
        String emaitza="";

        for (int i=0;i<lista.length;i++){
            char lag=lista[i];

            if(lag!=' '){
                int unekoa=alfabebt.indexOf(lista[i]);
                emaitza=emaitza+alfaBerria.charAt(unekoa);
            }
            else{
                emaitza=emaitza+" ";
            }
        }
        return emaitza;
    }

    public String deszifratu(String kripto){
        kripto=kripto.toUpperCase();
        char[] lista=kripto.toCharArray();
        String emaitza="";

        for (int i=0;i<lista.length;i++){
            char lag=lista[i];

            if(lag!=' '){
                int unekoa=alfaBerria.indexOf(lista[i]);
                emaitza=emaitza+alfabebt.charAt(unekoa);
            }
            else{
                emaitza=emaitza+" ";
            }
        }
        return emaitza;
    }

}
