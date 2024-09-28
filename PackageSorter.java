class PackageSorter {
    
    
    
    public static String sort(int width, int height, int length, int mass) {
        
        int volume = width * height * length;

        boolean bulky = volume >= 1_000_000 || width >= 150 || height >= 150 || length >= 150;

        boolean heavy = mass >= 20;

        if (bulky && heavy) {
            return "REJECTED";
        } else if (bulky || heavy) {
            return "SPECIAL";
        } else {
            return "STANDARD";
        }
    }

    public static void main(String[] args) {

        System.out.println(sort(150, 100, 100, 25));
        System.out.println(sort(120, 140, 130, 18)); 
        System.out.println(sort(200, 100, 50, 10));
        System.out.println(sort(300, 200, 100, 30));
        System.out.println(sort(50, 50, 50, 19));   
        System.out.println(sort(60, 60, 60, 22)); 
        System.out.println(sort(100, 50, 200, 25));  
        System.out.println(sort(80, 70, 90, 15));    
        System.out.println(sort(160, 150, 170, 22)); 
        System.out.println(sort(150, 150, 150, 19)); 
        
    }
    
    
    
}