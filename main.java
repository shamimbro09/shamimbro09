class Shamim{
    public static void main(String[] args) {
        double root1;
        double root2;
        double a=10.5,b=5,c=20;
        double d=b*b-4*a*c;
        if(d==0){
            root1=root2=-b/2*a;
            System.out.println(root1+" "+root2);
        } else if (d>0) {
            root1=-b+Math.sqrt(d)/2*a;
            root2=-b-Math.sqrt(d)/2*a;
            System.out.println(root1+" "+root2);

        }
        else{
            System.out.println(" Root are imaginary");
        }
    }
}