public class HeyJude{
    public static void main(String[] args){
        String HeyJude = "Hey Jude "; 
        String Dont = "dont ";
        String Make_Bad = "make it bad ";
        String Be_Afraid = "be afraid ";
        String Let_Down = "let me down ";
        String Take_SadSong = "Take a sad song and make it better   ";
        String Were_Made = "You were made to go out and get her ";
        String Have_Found = "You have found her, now go and get her ";
        String Remember_To = "Remember to ";
        String Let_Heart = "let her into you heart ";
        String Let_Skin = "let her under your skin ";
        String Then_You = "Then you ";
        String Can_Start = "can start ";
        String Begin = "begin ";
        String Make_better = "to make it better ";
        String Better = "better ";
        String na = "na ";
        String wa = "waaaaaaaaa";
        
        int p = 0;
        
        while(p < 7){
            
            
            if(p==0 || p==1|| p==3|| p==5){  //LINEAS 1 y 2 DE CADA PARRAFO 0,1,3 y 5
                System.out.print(HeyJude + Dont ); //Hey Jude dont 
               
                if(p==0||p==5){
                    System.out.println(Make_Bad); //... make it bad
                    System.out.println(Take_SadSong); //take a sad song and make it better
                    

                }else if(p == 1){ 
                    System.out.println(Be_Afraid); //... be afraid
                    System.out.println(Were_Made); //You were made to go out and get her.
                    
                }else{ //p==3 Párrafo 3.
                    System.out.println(Let_Down); //... let me down
                    System.out.println(Have_Found); // You have found her now go and get her.
                     } 
                
                //DE TODOS LOS PARRAFOS 0,1,3Y 5 LINEA 3: Remember to
                System.out.print(Remember_To); 
                if(p==0 || p==3){
                    System.out.println(Let_Heart); //... let her into your heart
                }else{ //p==1||p==5
                    System.out.println(Let_Skin);} //...let her under your skin 
                
                
                //DE TODOS LOS PARRAFOS 0,1,3Y 5 LINEA 4: Then you
                System.out.print(Then_You);
                if(p==0 || p==3){
                    System.out.print(Can_Start); //... can start
                }else{ //p==1||p==5
                    System.out.print(Begin);//...begin
                }
                System.out.println(Make_better);//... to make it better. Final  de la línea 4 para todos los párrafos.
                
                //ESpacios de linea excepto el 5 porque tiene una línea más.
                if(p==0||p==1||p==3){
                    System.out.print("\n");
                }
                
                //BETTER BETTER BETTER BETTER WAAAAAA
                if(p==5){
                    int b = 0;
                    while(b<6){
                        System.out.print(Better); //better better better better...
                    b++; //AGregar betters hasta 6
                    }
                    System.out.println(wa + "\n"); //waaaaa
                }
                
                
            }else{ //p==2||p==4||p==6
                int n = 0;
                while(n<10){
                    System.out.print(na);
                n++; //Agregar na hasta 10    
                }
                System.out.println("\n");  
            }
           
            
            p++; //AGREGAR MÁS PARRAFOS HASTA 7
        }  
            
           
        }
        
    }
