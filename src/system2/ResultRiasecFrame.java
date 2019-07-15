
package system2;

import java.awt.Cursor;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ResultRiasecFrame extends javax.swing.JFrame {
    private int r;
    private int i;
    private int a;
    private int s;
    private int e;
    private int c;
    private int arr[];
    private String riasec;
    private int first,second,third;
    public ResultRiasecFrame() {
        initComponents();
      
    }
      public ResultRiasecFrame(int _sum_r,int _sum_i,int _sum_a,int _sum_s,int _sum_e,int _sum_c,String _name) { 
        initComponents();
        lbl_name.setText(_name);
        SetText(_sum_r,_sum_i,_sum_a,_sum_s,_sum_e,_sum_c);
        Cursor();
        r = _sum_r;
        i = _sum_i;
        a = _sum_a;
        s = _sum_s;
        e = _sum_e;
        c = _sum_c;
        Show();    
            
      }
      public void SetText(int r, int i, int a, int s, int e, int c){
        lbl_realistic_total.setText(""+r);
        lbl_investigative_total.setText(""+i);
        lbl_artistic_total.setText(""+a);
        lbl_social_total.setText(""+s);
        lbl_enterprising_total.setText(""+e);
        lbl_conventional_total.setText(""+c);
      }
      
      public void Cursor(){
           Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
           lbl_first_interest.setCursor(cursor);
           lbl_second_interest.setCursor(cursor);
           lbl_third_interest.setCursor(cursor);
      }
       public void Show(){
           arr = new int[]{r,i,a,s,e,c};
                third = first = second = Integer.MIN_VALUE; 
		for (int i = 0; i < arr.length; i++) {
                         if (arr[i] > first){
                              third = second; 
                              second = first; 
                              first = arr[i]; 
                         }else if (arr[i] > second){
                              third = second; 
                              second = arr[i]; 
            
                         } else if (arr[i] > third){
                              third = arr[i]; 
                         } 
	       }    
                FirstInterest();
                SecondInterest();
                ThirdInterest();   
                INSERT();
    }
       public void INSERT(){
           Database db = new Database();
           try{
            Calendar c = Calendar.getInstance();
            SimpleDateFormat df = new SimpleDateFormat("yyyy:MM:dd");
            Date dat = c.getTime();
  
            Connection con = db.getConnection();
            Statement stmt;
            stmt =con.createStatement();
            String sql = "INSERT INTO tblstudentresult(FullName,FirstInterest,SecondInterest,ThirdInterest,Date) VALUES('"+lbl_name.getText()+"','"+lbl_first_interest.getText()+"','"+lbl_second_interest.getText()+"','"+lbl_third_interest.getText()+"','"+df.format(dat)+"')";
           stmt.executeUpdate(sql);
           }catch(Exception e){
               
           }
       }
  
public void FirstInterest(){
        if(first ==0){
            lbl_first_interest.setText(".......");
            
        }
        else if(lbl_realistic_total.getText().equals(String.valueOf(first))){
                    lbl_first_interest.setText("R");
                    riasec = "R";
       }else if(lbl_investigative_total.getText().equals(String.valueOf(first))){
                    lbl_first_interest.setText("I");
                    riasec = "I";
       }else if(lbl_artistic_total.getText().equals(String.valueOf(first))){
                    lbl_first_interest.setText("A");
                    riasec = "A";
       }else if(lbl_social_total.getText().equals(String.valueOf(first))){
                    lbl_first_interest.setText("S");
                    riasec = "S";
       }else if(lbl_enterprising_total.getText().equals(String.valueOf(first))){
                    lbl_first_interest.setText("E");
                    riasec = "E";
       }else if(lbl_conventional_total.getText().equals(String.valueOf(first))){
                    lbl_first_interest.setText("C");
                    riasec = "C";
       }
    }
public void SecondInterest(){
            if(second ==0){
                   lbl_second_interest.setText(".......");
            }
            else if("R".equals(lbl_first_interest.getText())){
                if(lbl_investigative_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("I");
                    riasec = "I";
                }else if(lbl_artistic_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("A");
                    riasec = "A";
                }else if(lbl_social_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("S");
                    riasec = "S";
                }else if(lbl_enterprising_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("E");
                    riasec = "E";
                }else if(lbl_conventional_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("C");
                    riasec = "C";
                }
            }
           else if("I".equals(lbl_first_interest.getText())){
                if(lbl_realistic_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("R");
                    riasec = "R";
                }else if(lbl_artistic_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("A");
                    riasec = "A";
                }else if(lbl_social_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("S");
                    riasec = "S";
                }else if(lbl_enterprising_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("E");
                    riasec = "E";
                }else if(lbl_conventional_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("C");
                    riasec = "C";
                }
            }
            else if("A".equals(lbl_first_interest.getText())){
                if(lbl_realistic_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("R");
                    riasec = "R";
                }else if(lbl_investigative_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("I");
                    riasec = "I";
                }else if(lbl_social_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("S");
                    riasec = "S";
                }else if(lbl_enterprising_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("E");
                    riasec = "E";
                }else if(lbl_conventional_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("C");
                    riasec = "C";
                }
            }
             else if("S".equals(lbl_first_interest.getText())){
                if(lbl_realistic_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("R");
                    riasec = "R";
                }else if(lbl_investigative_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("I");
                    riasec = "I";
                }else if(lbl_artistic_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("A");
                    riasec = "A";
                }else if(lbl_enterprising_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("E");
                    riasec = "E";
                }else if(lbl_conventional_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("C");
                    riasec = "C";
                }
            }
               else if("E".equals(lbl_first_interest.getText())){
                if(lbl_realistic_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("R");
                    riasec = "R";
                }else if(lbl_investigative_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("I");
                    riasec = "I";
                }else if(lbl_artistic_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("A");
                    riasec = "A";
                }else if(lbl_social_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("S");
                    riasec = "S";
                }else if(lbl_conventional_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("C");
                    riasec = "C";
                }
            }
            else if("C".equals(lbl_first_interest.getText())){
                if(lbl_realistic_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("R");
                    riasec = "R";
                }else if(lbl_investigative_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("I");
                    riasec = "I";
                }else if(lbl_artistic_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("A");
                    riasec = "A";
                }else if(lbl_social_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("S");
                    riasec = "S";
                }else if(lbl_enterprising_total.getText().equals(String.valueOf(second))){
                    lbl_second_interest.setText("E");
                    riasec = "E";
                }
            }

    } 
public void ThirdInterest(){
            if(third ==0){
                   lbl_third_interest.setText(".......");
            }
            else if("R".equals(lbl_first_interest.getText()) || "R".equals(lbl_second_interest.getText())){
                   
               if("R".equals(lbl_first_interest.getText()) && "I".equals(lbl_second_interest.getText()) ||  "I".equals(lbl_first_interest.getText()) && "R".equals(lbl_second_interest.getText())){      
                    if(lbl_artistic_total.getText().equals(String.valueOf(third))){
                         lbl_third_interest.setText("A");
                         riasec = "A";
                    }else if(lbl_social_total.getText().equals(String.valueOf(third))){
                         lbl_third_interest.setText("S");
                         riasec = "S";
                     }else if(lbl_enterprising_total.getText().equals(String.valueOf(third))){
                         lbl_third_interest.setText("E");
                         riasec = "E";
                        }else if(lbl_conventional_total.getText().equals(String.valueOf(third))){
                         lbl_third_interest.setText("C");
                         riasec = "C";
                } 
                    
                }else if("R".equals(lbl_first_interest.getText()) && "A".equals(lbl_second_interest.getText()) ||  "A".equals(lbl_first_interest.getText()) && "R".equals(lbl_second_interest.getText())){  
                    if(lbl_investigative_total.getText().equals(String.valueOf(third))){
                          lbl_third_interest.setText("I");
                          riasec = "I";
                }else if(lbl_social_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("S");
                           riasec = "S";
                }else if(lbl_enterprising_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("E");
                           riasec = "E";
                }else if(lbl_conventional_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("C");
                           riasec = "C";
                }
                 
                }else if("R".equals(lbl_first_interest.getText()) && "S".equals(lbl_second_interest.getText()) ||  "S".equals(lbl_first_interest.getText()) && "R".equals(lbl_second_interest.getText())){  
                    if(lbl_artistic_total.getText().equals(String.valueOf(third))){
                          lbl_third_interest.setText("A");
                          riasec = "A";
                }else if(lbl_investigative_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("I");
                           riasec = "I";
                }else if(lbl_enterprising_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("E");
                           riasec = "E";
                }else if(lbl_conventional_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("C");
                           riasec = "C";
                }
                    
                }
                else if("R".equals(lbl_first_interest.getText()) && "E".equals(lbl_second_interest.getText()) ||  "E".equals(lbl_first_interest.getText()) && "R".equals(lbl_second_interest.getText())){  
                    if(lbl_investigative_total.getText().equals(String.valueOf(third))){
                          lbl_third_interest.setText("I");
                          riasec = "I";
                }else if(lbl_artistic_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("A");
                           riasec = "A";
                }else if(lbl_social_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("S");
                           riasec = "S";
                }else if(lbl_conventional_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("C");
                           riasec = "C";
                }
                    
                }
                else if("R".equals(lbl_first_interest.getText()) && "C".equals(lbl_second_interest.getText()) ||  "C".equals(lbl_first_interest.getText()) && "R".equals(lbl_second_interest.getText())){  
                    if(lbl_investigative_total.getText().equals(String.valueOf(third))){
                          lbl_third_interest.setText("I");
                          riasec = "I";
                }else if(lbl_artistic_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("A");
                           riasec = "A";
                }else if(lbl_social_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("S");
                           riasec = "S";
                }else if(lbl_enterprising_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("E");
                           riasec = "E";
                }
                    
                }
        }
        else if("I".equals(lbl_first_interest.getText()) || "I".equals(lbl_second_interest.getText())){
                   
               if("I".equals(lbl_first_interest.getText()) && "R".equals(lbl_second_interest.getText()) ||  "R".equals(lbl_first_interest.getText()) && "I".equals(lbl_second_interest.getText())){      
                    if(lbl_artistic_total.getText().equals(String.valueOf(third))){
                         lbl_third_interest.setText("A");
                         riasec = "A";
                    }else if(lbl_social_total.getText().equals(String.valueOf(third))){
                         lbl_third_interest.setText("S");
                         riasec = "S";
                     }else if(lbl_enterprising_total.getText().equals(String.valueOf(third))){
                         lbl_third_interest.setText("E");
                         riasec = "E";
                        }else if(lbl_conventional_total.getText().equals(String.valueOf(third))){
                         lbl_third_interest.setText("C");
                         riasec = "C";
                } 
                    
                }else if("I".equals(lbl_first_interest.getText()) && "A".equals(lbl_second_interest.getText()) ||  "A".equals(lbl_first_interest.getText()) && "I".equals(lbl_second_interest.getText())){  
                    if(lbl_realistic_total.getText().equals(String.valueOf(third))){
                          lbl_third_interest.setText("R");
                          riasec = "R";
                }else if(lbl_social_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("S");
                           riasec = "S";
                }else if(lbl_enterprising_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("E");
                           riasec = "E";
                }else if(lbl_conventional_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("C");
                           riasec = "C";
                }
                 
                }else if("I".equals(lbl_first_interest.getText()) && "S".equals(lbl_second_interest.getText()) ||  "S".equals(lbl_first_interest.getText()) && "I".equals(lbl_second_interest.getText())){  
                    if(lbl_realistic_total.getText().equals(String.valueOf(third))){
                          lbl_third_interest.setText("R");
                          riasec = "R";
                }else if(lbl_artistic_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("A");
                           riasec = "A";
                }else if(lbl_enterprising_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("E");
                           riasec = "E";
                }else if(lbl_conventional_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("C");
                           riasec = "C";
                }
                    
                }
                else if("I".equals(lbl_first_interest.getText()) && "E".equals(lbl_second_interest.getText()) ||  "E".equals(lbl_first_interest.getText()) && "I".equals(lbl_second_interest.getText())){  
                    if(lbl_realistic_total.getText().equals(String.valueOf(third))){
                          lbl_third_interest.setText("R");
                          riasec = "I";
                }else if(lbl_artistic_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("A");
                           riasec = "A";
                }else if(lbl_social_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("S");
                           riasec = "S";
                }else if(lbl_conventional_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("C");
                           riasec = "C";
                }
                    
                }
                else if("I".equals(lbl_first_interest.getText()) && "C".equals(lbl_second_interest.getText()) ||  "C".equals(lbl_first_interest.getText()) && "I".equals(lbl_second_interest.getText())){  
                    if(lbl_realistic_total.getText().equals(String.valueOf(third))){
                          lbl_third_interest.setText("R");
                          riasec = "R";
                }else if(lbl_artistic_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("A");
                           riasec = "A";
                }else if(lbl_social_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("S");
                           riasec = "S";
                }else if(lbl_enterprising_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("E");
                           riasec = "E";
                }
                    
                }
        }
        else if("A".equals(lbl_first_interest.getText()) || "A".equals(lbl_second_interest.getText())){
                   
               if("A".equals(lbl_first_interest.getText()) && "R".equals(lbl_second_interest.getText()) ||  "R".equals(lbl_first_interest.getText()) && "A".equals(lbl_second_interest.getText())){      
                    if(lbl_investigative_total.getText().equals(String.valueOf(third))){
                         lbl_third_interest.setText("I");
                         riasec = "I";
                    }else if(lbl_social_total.getText().equals(String.valueOf(third))){
                         lbl_third_interest.setText("S");
                         riasec = "S";
                     }else if(lbl_enterprising_total.getText().equals(String.valueOf(third))){
                         lbl_third_interest.setText("E");
                         riasec = "E";
                        }else if(lbl_conventional_total.getText().equals(String.valueOf(third))){
                         lbl_third_interest.setText("C");
                         riasec = "C";
                } 
                    
                }else if("A".equals(lbl_first_interest.getText()) && "I".equals(lbl_second_interest.getText()) ||  "I".equals(lbl_first_interest.getText()) && "A".equals(lbl_second_interest.getText())){  
                    if(lbl_realistic_total.getText().equals(String.valueOf(third))){
                          lbl_third_interest.setText("R");
                          riasec = "R";
                }else if(lbl_social_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("S");
                           riasec = "S";
                }else if(lbl_enterprising_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("E");
                           riasec = "E";
                }else if(lbl_conventional_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("C");
                           riasec = "C";
                }
                 
                }else if("A".equals(lbl_first_interest.getText()) && "S".equals(lbl_second_interest.getText()) ||  "S".equals(lbl_first_interest.getText()) && "A".equals(lbl_second_interest.getText())){  
                    if(lbl_realistic_total.getText().equals(String.valueOf(third))){
                          lbl_third_interest.setText("R");
                          riasec = "R";
                }else if(lbl_investigative_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("I");
                           riasec = "I";
                }else if(lbl_enterprising_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("E");
                           riasec = "E";
                }else if(lbl_conventional_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("C");
                           riasec = "C";
                }
                    
                }
                else if("A".equals(lbl_first_interest.getText()) && "E".equals(lbl_second_interest.getText()) ||  "E".equals(lbl_first_interest.getText()) && "A".equals(lbl_second_interest.getText())){  
                    if(lbl_realistic_total.getText().equals(String.valueOf(third))){
                          lbl_third_interest.setText("R");
                          riasec = "R";
                }else if(lbl_investigative_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("I");
                           riasec = "I";
                }else if(lbl_social_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("S");
                           riasec = "S";
                }else if(lbl_conventional_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("C");
                           riasec = "C";
                }
                    
                }
                else if("A".equals(lbl_first_interest.getText()) && "C".equals(lbl_second_interest.getText()) ||  "C".equals(lbl_first_interest.getText()) && "A".equals(lbl_second_interest.getText())){  
                    if(lbl_realistic_total.getText().equals(String.valueOf(third))){
                          lbl_third_interest.setText("R");
                          riasec = "R";
                }else if(lbl_investigative_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("I");
                           riasec = "I";
                }else if(lbl_social_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("S");
                           riasec = "S";
                }else if(lbl_enterprising_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("E");
                           riasec = "E";
                }
                    
                }
        }
        else if("S".equals(lbl_first_interest.getText()) || "S".equals(lbl_second_interest.getText())){
                   
               if("S".equals(lbl_first_interest.getText()) && "R".equals(lbl_second_interest.getText()) ||  "R".equals(lbl_first_interest.getText()) && "S".equals(lbl_second_interest.getText())){      
                    if(lbl_investigative_total.getText().equals(String.valueOf(third))){
                         lbl_third_interest.setText("I");
                         riasec = "I";
                    }else if(lbl_artistic_total.getText().equals(String.valueOf(third))){
                         lbl_third_interest.setText("A");
                         riasec = "A";
                     }else if(lbl_enterprising_total.getText().equals(String.valueOf(third))){
                         lbl_third_interest.setText("E");
                         riasec = "E";
                        }else if(lbl_conventional_total.getText().equals(String.valueOf(third))){
                         lbl_third_interest.setText("C");
                         riasec = "C";
                } 
                    
                }else if("S".equals(lbl_first_interest.getText()) && "I".equals(lbl_second_interest.getText()) ||  "I".equals(lbl_first_interest.getText()) && "S".equals(lbl_second_interest.getText())){  
                    if(lbl_realistic_total.getText().equals(String.valueOf(third))){
                          lbl_third_interest.setText("R");
                          riasec = "R";
                }else if(lbl_artistic_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("A");
                           riasec = "A";
                }else if(lbl_enterprising_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("E");
                           riasec = "E";
                }else if(lbl_conventional_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("C");
                           riasec = "C";
                }
                 
                }else if("S".equals(lbl_first_interest.getText()) && "A".equals(lbl_second_interest.getText()) ||  "A".equals(lbl_first_interest.getText()) && "S".equals(lbl_second_interest.getText())){  
                    if(lbl_realistic_total.getText().equals(String.valueOf(third))){
                          lbl_third_interest.setText("R");
                          riasec = "R";
                }else if(lbl_investigative_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("I");
                           riasec = "I";
                }else if(lbl_enterprising_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("E");
                           riasec = "E";
                }else if(lbl_conventional_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("C");
                           riasec = "C";
                }
                    
                }
                else if("S".equals(lbl_first_interest.getText()) && "E".equals(lbl_second_interest.getText()) ||  "E".equals(lbl_first_interest.getText()) && "S".equals(lbl_second_interest.getText())){  
                    if(lbl_realistic_total.getText().equals(String.valueOf(third))){
                          lbl_third_interest.setText("R");
                          riasec = "R";
                }else if(lbl_investigative_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("I");
                           riasec = "I";
                }else if(lbl_artistic_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("A");
                           riasec = "A";
                }else if(lbl_conventional_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("C");
                           riasec = "C";
                }
                    
                }
                else if("S".equals(lbl_first_interest.getText()) && "C".equals(lbl_second_interest.getText()) ||  "C".equals(lbl_first_interest.getText()) && "S".equals(lbl_second_interest.getText())){  
                    if(lbl_realistic_total.getText().equals(String.valueOf(third))){
                          lbl_third_interest.setText("R");
                          riasec = "R";
                }else if(lbl_investigative_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("I");
                           riasec = "I";
                }else if(lbl_artistic_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("A");
                           riasec = "A";
                }else if(lbl_enterprising_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("E");
                           riasec = "E";
                }
                    
                }
        }     
        else if("E".equals(lbl_first_interest.getText()) || "E".equals(lbl_second_interest.getText())){
                   
               if("E".equals(lbl_first_interest.getText()) && "R".equals(lbl_second_interest.getText()) ||  "R".equals(lbl_first_interest.getText()) && "E".equals(lbl_second_interest.getText())){      
                    if(lbl_investigative_total.getText().equals(String.valueOf(third))){
                         lbl_third_interest.setText("I");
                         riasec = "I";
                    }else if(lbl_artistic_total.getText().equals(String.valueOf(third))){
                         lbl_third_interest.setText("A");
                         riasec = "A";
                     }else if(lbl_social_total.getText().equals(String.valueOf(third))){
                         lbl_third_interest.setText("S");
                         riasec = "S";
                        }else if(lbl_conventional_total.getText().equals(String.valueOf(third))){
                         lbl_third_interest.setText("C");
                         riasec = "C";
                } 
                    
                }else if("E".equals(lbl_first_interest.getText()) && "I".equals(lbl_second_interest.getText()) ||  "I".equals(lbl_first_interest.getText()) && "E".equals(lbl_second_interest.getText())){  
                    if(lbl_realistic_total.getText().equals(String.valueOf(third))){
                          lbl_third_interest.setText("R");
                          riasec = "R";
                }else if(lbl_artistic_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("A");
                           riasec = "A";
                }else if(lbl_social_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("S");
                           riasec = "S";
                }else if(lbl_conventional_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("C");
                           riasec = "C";
                }
                 
                }else if("E".equals(lbl_first_interest.getText()) && "A".equals(lbl_second_interest.getText()) ||  "A".equals(lbl_first_interest.getText()) && "E".equals(lbl_second_interest.getText())){  
                    if(lbl_realistic_total.getText().equals(String.valueOf(third))){
                          lbl_third_interest.setText("R");
                          riasec = "R";
                }else if(lbl_investigative_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("I");
                           riasec = "I";
                }else if(lbl_social_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("S");
                           riasec = "S";
                }else if(lbl_conventional_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("C");
                           riasec = "C";
                }
                    
                }
                else if("E".equals(lbl_first_interest.getText()) && "S".equals(lbl_second_interest.getText()) ||  "S".equals(lbl_first_interest.getText()) && "E".equals(lbl_second_interest.getText())){  
                    if(lbl_realistic_total.getText().equals(String.valueOf(third))){
                          lbl_third_interest.setText("R");
                          riasec = "R";
                }else if(lbl_investigative_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("I");
                           riasec = "I";
                }else if(lbl_artistic_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("A");
                           riasec = "A";
                }else if(lbl_conventional_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("C");
                           riasec = "C";
                }
                    
                }
                else if("E".equals(lbl_first_interest.getText()) && "C".equals(lbl_second_interest.getText()) ||  "C".equals(lbl_first_interest.getText()) && "E".equals(lbl_second_interest.getText())){  
                    if(lbl_realistic_total.getText().equals(String.valueOf(third))){
                          lbl_third_interest.setText("R");
                          riasec = "R";
                }else if(lbl_investigative_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("I");
                           riasec = "I";
                }else if(lbl_artistic_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("A");
                           riasec = "A";
                }else if(lbl_social_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("S");
                           riasec = "S";
                }
                    
                }
        }     
         else if("C".equals(lbl_first_interest.getText()) || "C".equals(lbl_second_interest.getText())){
                   
               if("C".equals(lbl_first_interest.getText()) && "R".equals(lbl_second_interest.getText()) ||  "R".equals(lbl_first_interest.getText()) && "C".equals(lbl_second_interest.getText())){      
                    if(lbl_investigative_total.getText().equals(String.valueOf(third))){
                         lbl_third_interest.setText("I");
                         riasec = "I";
                    }else if(lbl_artistic_total.getText().equals(String.valueOf(third))){
                         lbl_third_interest.setText("A");
                         riasec = "A";
                     }else if(lbl_social_total.getText().equals(String.valueOf(third))){
                         lbl_third_interest.setText("S");
                         riasec = "S";
                        }else if(lbl_enterprising_total.getText().equals(String.valueOf(third))){
                         lbl_third_interest.setText("E");
                         riasec = "E";
                } 
                    
                }else if("C".equals(lbl_first_interest.getText()) && "I".equals(lbl_second_interest.getText()) ||  "I".equals(lbl_first_interest.getText()) && "C".equals(lbl_second_interest.getText())){  
                    if(lbl_realistic_total.getText().equals(String.valueOf(third))){
                          lbl_third_interest.setText("R");
                          riasec = "R";
                }else if(lbl_artistic_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("A");
                           riasec = "A";
                }else if(lbl_social_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("S");
                           riasec = "S";
                }else if(lbl_enterprising_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("E");
                           riasec = "E";
                }
                 
                }else if("C".equals(lbl_first_interest.getText()) && "A".equals(lbl_second_interest.getText()) ||  "A".equals(lbl_first_interest.getText()) && "C".equals(lbl_second_interest.getText())){  
                    if(lbl_realistic_total.getText().equals(String.valueOf(third))){
                          lbl_third_interest.setText("R");
                          riasec = "R";
                }else if(lbl_investigative_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("I");
                           riasec = "I";
                }else if(lbl_social_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("S");
                           riasec = "S";
                }else if(lbl_enterprising_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("E");
                           riasec = "E";
                }
                    
                }
                else if("C".equals(lbl_first_interest.getText()) && "S".equals(lbl_second_interest.getText()) ||  "S".equals(lbl_first_interest.getText()) && "C".equals(lbl_second_interest.getText())){  
                    if(lbl_realistic_total.getText().equals(String.valueOf(third))){
                          lbl_third_interest.setText("R");
                          riasec = "R";
                }else if(lbl_investigative_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("I");
                           riasec = "I";
                }else if(lbl_artistic_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("A");
                           riasec = "A";
                }else if(lbl_enterprising_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("E");
                           riasec = "E";
                }
                    
                }
                else if("C".equals(lbl_first_interest.getText()) && "E".equals(lbl_second_interest.getText()) ||  "E".equals(lbl_first_interest.getText()) && "C".equals(lbl_second_interest.getText())){  
                    if(lbl_realistic_total.getText().equals(String.valueOf(third))){
                          lbl_third_interest.setText("R");
                          riasec = "R";
                }else if(lbl_investigative_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("I");
                           riasec = "I";
                }else if(lbl_artistic_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("A");
                           riasec = "A";
                }else if(lbl_social_total.getText().equals(String.valueOf(third))){
                           lbl_third_interest.setText("S");
                           riasec = "S";
                }
                    
                }
        }    
            
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogRealistic = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jDialogInvestigative = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jDialogArtistic = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jDialogSocial = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jDialogEnterprising = new javax.swing.JDialog();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jDialogConventional = new javax.swing.JDialog();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea13 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_realistic_total = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        lbl_investigative_total = new javax.swing.JLabel();
        lbl_artistic_total = new javax.swing.JLabel();
        lbl_conventional_total = new javax.swing.JLabel();
        lbl_social_total = new javax.swing.JLabel();
        lbl_enterprising_total = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_first_interest = new javax.swing.JLabel();
        lbl_second_interest = new javax.swing.JLabel();
        lbl_third_interest = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();

        jDialogRealistic.setTitle("Realistic");
        jDialogRealistic.setLocation(new java.awt.Point(0, 0));
        jDialogRealistic.setSize(new java.awt.Dimension(1600, 860));

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("R = Realistic\n\nThese people are often good at mehanical or athletic jobs. Good college majors for Realistic people are...\n\nR: Realistic (Doers) \t\t\t\t\t\t\tTRACKS / STRAND\n\n•\tAerospace/Aeronautical Engineer (with Investigative)\t\t\t\tSTEM\n•\tAgriculture\t\t\t\t\t\t\tSTEM\n•\tAnthropology/Paleontology (with Investigative) \t\t\t\tSTEM\n•\tArchitect (with Artistic and Enterprising) \t\t\t\t\tSTEM\n•\tAstronomy (with Investigative) \t\t\t\t\tSTEM\n•\tCarpenter (with Conventional and Investigative) \t\t\t\tH.E.\n•\tChef (with Enterprising and Artistic) \t\t\t\t\tH.E.\n•\tChemistry/Chemist (with Investigative and Conventional) \t\t\t\tSTEM\n•\tComputer engineering/Computer science/Information technology/Computer programmer \t\tSTEM / ICT\n(with Investigative and Conventional)\t\t\t\t\n•\tDance (with Artistic) \t\t\t\t\t\tARTS & DESIGN\n•\tDentist (with Investigative and Social) \t\t\t\t\tSTEM\n•\tEngineer (with Investigative and Conventional) \t\t\t\tSTEM\n•\tEnvironmental science\t\t\t\t\t\tSTEM\n•\tFashion design (with Artistic and Enterprising) \t\t\t\tARTS & DESIGN\n•\tFine Artist, Including Painter, Sculptor and Illustrator (with Artistic) \t\t\tARTS & DESIGN\n•\tFirefighter (with Social and Enterprising) \t\t\t\t\tSTEM\n•\tGraphic designer (with Artistic and Enterprising) \t\t\t\tARTS & DESIGN / ICT\n•\tInterior design (with Artistic) \t\t\t\t\t\tARTS & DESIGN\n•\tModel (people) (with Artistic and Enterprising) \t\t\t\tHUMSS\n•\tMusician (with Artistic and Enterprising) \t\t\t\t\tARTS & DESIGN\n•\tNurse (with Social, Conventional, and Investigative) \t\t\t\tSTEM\n•\tPark Naturalist (with Social and Artistic) \t\t\t\t\tSTEM\n•\tPersonal trainer (with Enterprising and Social) \t\t\t\tSPORTS\n•\tPhotographer (with Artistic and Enterprising) \t\t\t\tARTS & DESIGN / ICT\n•\tPhysical therapy (with Social and Investigative) \t\t\t\tSTEM / SPORTS\n•\tDriver\t\t\t\t\t\t\tH.E.\n•\tSurgeon (with Investigative and Social) \t\t\t\t\tSTEM\n•\tVeterinarian (with Investigative and Social) \t\t\t\t\tSTEM\n•\tWeb developer (with Conventional, Artistic, and Investigative) \t\t\tICT \n•\tZoologists and Wildlife Biologists (with Investigative) \t\t\t\tSTEM\n");
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1484, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1467, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialogRealisticLayout = new javax.swing.GroupLayout(jDialogRealistic.getContentPane());
        jDialogRealistic.getContentPane().setLayout(jDialogRealisticLayout);
        jDialogRealisticLayout.setHorizontalGroup(
            jDialogRealisticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogRealisticLayout.setVerticalGroup(
            jDialogRealisticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogRealisticLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialogInvestigative.setTitle("Investigative");
        jDialogInvestigative.setLocation(new java.awt.Point(0, 0));
        jDialogInvestigative.setResizable(false);
        jDialogInvestigative.setSize(new java.awt.Dimension(1600, 860));

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextArea5.setRows(5);
        jTextArea5.setText("I = Investigative\n\nThese people like to watch, learn, analyze and solve problems. Good college majors for Investigative people are...\n\nI: Investigative (Thinkers)\t\t\t\t\t\t               TRACKS / STRAND\n•\tActuary (with Conventional and Enterprising) \t\t\t\tABM\n•\tArchivist/Librarian (with Social and Conventional) \t\t\t\tHUMSS\n•\tCarpenter (with Conventional and Realistic) \t\t\t\t\tH.E.\n•\tChemistry/Chemist (with Realistic and Conventional) \t\t\t\tSTEM\n•\tComputer engineering/Computer science/Information technology/Computer programmer \t\tSTEM / ICT\n(with Realistic and Conventional) \t\t\t\t\t\t\n•\tCounselor (with Social and Artistic) \t\t\t\t\tHUMSS\n•\tDentist (with Realistic and Social) \t\t\t\t\tSTEM\n•\tDietitian/Nutritionist (with Social and Enterprising) \t\t\t\tSTEM\n•\tEconomics (with Conventional and social) \t\t\t\t\tABM\n•\tEngineer (with Realistic and Conventional) \t\t\t\t\tSTEM\n•\tFinance (with Enterprising and Conventional) \t\t\t\tABM\n•\tLawyer (with Enterprising and Social) \t\t\t\t\tHUMSS\n•\tMathematician (with Artistic)\t\t\t\t\t\tSTEM / ABM\n•\tNurse (with Realistic, Conventional, and Social) \t\t\t\tSTEM\n•\tPharmacist (with Social and Conventional)\t\t\t\t\tSTEM\n•\tPhysical therapy (with Social and Realistic) \t\t\t\t\tSTEM / SPORTS\n•\tPhysician (Medical school/Medical research) (with Social) \t\t\t\tSTEM\n•\tPhysics\t\t\t\t\t\t\tSTEM\n•\tProfessor (all fields) \t\t\t\t\t\tALL TRACKS\n•\tPsychology/Psychologist (with Social and Artistic) \t\t\t\t(B.S.)STEM / (A.B.)HUMSS\n•\tSocial Work\t\t\t\t\t\t\tHUMSS\n•\tSurgeon (with Realistic and Social) \t\t\t\t\tSTEM\n•\tTechnical writer (with Artistic and Conventional) \t\t\t\tHUMSS / ARTS & DESIGN\n•\tTutor (with Social) \t\t\t\t\t\tHUMSS / GAS\n•\tVeterinarian (with Realistic and Social) \t\t\t\t\tSTEM\n•\tWeb developer (with Conventional, Realistic, and Artistic) \t\t\t\tICT / STEM\n•\tZoologists and Wildlife Biologists (with Realistic)\t\t\t\tSTEM\n");
        jScrollPane5.setViewportView(jTextArea5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 946, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialogInvestigativeLayout = new javax.swing.GroupLayout(jDialogInvestigative.getContentPane());
        jDialogInvestigative.getContentPane().setLayout(jDialogInvestigativeLayout);
        jDialogInvestigativeLayout.setHorizontalGroup(
            jDialogInvestigativeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogInvestigativeLayout.setVerticalGroup(
            jDialogInvestigativeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogInvestigativeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialogArtistic.setTitle("Artistic");
        jDialogArtistic.setLocation(new java.awt.Point(0, 0));
        jDialogArtistic.setResizable(false);
        jDialogArtistic.setSize(new java.awt.Dimension(1600, 860));

        jTextArea7.setEditable(false);
        jTextArea7.setColumns(20);
        jTextArea7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextArea7.setRows(5);
        jTextArea7.setText("A = Artistic\n\nThese people like to work in unstructed situations where they can use their creativity. Good majors for Artistic people are...\n\nA: Artistic (Creators)\t\t\t\t\t\t\tTRACKS / STRAND\n•\tArchitect (with Realistic and Enterprising) \t\t\t\t\tSTEM\n•\tBroadcast journalism (with Enterprising) \t\t\t\t\tHUMSS\n•\tClergy (with Social and Enterprising) \t\t\t\t\tHUMSS / ABM\n•\tChef (with Enterprising and Realistic)\t\t\t\t\tH.E.\n•\tCounselor (with Investigative and Social) \t\t\t\t\tHUMSS\n•\tDance (with Realistic) \t\t\t\t\t\tARTS & DESIGN\n•\tFashion design (with Realistic and Enterprising) \t\t\t\tARTS & DESIGN\n•\tFine Artist, Including Painter, Sculptor and Illustrator (with Realistic) \t\t\tARTS & DESIGN\n•\tGraphic designer (with Enterprising and Realistic) \t\t\t\tARTS & DESIGN / ICT\n•\tInterior design (with Realistic) \t\t\t\t\tARTS & DESIGN\t\t\t\t\n•\tModel (people) (with Realistic and Enterprising) \t\t\t\tHUMSS\n•\tMusician (with Enterprising and Realistic) \t\t\t\t\tARTS & DESIGN\n•\tPark Naturalist (with Social and Realistic) \t\t\t\t\tSTEM\n•\tPsychology/Psychologist (with Social and Investigative)\t\t\t\t(B.S.)STEM / (A.B.)HUMSS\n•\tArt therapist/Dance therapy/Drama therapy/Music therapy (with social)\t\t\tSTEM & ARTS / DESIGN\n•\tPublic relations (with Enterprising) \t\t\t\t\tHUMSS\n•\tPhotographer (with Realistic and Enterprising) \t\t\t\tARTS & DESIGN / ICT\n•\tTeacher (with Social) \t\t\t\t\t\tGAS / HUMSS\n•\tTechnical writer (with Investigative and Conventional) \t\t\t\tHUMSS / ARTS & \n   \t\t\t\t\t\t\t\tDESIGN              \n•\tTrainer (business) (with Social and Conventional) \t\t\t\tABM / HUMSS\n•\tWeb developer (with Conventional, Realistic, and Investigative) \t\t\tICT / STEM\n");
        jScrollPane7.setViewportView(jTextArea7);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 946, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialogArtisticLayout = new javax.swing.GroupLayout(jDialogArtistic.getContentPane());
        jDialogArtistic.getContentPane().setLayout(jDialogArtisticLayout);
        jDialogArtisticLayout.setHorizontalGroup(
            jDialogArtisticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogArtisticLayout.setVerticalGroup(
            jDialogArtisticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogArtisticLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialogSocial.setTitle("Social");
        jDialogSocial.setLocation(new java.awt.Point(0, 0));
        jDialogSocial.setResizable(false);
        jDialogSocial.setSize(new java.awt.Dimension(1600, 860));

        jTextArea8.setEditable(false);
        jTextArea8.setColumns(20);
        jTextArea8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextArea8.setRows(5);
        jTextArea8.setText("S = Social\n\nThese people like to work with other people, rather than things. Good college majors for Social People are...\n\nS: Social (Helpers)\t\t\t\t\t\tTRACKS / STRAND\n•\tArchivist/Librarian (with Conventional and Investigative) \t\t\tHUMSS\n•\tClergy (with Artistic and Enterprising) \t\t\t\tHUMSS / ABM\n•\tCommunity Organizer\t\t\t\t\tHUMSS\n•\tCounselor (with Investigative and Artistic) \t\t\t\tHUMSS\n•\tCustomer service (with Conventional and Enterprising) \t\t\tABM\n•\tDentist (with Investigative and Realistic) \t\t\t\tSTEM\n•\tDietitian/Nutritionist (with Investigative and Enterprising) \t\t\tSTEM\n•\tEconomics (with Investigative and Conventional) \t\t\tABM\n•\tEducation (Teacher/Counselor/Administration)\t\t\tHUMSS / GAS\n•\tEducational administration (with Enterprising and Conventional) \t\tHUMSS / GAS\n•\tFirefighter (with Realistic and Enterprising) \t\t\t\tSTEM\n•\tFitness Trainer and Aerobics Teacher (with Enterprising and Realistic) \t\tARTS & DESIGN / HUMSS\n•\tForeign Service/Diplomacy (with Enterprising and Artistic) \t\t\tHUMSS\n•\tHuman Resources (with Conventional and Enterprising) \t\t\tHUMSS\n•\tLawyer (with Investigative and Enterprising) \t\t\tHUMSS\n•\tNurse (with Realistic, Conventional, and Investigative) \t\t\tSTEM\n•\tPark Naturalist (with Realistic and Artistic) \t\t\t\tSTEM\n•\tPharmacist (with Investigative and Conventional) \t\t\tSTEM\n•\tPhysical therapy (with Realistic and Investigative) \t\t\tSTEM / ARTS & DESIGN\n•\tPhysician (Medical school/Medical research) (with Investigative) \t\tSTEM\n•\tProfessor (with Enterprising and Investigative) \t\t\tALL TRACKS\n•\tPsychology/Psychologist (with Investigative and Artistic) \t\t\t(B.S.)STEM / (A.B.)HUMSS\n•\tSocial Advocate\t\t\t\t\tHUMSS\n•\tSociology\t\t\t\t\t\tHUMSS\n•\tSocial Work\t\t\t\t\t\tHUMSS\n•\tSurgeon (with Realistic and Investigative) \t\t\t\tSTEM\n•\tTeacher (Early childhood education, Primary school, Secondary school, \nTeaching English as a second language, Special Ed, and Substitute teaching) (with Artistic) \tHUMSS / GAS\n•\tTrainer (business) (with Artistic and Conventional) \t\t\tABM / HUMSS\n•\tTutor (with Investigative) \t\t\t\t\tHUMSS / GAS\n•\tVeterinarian (with Investigative and Realistic)\t\t\tSTEM\n");
        jScrollPane8.setViewportView(jTextArea8);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialogSocialLayout = new javax.swing.GroupLayout(jDialogSocial.getContentPane());
        jDialogSocial.getContentPane().setLayout(jDialogSocialLayout);
        jDialogSocialLayout.setHorizontalGroup(
            jDialogSocialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogSocialLayout.setVerticalGroup(
            jDialogSocialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialogEnterprising.setTitle("Enterprising");
        jDialogEnterprising.setLocation(new java.awt.Point(0, 0));
        jDialogEnterprising.setResizable(false);
        jDialogEnterprising.setSize(new java.awt.Dimension(1600, 860));

        jTextArea11.setEditable(false);
        jTextArea11.setColumns(20);
        jTextArea11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextArea11.setRows(5);
        jTextArea11.setText("E = Enterprising\n\nThese people like to work with others and enjoy persuading and performing. Good college majors for Enterprising people are...\n\nE: Enterprising (Persuaders)\t\t\t\t\t\tTRACKS / STRAND\n•\tActuary (with Investigative and Conventional) \t\t\tABM\n•\tArchitect (with Artistic and Realistic) \t\t\t\tSTEM\n•\tBusiness\t\t\t\t\t\tABM\n•\tBuyer\t\t\t\t\t\tABM\n•\tChef (with Realistic and Artistic) \t\t\t\tH.E.\n•\tClergy (with Artistic and Social) \t\t\t\tHUMSS\n•\tCustomer service (with Conventional and Social) \t\t\tABM\n•\tDietitian/Nutritionist (with Social and Investigative) \t\t\tSTEM\n•\tEducational administration (with Social and Conventional) \t\t\tSTEM\n•\tEntrepreneur\t\t\t\t\t\tABM\n•\tFashion design (with Artistic and Realistic) \t\t\t\tARTS & DESIGN\n•\tFinance (with Conventional and Investigative) \t\t\tABM\n•\tForeign Service/Diplomacy (with Social and Artistic) \t\t\tHUMSS\n•\tFirefighter (with Social and Realistic) \t\t\t\tSTEM\n•\tFitness Trainer and Aerobics Teacher (with Realistic and Social) \t\tSPORTS / HUMSS\n•\tGraphic designer (with Artistic and Realistic) \t\t\tARTS & DESIGN / ICT\t\n•\tHuman Resources (with Conventional and Social) \t\t\tHUMSS / ABM\n•\tBroadcast journalism (with Artistic) \t\t\t\tHUMSS\n•\tLawyer (with Investigative and Social)\t\t\t\tHUMSS\n•\tManagement/Management Consultant\t\t\t\tABM\n•\tMarket Research Analyst\t\t\t\t\tABM\n•\tModel (people) (with Artistic and Realistic) \t\t\t\tHUMSS\n•\tMusician (with Artistic and Realistic) \t\t\t\tARTS & DESIGN\n•\tPhotographer (with Artistic and Realistic) \t\t\t\tARTS & DESIGN / ICT\n•\tPublic relations/Publicity/Advertising/Marketing (with Artistic) \t\tHUMSS\n•\tReal Estate (with Conventional) \t\t\t\tABM\n•\tSales (with Conventional and Social) \t\t\t\tABM\n");
        jScrollPane11.setViewportView(jTextArea11);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 946, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialogEnterprisingLayout = new javax.swing.GroupLayout(jDialogEnterprising.getContentPane());
        jDialogEnterprising.getContentPane().setLayout(jDialogEnterprisingLayout);
        jDialogEnterprisingLayout.setHorizontalGroup(
            jDialogEnterprisingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogEnterprisingLayout.setVerticalGroup(
            jDialogEnterprisingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogEnterprisingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialogConventional.setTitle("Conventional");
        jDialogConventional.setLocation(new java.awt.Point(0, 0));
        jDialogConventional.setResizable(false);
        jDialogConventional.setSize(new java.awt.Dimension(1600, 860));

        jTextArea13.setEditable(false);
        jTextArea13.setColumns(20);
        jTextArea13.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextArea13.setRows(5);
        jTextArea13.setText("C = Conventional\n\nThese people are very detail oriented, organized and like to work with data. Good college majors for Conventional people are...\n\nC: Conventional (Organizers)\t\t\t\t\t\tTRACKS / STRAND\n•\tAccounting/Tax advisor\t\t\t\t\tABM\n•\tActuary (with Investigative and Enterprising) \t\t\tABM\n•\tArchivist/Librarian (with Social and Investigative) \t\t\tHUMSS\n•\tCarpenter (with Realistic and Investigative) \t\t\t\tH.E.\n•\tChemistry/Chemist (with Investigative and Realistic) \t\t\tSTEM\n•\tComputer engineering/Computer science/Information technology/Computer programmer \n(with Investigative and Realistic) \t\t\t\t\tSTEM / ICT\n•\tCustomer service (with Enterprising and Social) \t\t\tABM\n•\tEconomics (with Investigative and Social) \t\t\t\tABM\n•\tEducational administration (with Social and Enterprising) \t\t\tHUMSS / GAS\n•\tEngineer (with Investigative and Realistic) \t\t\t\tSTEM\n•\tFinance (with Enterprising and Investigative) \t\t\tABM\n•\tHuman Resources (with Enterprising and Social) \t\t\tHUMSS\n•\tMath teacher\t\t\t\t\t\tHUMSS / GAS\n•\tNurse (with Realistic, Social, and Investigative) \t\t\tSTEM\n•\tPharmacist (with Social and Investigative) \t\t\t\tSTEM\n•\tReal Estate (with Enterprising) \t\t\t\tABM\n•\tStatistician (with Realistic and Investigative) \t\t\tSTEM\n•\tTechnical writer (with Artistic and Investigative) \t\t\tARTS &DESIGN\n•\tTrainer (business) (with Social and Artistic) \t\t\t\tABM\n•\tWeb developer (with Artistic, Realistic, and Investigative)\t\t\tICT / STEM\n");
        jScrollPane13.setViewportView(jTextArea13);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 946, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialogConventionalLayout = new javax.swing.GroupLayout(jDialogConventional.getContentPane());
        jDialogConventional.getContentPane().setLayout(jDialogConventionalLayout);
        jDialogConventionalLayout.setHorizontalGroup(
            jDialogConventionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogConventionalLayout.setVerticalGroup(
            jDialogConventionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogConventionalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Result Riasec");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Name :");

        lbl_realistic_total.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbl_realistic_total.setText(".......");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("R = Realistic\t            Total : ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("I = Investigative       Total : ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("A = Artistic\t              Total : ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("S = Social\t                 Total :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("E = Enterprising       Total : ");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("C = Conventional\t     Total : ");

        lbl_name.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbl_name.setText(".......");

        lbl_investigative_total.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbl_investigative_total.setText(".......");

        lbl_artistic_total.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbl_artistic_total.setText(".......");

        lbl_conventional_total.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbl_conventional_total.setText(".......");

        lbl_social_total.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbl_social_total.setText(".......");

        lbl_enterprising_total.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbl_enterprising_total.setText(".......");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel8.setText("My Interest Code");

        lbl_first_interest.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        lbl_first_interest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_first_interest.setText(".......");
        lbl_first_interest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_first_interestMouseClicked(evt);
            }
        });

        lbl_second_interest.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        lbl_second_interest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_second_interest.setText(".......");
        lbl_second_interest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_second_interestMouseClicked(evt);
            }
        });

        lbl_third_interest.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        lbl_third_interest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_third_interest.setText(".......");
        lbl_third_interest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_third_interestMouseClicked(evt);
            }
        });

        btn_logout.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_logout.setText("Back To Login");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_logout))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_investigative_total))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_enterprising_total))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_conventional_total))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_artistic_total)
                                            .addComponent(lbl_social_total)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_realistic_total)))
                                .addGap(0, 89, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_first_interest, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(lbl_second_interest, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_third_interest, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbl_name)
                    .addComponent(btn_logout))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbl_realistic_total))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbl_investigative_total))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbl_artistic_total))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbl_social_total))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbl_enterprising_total))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_conventional_total))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_first_interest)
                    .addComponent(lbl_second_interest)
                    .addComponent(lbl_third_interest))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_first_interestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_first_interestMouseClicked
        FirstInterest();
         if(".......".equals(lbl_first_interest.getText())){
            riasec = "";
        }
         else if(riasec.equals("R")){
              jDialogRealistic.setVisible(true);
        }else if(riasec.equals("I")){
              jDialogInvestigative.setVisible(true);
        }else if(riasec.equals("A")){
              jDialogArtistic.setVisible(true);
        }else if(riasec.equals("S")){
              jDialogSocial.setVisible(true);
        }else if(riasec.equals("E")){
              jDialogEnterprising.setVisible(true);
        }else if(riasec.equals("C")){
              jDialogConventional.setVisible(true);
        }
      
        
 
    }//GEN-LAST:event_lbl_first_interestMouseClicked

    private void lbl_second_interestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_second_interestMouseClicked
        FirstInterest();
        SecondInterest();
        if(".......".equals(lbl_second_interest.getText())){
            riasec = "";
        }
        else if(riasec.equals("R")){
              jDialogRealistic.setVisible(true);
        }else if(riasec.equals("I")){
              jDialogInvestigative.setVisible(true);
        }else if(riasec.equals("A")){
              jDialogArtistic.setVisible(true);
        }else if(riasec.equals("S")){
              jDialogSocial.setVisible(true);
        }else if(riasec.equals("E")){
              jDialogEnterprising.setVisible(true);
        }else if(riasec.equals("C")){
              jDialogConventional.setVisible(true);
        }
    }//GEN-LAST:event_lbl_second_interestMouseClicked

    private void lbl_third_interestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_third_interestMouseClicked
        FirstInterest();
        SecondInterest();
        ThirdInterest();
        if(".......".equals(lbl_third_interest.getText())){
            riasec = "";
        }
         else if(riasec.equals("R")){
              jDialogRealistic.setVisible(true);
        }else if(riasec.equals("I")){
              jDialogInvestigative.setVisible(true);
        }else if(riasec.equals("A")){
              jDialogArtistic.setVisible(true);
        }else if(riasec.equals("S")){
              jDialogSocial.setVisible(true);
        }else if(riasec.equals("E")){
              jDialogEnterprising.setVisible(true);
        }else if(riasec.equals("C")){
              jDialogConventional.setVisible(true);
        }
    }//GEN-LAST:event_lbl_third_interestMouseClicked

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        LoginRiasecFrame logframe = new LoginRiasecFrame();
        logframe.show();
        this.hide();
    }//GEN-LAST:event_btn_logoutActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ResultRiasecFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultRiasecFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultRiasecFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultRiasecFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultRiasecFrame().setVisible(true);
               
            }
        });
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_logout;
    private javax.swing.JDialog jDialogArtistic;
    private javax.swing.JDialog jDialogConventional;
    private javax.swing.JDialog jDialogEnterprising;
    private javax.swing.JDialog jDialogInvestigative;
    private javax.swing.JDialog jDialogRealistic;
    private javax.swing.JDialog jDialogSocial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea13;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JLabel lbl_artistic_total;
    private javax.swing.JLabel lbl_conventional_total;
    private javax.swing.JLabel lbl_enterprising_total;
    private javax.swing.JLabel lbl_first_interest;
    private javax.swing.JLabel lbl_investigative_total;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_realistic_total;
    private javax.swing.JLabel lbl_second_interest;
    private javax.swing.JLabel lbl_social_total;
    private javax.swing.JLabel lbl_third_interest;
    // End of variables declaration//GEN-END:variables
}
