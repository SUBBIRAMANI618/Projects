class Student {
    public static void main(String[] args) {
        Studentdetails st=new Studentdetails();
        st.printStudentdetails();
    }
}
class Studentdetails{
    String name="Akash";
    int age=17;
    char grade='A';
    String name2="Bala";
    int age2=18;
    char grade2='B';
    String name3="Cheran";
    int age3=17;
    char grade3='D';
    void printStudentdetails(){
        System.out.println("Name:"+name+"  "+"Age:"+age+"  "+"Grade:"+grade);
        System.out.println("Name:"+name2+"  "+"Age:"+age2+"  "+"Grade:"+grade2);
        System.out.println("Name:"+name3+"  "+"Age:"+age3+"  "+"Grade:"+grade3);
    }
}
