package core;

import javax.swing.*;

public class Helper {
    public static void setTheme() {
        for(UIManager.LookAndFeelInfo info: UIManager.getInstalledLookAndFeels()) {
            if("Nimbus".equals(info.getName())) {
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        }
    }

    public  static void showMessage(String str){
        String mesaj,title;
        switch (str)
        {
            case "fill":
                mesaj="Tüm alanları doldurunuz!";
                title="Hata!";
                break;
            case "done":
                mesaj="İşlem başarılı";
                title="Sonuç";
                break;
            default:
                mesaj=str;
                title="Mesaj";
                break;
        }
        JOptionPane.showMessageDialog(null,mesaj,title,JOptionPane.INFORMATION_MESSAGE);
    }
    public  static  boolean isFieldEmpty(JTextField field){
        return field.getText().trim().isEmpty();
    }
    public  static  boolean isFieldListEmpty(JTextField[] fields){
        for (JTextField field:fields){
            if(isFieldEmpty(field)) return true;
        }
        return false;
    }

}
