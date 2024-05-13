package Object;


class Methods {
     
     public static void main(String[] args) {
     String s = "RajaRamMohanRoy";
     System.out.println(s.length());
     System.out.println(s.charAt(4));
     System.out.println(s.indexOf('R'));
     System.out.println(s.lastIndexOf('R'));
     System.out.println(s.toUpperCase());
     System.out.println(s.toLowerCase());
     System.out.println(s.substring(7));
     System.out.println(s.substring(7, 12));
     System.out.println(s.contains("Ram"));
     System.out.println(s.startsWith("Raja"));
     System.out.println(s.endsWith("Ram"));
     System.out.println(s.isEmpty());
     System.out.println(s.concat(" Father of Bangal"));
     // System.out.println(s.toCharArray());
}

     
}
