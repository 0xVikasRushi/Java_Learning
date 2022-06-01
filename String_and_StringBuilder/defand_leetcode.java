package String_and_StringBuilder;

class defang_ip {
    public String defangIPaddr(String address) {
    StringBuilder in = new StringBuilder("");
        for(int i =0;i<address.length();++i){
            if(address.charAt(i)=='.' ){
                in.append("[.]");
            }
            else{
                in.append(address.charAt(i));
            }
        }
            return in.toString();
    }
//public String defangIPaddr(String address) {
//    String a = (address.replace(".","[.]"));
//         return a;
//    }
}
