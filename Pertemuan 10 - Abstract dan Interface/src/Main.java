public class Main {
    public static void main(String[] args) {
//        Pembuatan Objek
        Potion potionAttack = new Potion("Santet", 1, 1000000,5,10, Potion.Tipe.ATTACK);
        Potion potionHeal = new Potion("Ruqyah", 99, 0,99,99, Potion.Tipe.HEAL);

        Sword pedang = new Sword("Excalibur",10000,10000, 135413);

        Shield tameng = new Shield("Doa Ibu", 99999, 0,9999999);

//        Menggunakan Method masing-masing objek
        System.out.println("Menggunakan potion "+ potionAttack.getNama()+ " bertipe Attack:");
        potionAttack.usePotion();
        System.out.println();
        System.out.println("Menggunakan potion "+ potionHeal.getNama()+ " bertipe Heal:");
        potionHeal.usePotion();
        System.out.println();

        System.out.println("Menyerang dengan pedang "+ pedang.getNama());
        pedang.attack();
        System.out.println();

        System.out.println("Bertahan dengan tameng "+ tameng.getNama());
        tameng.defense();
        System.out.println();
    }
}