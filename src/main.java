public class main {
    public static void main(String[] args) {
        int vasyaAge = 3;
        int katyaAge = 17;
        int mishaAge = 17;

        int min = -1;
        int middle = -1;
        int max = -1;

        if (mishaAge==vasyaAge && mishaAge == katyaAge) {
            min = mishaAge;
            middle = vasyaAge;
            max = katyaAge;
        }
        if (mishaAge < katyaAge || mishaAge < vasyaAge) {
            if (katyaAge < vasyaAge) {
                max = vasyaAge;
                if (mishaAge < katyaAge || mishaAge == katyaAge) {
                 min = mishaAge;
                 middle = katyaAge;
                } else {
                 min = katyaAge;
                 middle = mishaAge;
                }
            } else {
                max = katyaAge;
                if (mishaAge < vasyaAge || mishaAge == vasyaAge){
                    min = mishaAge;
                    middle = vasyaAge;
                } else {
                    min = vasyaAge;
                    middle = mishaAge;
                }
            }
        }
        if (katyaAge < mishaAge || katyaAge < vasyaAge) {
            if (vasyaAge < mishaAge) {
                max = mishaAge;
                if (katyaAge < vasyaAge || katyaAge == vasyaAge){
                    min = katyaAge;
                    middle = vasyaAge;
                } else {
                    min = vasyaAge;
                    middle = katyaAge;
                }
            } else {
                max = vasyaAge;
                if (katyaAge < mishaAge || katyaAge == mishaAge) {
                    middle = mishaAge;
                    min = katyaAge;
                } else {
                    middle = katyaAge;
                    min = mishaAge;
                }
            }
        } else {
            max = katyaAge;
            if (mishaAge < vasyaAge || mishaAge == vasyaAge) {
                min = mishaAge;
                middle = vasyaAge;
            } else {
                min = vasyaAge;
                middle = mishaAge;
            }
        }

        System.out.println("Minimal age: "+ min);
        System.out.println("Middle age: " + middle);
        System.out.println("Max age: " + max);
    }
}
