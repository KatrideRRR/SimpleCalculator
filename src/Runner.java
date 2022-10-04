public class Runner {

    public String convertTemp(int temperature,char convertTo) {
        int tempResult = 0;
        char converted = ' ';
        char[] convert = {'C' , 'F'};
        if (convertTo =='C'){
            tempResult = (temperature * 9/5) + 32;
            converted = convert[1];

        }else if(convertTo == 'F') {
            tempResult= (temperature - 32) * 5 / 9;
            converted = convert[0];
        } else{
            throw new IllegalArgumentException("что то не так");
        }

        return "Температура " + tempResult  + converted;
    }

    public static void main(String[] args) {
        Runner temp = new Runner();
        System.out.println(temp.convertTemp(15,'C'));
        System.out.println(temp.convertTemp(96,'F'));
        System.out.println(temp.convertTemp(115,'F'));
        System.out.println(temp.convertTemp(45,'C'));
        System.out.println(temp.convertTemp(5000, 'G'));
        }

    }

