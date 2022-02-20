package javalibs5026211020;
import javax.swing.*;
    
    public class JavaLibs5026211020 {
        public static void main(String[] args) {
        //Perkenalan
        String name = JOptionPane.showInputDialog("Haloo! Kenalin namaku Bachtiar, Nama kamu siapa?");
        JOptionPane.showMessageDialog(null,"Haloo! "+name+", Salken ya!");
        
        //Gender
        String[] acceptablevalues = {"cowo" , "cewe"};
        String gender = (String)JOptionPane.showInputDialog(null, "Kamu", "jenis kelamin",2,null,acceptablevalues,acceptablevalues[1]);
        JOptionPane.showMessageDialog(null, "Ohh, kamu ternyata "+gender+".");
        
        //Umur
        String age = JOptionPane.showInputDialog("Btw, kamu umur berapa sekarang?");
        int ageConvert = Integer.parseInt(age);
        if (ageConvert > 40) {
            JOptionPane.showMessageDialog(null, "Ohh, ternyata kamu udah berumur yaa!");
        } else if ( ageConvert == 19 ) {
            JOptionPane.showMessageDialog(null, "Ehh "+name+" btw kita seumuran lho.");
        } else {
            JOptionPane.showMessageDialog(null, "Ohh, kamu umur "+age+".");
        }
        
        //Kegiatan
        String Activity = JOptionPane.showInputDialog("Terus Btw, kesibukanmu sekarang ngapain? |1 = Kuliah 2 = Kerja|");
        int ActivityConvert=Integer.parseInt(Activity);
        if (ActivityConvert == 1) {
            JOptionPane.showMessageDialog(null, "Wihh sama dong, aku juga lagi kuliah nih");
        } else if (ActivityConvert == 2) {
            JOptionPane.showMessageDialog(null, "Ohh jadi kamu udah kerja.");
        }
        
        //Tinggi Badan
        String height = JOptionPane.showInputDialog("Tinggi badanmu berapa sih kalau boleh tau?");
        int heightconvert = Integer.parseInt(height);
        if (heightconvert > 200) {
            JOptionPane.showMessageDialog(null, "Woww gilaa, tinggi banget deh kamu "+name+".");
        } else if (heightconvert == 170) {
            JOptionPane.showMessageDialog(null, "Ehh "+name+" tinggi kita sama lho btw.");
        } else if (heightconvert < 100) {
            JOptionPane.showMessageDialog(null, "Hahhh? masa sih? pasti boong ya kamu! mana mungkin segitu.");
        } else if (heightconvert > 170) {
            JOptionPane.showMessageDialog(null, "Wahhh ternyata kamu lebih tinggi dari aku lho btw.");   
        } else {
            JOptionPane.showMessageDialog(null, "Wihh "+name+" lumayan juga lho tinggimu.");       
        }
        
        //
        JOptionPane.showMessageDialog(null, "Boleh dong sekarang cobain kalkulatorku, cobain yak hehe");
        
        //Kalkulator
        String number1 = JOptionPane.showInputDialog("Coba masukin satu angka ya, tapi jangan desimal lhoo");
        int number11 = Integer.parseInt(number1);
        String number2 = JOptionPane.showInputDialog("Masukin satu angka lagi ya");
        int number22 = Integer.parseInt(number2);
        JOptionPane.showMessageDialog(null, "Udah bener kan angkamu "+number11+" dan "+number22);
        String operator = JOptionPane.showInputDialog("Mau (1)Ditambah atau (2)Dikurang nih kamu?");
        int operatorx = Integer.parseInt(operator);
        int result;
        if (operatorx == 1) {
            result = number11 + number22;
            JOptionPane.showMessageDialog(null, "Hasil penjumlahannya adalah " +result);
        } else if(operatorx == 2) {
            result = number11 - number22;
            JOptionPane.showMessageDialog(null, "Hasil pengurangannya adalah " +result);   
        } else {
            JOptionPane.showMessageDialog(null, "Kamu tadi harusnya masukin 1 atau 2 biar bisa, tapi yaudah deh gapapa lanjut aja");    
        }
        
        //
        JOptionPane.showMessageDialog(null, "Boleh dong sekarang cobain kalkulatorku sekali lagi, cobain yak hehe");
        
        //Kalkulator Desimal
        String number3 = JOptionPane.showInputDialog("Coba masukin satu angka ya, sekarang ganti yang desimal");
        double number33 = Double.parseDouble(number3);
        String number4 = JOptionPane.showInputDialog("Coba masukin satu angka lagi ya, tetep yang desimal ya");
        double number44 = Double.parseDouble(number4);
        JOptionPane.showMessageDialog(null, "Udah bener kan angkamu "+number33+" dan "+number44);
        String operatorz = JOptionPane.showInputDialog("Mau (1)Dikali atau (2)Dibagi nihh kamu?");
        double operatory = Double.parseDouble(operatorz);
        double result2;
        if (operatory == 1){
            result2 = number33 * number44;
            JOptionPane.showMessageDialog(null, "Hasil perkaliannya adalah " +result2);
        } else if (operatory == 2){
            result2 = number33 / number44;
            JOptionPane.showMessageDialog(null, "Hasil pembagiannya adalah " +result2);    
        } else {
            JOptionPane.showMessageDialog(null, "Kamu tadi harusnya masukin 1 atau 2 biar bisa, tapi yaudah deh gapapa");        
        }
        
        //End
        JOptionPane.showMessageDialog(null, "Thanks yaa "+name+" udah mau kenalan sama aku! Senang bisa kenal sama kamu, Bye-bye");
        
    }
}
