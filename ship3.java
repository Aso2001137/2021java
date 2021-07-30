public class ship3 {
    public int Ship3Hp;

    public ship3(int hp){
        this.Ship3Hp=hp;
    }
    public void disp(){
        System.out.printf("船3:残り耐久%d\n",Ship3Hp);
    }   
    public coo(){
        Random rnd = new Random();
        int x = rnd.nextInt(5);
        int y = rnd.nextInt(5);
    }
}
