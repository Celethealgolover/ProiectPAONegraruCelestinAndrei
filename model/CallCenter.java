package model;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class CallCenter {
    public static void serviciiPacienti(Pacient p)
    {
        Scanner cin = new Scanner(System.in);
        int s1;
        System.out.println("Bine ati venit in CallCenter-ul cabinetului medical Lifefulness! Pentru a consulta specialitatile medicale disponibile, apasati tasta 1, iar pentru a parasi meniul interactiv, apasati tasta 2");
        s1=cin.nextInt();
        switch(s1)
        {
            case 1:{
                System.out.println("Specialitatile medicale ale clinicii sunt: gastroenterologie, medicina interna, oftalmologie, ORL si psihiatrie!");
                System.out.println("Pentru gastroenterologie, apasati tasta 1\nPentru medicina interna, apasati tasta 2\nPentru Oftalmologie, apasati tasta 3\nPentru ORL, apasati tasta 4\nPentru psihiatrie, apasati tasta 5\nPentru a parasi meniul interactiv, apasati tasta 6");
            int s2=cin.nextInt();
            switch(s2)
            {
                case 1:{
                    System.out.println("Bine ati venit la gastroenterologie!\n Pentru a afisa lista serviciilor disponibile, apasati tasta 1\nPentru programare consult, apasati tasta 2\nPentru programare ecografie abdominala, apasati tasta 3\nPentru programare endoscopie digestiva, apasati tasta 4\nPentru programare colonoscopie, apasati tasta 5\nPentru a parasi meniul interactiv, apasati tasta 6");
                    int s3=cin.nextInt();
                    switch(s3)
                    {
                        case 1:{

                        }break;
                    }
                }break;
                case 2:{

                }break;
                case 3:{

                }break;
                case 4:{

                }break;
                case 5:{

                }break;
                case 6:{
                   return;
                }
            }

            }break;
            case 2:{
                return;
            }
        }
    }
}
