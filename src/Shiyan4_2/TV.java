package Shiyan4_2;

public class TV {
    int channel;
    void setChannel(int m){
        if(m>=1){
            channel = m;
        }
    }
    int getChannel(){
        return channel;
    }
    void showProgram(){
        switch (channel){
            case 1 : System.out.println("综合频道");
                break;
            case 2 : System.out.println("经济频道");
                break;
            case 3 : System.out.println("文艺频道");
                break;
            case 4 : System.out.println("国际频道");
                break;
            case 5 : System.out.println("不能收看"+channel+"频道");
                break;
        }
    }
}
