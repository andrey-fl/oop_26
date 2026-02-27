public class Main {
    public static void main (String[] args) {
        System.out.println("Hello world");
        Point p = new Point();
        p.x= 5F;
        p.y=7.5F;
        System.out.println(p.toString());
System.out.println(p.toSvg());
        p.translate( -20, 5);
        System.out.println(p);
        Point p2=p.translated(-30F, -0.5F);


        Segment s =new Segment();
        s.p=p;
        s.q=p2;
        System.out.println(s.length());
        Point p3=new Point();
        p3.x=12;
        p3.y =7;
        Point p4= new Point ();
        p4.x=8;
        p4.y=19;
        Point p5=new Point();
        p3.x=14;
        p3.y =3;
        Point p6= new Point ();
        p4.x=1;
        p4.y=10;
        Segment s2=new Segment ();
        s2.q=p3;
        s2.p=p4;
        Segment s3=new Segment ();
        s3.q=p5;
        s3.p=p6;
        Segment [] segments= new Segment [3];
        segments[0]=s;
        segments [1]=s2;
        segments [2]=s3;
        System.out.println(Segment.findMax(segments).p);
    }



}