package JavaBasics_Mid.HouseRentSystem.HouseView;

import JavaBasics_Mid.HouseRentSystem.HouseDomain.House;
import JavaBasics_Mid.HouseRentSystem.HouseService.HouseService;
import JavaBasics_Mid.HouseRentSystem.Tools.Utool;

/**
 * @version 1.0
 * @Author tor
 * @Date 2022/7/3 9:46
 * @ע��
 */
public class HouseView {
    private boolean isexit = true;//���Ʋ˵�����

    //����Service���󣬵���ҵ���
    HouseService houseService = new HouseService();

    public boolean getIsexit() {
        return isexit;
    }

    public void setIsexit(boolean isexit) {
        this.isexit = isexit;
    }

    /**
     * @Author: tor
     * @Description: ��ʾ���˵�
     * @Date: 2022/7/3 19:05
     * @Params: []
     * @Return: void
     **/
    public void showMenu() {
        do {
            System.out.println("------------------���ݳ���ϵͳ���˵�------------------");
            System.out.println("\t\t\t\t1 �� �� �� Դ");
            System.out.println("\t\t\t\t2 �� �� �� �� �� Ϣ");
            System.out.println("\t\t\t\t3 ɾ �� �� �� �� Ϣ");
            System.out.println("\t\t\t\t4 �� �� �� �� �� Ϣ");
            System.out.println("\t\t\t\t5 �� �� �� ��");
            System.out.println("\t\t\t\t6 ��         ��");
            System.out.println("---------------------------------------------------------");
            System.out.print("��������Ҫ����Ĳ˵�����(1-6)��");
            switch (Utool.readMenuSelection()) {
                case '1':
                    showHouseList();
                    break;
                case '2':
                    System.out.println(2);
                    break;
                case '3':
                    System.out.println(3);
                    break;
                case '4':
                    System.out.println(4);
                    break;
                case '5':
                    showHouse();
                    break;
                case '6':
                    houseService.exit(this);
                    break;
            }
        } while (isexit);
    }

    /**
     * @Author: tor
     * @Description: ��ʾ�����б�
     * @Date: 2022/7/3 19:05
     * @Params: []
     * @Return: void
     **/
    public void showHouse() {
        System.out.println("------------------�� �� �� ��------------------");
        for (int i = 0; i < houseService.houseList().length; i++) {
                if (houseService.houseList()[i] == null) {
                    System.out.println("Ŀǰ���޷�Դ����������");

                }else {
                    System.out.println(houseService.houseList()[i]);
                }

            }
    }



    /**
     * @Author: tor
     * @Description: ��ʾ���˵�
     * @Date: 2022/7/3 19:05
     * @Params: []
     * @Return: void
     **/
    public void showHouseList() {
        System.out.println("------------------����������Դ��------------------");
        houseService.addHouse();
    }
}