public class Substring{

    public static void main(String[] args){
        String s1 = "Monterrey, Nuevo León";
        String ciudad = s1.substring(0,9);
        String estado = s1.substring(11,21);
        
        System.out.println(ciudad); //Prints "Monterrey"
        System.out.println(estado); //Prints "Nuevo León"
        
        String s2 = "smiles".substring(1, 5);
        System.out.println(s2); //prints "mile"     

        s1 = "     :)   ";
        s2 = s1.trim();
        System.out.println(s2);
    }
}