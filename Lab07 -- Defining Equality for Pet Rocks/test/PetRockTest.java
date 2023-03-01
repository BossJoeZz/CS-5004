import org.junit.Test;

/*
*
* */
public class PetRockTest {

    @Test
    public void petRockTest() {

        PetRock petRock1 = new PetRock("zxd", false);
        PetRock petRock2 = new PetRock("zxd", true);
        PetRock petRock4 = new PetRock("xzx", true);
        PetRock petRock5 = new PetRock("zxd", true);
        PetRock petRock3 = petRock1;

        // petRock1.hashCode() 1942406066
        // petRock2.hashCode() 1213415012
        // petRock3.hashCode() 1942406066
        // petRock4.hashCode() 1688376486
        // petRock5.hashCode() 2114664380
        System.out.println(petRock1.hashCode());
        System.out.println(petRock2.hashCode());
        System.out.println(petRock3.hashCode());
        System.out.println(petRock4.hashCode());
        System.out.println(petRock5.hashCode());

        // when equals is false
        // petRock1.happy is not same with petRock2.happy
        System.out.println(petRock1.equals(petRock2));
        System.out.println(petRock1 == petRock2);

        // petRock1.happy is same with petRock3
        System.out.println(petRock1.equals(petRock3));
        System.out.println(petRock1 == petRock3);

        // Thorugh petRock2 and petRock4 has the same field's value
        // they are different object
        // so petRock2.equals(petRock4) return false
        System.out.println(petRock2.equals(petRock4));
        System.out.println(petRock2 == petRock4);

    }

}
