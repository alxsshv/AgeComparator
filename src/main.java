public class main {
    public static void main(String[] args) {
        int vasyaAge = 29;
        int katyaAge = 29;
        int mishaAge = 36;

        int min = -1;
        int middle = -1;
        int max = -1;

        if (mishaAge > katyaAge && mishaAge > vasyaAge || mishaAge == katyaAge && mishaAge > vasyaAge) {
            max = mishaAge;
        } else if (katyaAge > mishaAge && katyaAge > vasyaAge || katyaAge == vasyaAge && katyaAge > mishaAge) {
            max = katyaAge;
        } else {
            max = vasyaAge;
        }

        if (katyaAge < mishaAge && katyaAge < vasyaAge || katyaAge == mishaAge && katyaAge < vasyaAge){
            min = katyaAge;
        } else if (vasyaAge < katyaAge && vasyaAge < mishaAge || vasyaAge == mishaAge && vasyaAge < katyaAge){
            min = vasyaAge;
        } else {
            min = mishaAge;
        }

        if (min == katyaAge && max == mishaAge || min == mishaAge && max == katyaAge){
            middle = vasyaAge;
        } else if (min == vasyaAge && max == mishaAge || min == mishaAge && max == vasyaAge){
            middle = katyaAge;
        } else {
            middle = mishaAge;
        }

        System.out.println("Minimal age: "+ min);
        System.out.println("Middle age: " + middle);
        System.out.println("Max age: " + max);
    }
}
