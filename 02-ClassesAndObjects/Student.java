public class Student{
    
    //Atrybuty obiektu
    String imie;
    int wiek, sem_num;
    String ID_num;
    boolean ID_valid;
    float avg_grade;
    
    //Zachowania obiektu
    public void sayHello(){
        System.out.println("Hello");
    }
    public void displayName(){
        System.out.println(imie);
    }
    public void displayAge(){
        System.out.println(wiek);
    }
    
    public void changeStatusID(){
        ID_valid = !ID_valid;
    }
    public void displaySem(){
        System.out.println(sem_num);
    }
    public void displayAvgGrade(){
        System.out.println(avg_grade);
    }
    public void displayIDvalid(){
        String isValid = ID_valid ? "Valid" : "No valid";
        System.out.println(ID_valid);
        //Sprawdz konstrukcje z ?
    }
    
    public static void main(String[] args){
        Student student1 = new Student(); 
        //To nie jest nazwa klasy, to konstruktor, taki jak __init__ w Python
        student1.imie = "Magda";
        student1.wiek = 27;
        student1.ID_num = "223510";
        student1.sem_num = 8;
        student1.ID_valid = true;
        student1.avg_grade = 4.75f;
        //f po liczbie zmienia nam przypisanie - nie mozemy zmiennej typu float przypisac
        //do domyslnego typu zmiennej double (student1.avg_grade)
        student1.displayName();
        student1.displayIDvalid();
    }

}