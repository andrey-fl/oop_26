public class Segment {
    public Point p, q;
    public float length(){
        return (float) Math.hypot( p.x-q.x, p.y-q.y);

}
    public static Segment findMax(Segment[] segments){
        Segment maxS= segments[0];
        for (Segment s: segments ){
            if (s.length()>maxS.length()) maxS=s;
        }
        return maxS;
    }}
