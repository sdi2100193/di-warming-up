// nestedExercise01.java
// playing with anonymous nested classes
//

package aloni.main;

// a simple class
class Xmas{  
  void speak(){ System.out.println("I like melomakarona"); }  
}  

class Main{
    
    public static void main(String args[]){  
        
// >>>>>>>>>>>>> 00 >>>>>>>>>>>>>        
        Xmas Obj00 = new Xmas(){  
            void speak(){System.out.println("Kourambiedes for ever!!");}  
        };  
        Obj00.speak();  
// <<<<<<<<<<<<< 00 <<<<<<<<<<<<<      


// >>>>>>>>>>>>> 01 >>>>>>>>>>>>>        
        Xmas Obj01 = new Xmas(){  
            void speak(){System.out.println("Will the real Kafritsas please stand up?");}  
        };  
        Obj01.speak();
// <<<<<<<<<<<<< 01 <<<<<<<<<<<<<       
      

// >>>>>>>>>>>>> 02 >>>>>>>>>>>>>        
        
// <<<<<<<<<<<<< 02 <<<<<<<<<<<<<
      

// >>>>>>>>>>>>> 03 >>>>>>>>>>>>>        
        
// <<<<<<<<<<<<< 03 <<<<<<<<<<<<<    
      

// >>>>>>>>>>>>> 04 >>>>>>>>>>>>>        
        
// <<<<<<<<<<<<< 04 <<<<<<<<<<<<<       
      

// >>>>>>>>>>>>> 05 >>>>>>>>>>>>>        
        
// <<<<<<<<<<<<< 05 <<<<<<<<<<<<<
      

// >>>>>>>>>>>>> 06 >>>>>>>>>>>>>        
        Xmas Alex = new Xmas(){  
            void speak(){System.out.println("Melomakarona for ever!!");}  
        };  
        Alex.speak();
// <<<<<<<<<<<<< 06 <<<<<<<<<<<<<  
      
      
// >>>>>>>>>>>>> 07 >>>>>>>>>>>>>        
        
// <<<<<<<<<<<<< 07 <<<<<<<<<<<<<       
      

// >>>>>>>>>>>>> 08 >>>>>>>>>>>>>        
        
        Xmas Objgp = new Xmas(){  
            void speak(){System.out.println("hot tea");}  
        };  
        Objgp.speak(); 
      
// <<<<<<<<<<<<< 08 <<<<<<<<<<<<<
      

// >>>>>>>>>>>>> 09 >>>>>>>>>>>>>        
        
// <<<<<<<<<<<<< 09 <<<<<<<<<<<<<    
      

// >>>>>>>>>>>>> 10 >>>>>>>>>>>>>        
        
// <<<<<<<<<<<<< 10 <<<<<<<<<<<<<       
      

// >>>>>>>>>>>>> 11 >>>>>>>>>>>>>        
        
// <<<<<<<<<<<<< 11 <<<<<<<<<<<<<
      

// >>>>>>>>>>>>> 12 >>>>>>>>>>>>>        
        
// <<<<<<<<<<<<< 12 <<<<<<<<<<<<<        
      
      
    } // end of main()
    
} // end of class Main
