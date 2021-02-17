package basic.accessmodifierdemo.sub;

import basic.accessmodifierdemo.Father;

class Bob extends Father {

    public static void main(String[] args) {
        Bob bob = new Bob();
        String treasure = bob.treasure;

        System.out.println("treasure:" + treasure);
    }


}
