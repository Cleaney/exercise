/**
 * @author �����
 * @version  1.0
 * @return  ����ֵΪ��
 */

public class exercise {
//	 public static void main(String args[]) {
//	 	System.out.println(a);
//	 	System.out.println("-------------------======");
//	 	System.out.println("����\t����\t�۸�\t����\n����\t�޹���\t120\t1000");
//	int a = 2;
//    int b = 3;
//    if(a!=b){
//        System.out.println("a������b");

         //��Ԫ�����
         int a = 3;
         int b = 4;
         int c = 5;
         int maxNum = (a > b ? a : b) > c ? (a > b ? a : b) : c;
//         System.out.println(maxNum);

                    //2��4����ҵ
                 /* 1��2|3=?         //3
                 * ���㲽�裺�����2��ԭ���3��ԭ��
                 * ������2��3��int���ͣ�����2��ԭ�룺00000000 00000000 00000000 00000010
                 * ����Ϊjava����λ��|����ʱ���ò��룬�����Ĳ������ԭ�롣
                 * 2�Ĳ���Ҳ�ǣ�00000000 00000000 00000000 00000010
                 * 3��ԭ�룺00000000 00000000 00000000 00000011
                 * 3�Ĳ��룺00000000 00000000 00000000 00000011
                 * |������00000000 00000000 00000000 00000010   //2
                 *           00000000 00000000 00000000 00000011    //3
                 *           00000000 00000000 00000000 00000011     //3
                 *  ��󣬿����Ҫ��ԭ�룬�Ѳ��뻻���ԭ�뻹��00000000 00000000 00000000 00000011
                */
//                 System.out.println(2|3);

                /*2��2^3=?           //1
                *���㲽�裺�����2��ԭ���3��ԭ��
                *������2��3��int���ͣ�����2��ԭ�룺00000000 00000000 00000000 00000010
                 * ����Ϊ�����������λ���^����ʱ���ò��룬�����Ĳ������ԭ�롣
                 * 2�Ĳ���Ҳ�ǣ�00000000 00000000 00000000 00000010
                 * 3��ԭ�룺   00000000 00000000 00000000 00000011
                 * 3�Ĳ��룺   00000000 00000000 00000000 00000011
                 * ^������00000000 00000000 00000000 00000010   //2
                 *             00000000 00000000 00000000 00000011    //3
                 *             00000000 00000000 00000000 00000001     //1
                 *  ��󣬿����Ҫ��ԭ�룬�Ѳ��뻻���ԭ�뻹��00000000 00000000 00000000 00000001
                */
//                  System.out.println(2^3);

                 /*��~2=��    //-3
                *���㲽�裺�����2��ԭ��
                *������2��int���ͣ�����2��ԭ�룺00000000 00000000 00000000 00000010
                * ����Ϊ�����������λȡ��~����ʱ���ò��룬�����Ĳ������ԭ�롣
                * 2�Ĳ���Ҳ�ǣ�00000000 00000000 00000000 00000010
                * ~������00000000 00000000 00000000 00000010�����룩
                *             11111111 11111111 11111111 11111101��ȡ�����õ������Ĳ��룩
                *  ��󣬿����Ҫ��ԭ�룬�Ѳ��뻻���ԭ�롣
                * ������ԭ�� = ����ȡ��������λ����
                *             11111111 11111111 11111111 11111100������ = ���� - 1��
                *             10000000 00000000 00000000 00000011��ȡ����
                */
//                   System.out.println(~2);

                /*��2&3=��   //2
               *���㲽�裺�����2��ԭ���3��ԭ��
               *������2��3��int���ͣ�����2��ԭ�룺00000000 00000000 00000000 00000010
               * ����Ϊ�����������λ��&����ʱ���ò��룬�����Ĳ������ԭ�롣
               * 2�Ĳ���Ҳ�ǣ�00000000 00000000 00000000 00000010
               * 3��ԭ�룺   00000000 00000000 00000000 00000011
               * 3�Ĳ��룺   00000000 00000000 00000000 00000011
               * &������00000000 00000000 00000000 00000010   //2
               *             00000000 00000000 00000000 00000011    //3
               *             00000000 00000000 00000000 00000010     //2
               *  ��󣬿����Ҫ��ԭ�룬�Ѳ��뻻���ԭ�뻹��00000000 00000000 00000000 00000010
               */
//                  System.out.println(2&3);

                /*��~-5=��   //4
               *���㲽�裺�����-5��ԭ��
               *������-5��int���͡�
               * ����-5��ԭ�룺10000000 00000000 00000000 00000101
               * �����ķ������ԭ�����λ���䣬����λ��ȡ��
               * -5�ķ��룺      11111111 11111111 11111111 11111010
               * ����Ϊ�����������λȡ��~����ʱ���ò��룬�����Ĳ���������ķ���+1
               * -5�Ĳ��룺      11111111 11111111 11111111 11111011��+1��
               * ~������11111111 11111111 11111111 11111011
               *             00000000 00000000 00000000 00000100    //4
               *  ��󣬿����Ҫ��ԭ�룬�Ѳ��뻻���ԭ�룺00000000 00000000 00000000 00000100
               */
//                  System.out.println(~-5);

                /*��13&7=��  //3 ��  ʵ����5
               *���㲽�裺�����13��ԭ���7��ԭ��
               *������13��7��int���ͣ�����13��ԭ���ǣ�00000000 00000000 00000000 00001101    //����ԭ������� ԭ�����00000000 00000000 00000000 00001011(11)
               * ����Ϊ�����������λ��&����ʱ���ò��룬�����Ĳ������ԭ�롣
               * 13�Ĳ���Ҳ�ǣ�00000000 00000000 00000000 00001101
               * 7��ԭ�룺        00000000 00000000 00000000 00000111
               * 7�Ĳ��룺        00000000 00000000 00000000 00000111
               * &������00000000 00000000 00000000 00001101   //13
               *             00000000 00000000 00000000 00000111   //7
               *             00000000 00000000 00000000 00000101   //5
               *  ��󣬿����Ҫ��ԭ�룬�Ѳ��뻻���ԭ�뻹��00000000 00000000 00000000 00000101
               */
//                  System.out.println(13&7);


                /*��5|4=��   //5
               *���㲽�裺�����5��ԭ���4��ԭ��
               *������5��4��int���ͣ�����5��ԭ���ǣ�00000000 00000000 00000000 00000101
               * ����Ϊ�����������λ��|����ʱ���ò��룬�����Ĳ������ԭ�롣
               * 5�Ĳ���Ҳ�ǣ�00000000 00000000 00000000 00000101
               * 4��ԭ�룺      00000000 00000000 00000000 00000100
               * 4�Ĳ��룺      00000000 00000000 00000000 00000100
               * |������00000000 00000000 00000000 00000101   //5
               *           00000000 00000000 00000000 00000100    //4
               *           00000000 00000000 00000000 00000101    //5
               *  ��󣬿����Ҫ��ԭ�룬�Ѳ��뻻���ԭ�뻹��00000000 00000000 00000000 00000101
               */
//                  System.out.println(5|4);

               /*��-3^3=?  //-1  �� ʵ����-2
               *���㲽�裺�����-3��ԭ���3��ԭ��
               *������-3��3��int���ͣ�����3��ԭ���ǣ�00000000 00000000 00000000 00000011
               * ����Ϊ�����������λ���^����ʱ���ò��룬����3�Ĳ������ԭ�룬-3�Ĳ�����ڷ���+1
               * 3�Ĳ���Ҳ�ǣ�00000000 00000000 00000000 00000011
               * -3��ԭ�룺     10000000 00000000 00000000 00000011
               * �����ķ������ԭ�����λ���䣬����λ��ȡ��
               * -3�ķ��룺     11111111 11111111 11111111 11111100
               * -3�Ĳ��룺     11111111 11111111 11111111 11111101��+1��
               * ^������11111111 11111111 11111111 11111101
               *             00000000 00000000 00000000 00000011
               *             11111111 11111111 11111111 11111110
               *  ��󣬿����Ҫ��ԭ�룬�Ѳ��뻻���ԭ��
               * ������ԭ����ڷ������λ���䣬����λ��ȡ��
               *            11111111 11111111 11111111 11111101������ = ���� - 1��
               *            10000000 00000000 00000000 00000010��ԭ�룩
               */
//                  System.out.println(-3^3);
//--------------------------------------------------------------------------------------------
                    /*2��5����ҵ
                    %����ģ����
                        ��ʽ������=a - a / b * b
                        a-a/b*b=(-7)-(-7)/2*2
                                    =(-7)-(-3)*2
                                    =(-7)+6
                                    =-1*/
//                        System.out.println(-7 % 2);    //-1

                        /*=7-7/(-2)*(-2)
                        =7-(-3)*(-2)
                        =7-6
                        =1*/
//                        System.out.println(7 % -2);    //1

                        /*=(-7)-(-7)/(-2)*(-2)
                        =(-7)-3*(-2)
                        =(-7)-(-6)
                        =-1*/
//                        System.out.println(-7 % -2);   //-1

                   /* %С������ģ����
                    ��aΪС��ʱ����ʽ��a % b = a �� ��int��(a / b) * b��
                       -8.5%-3.2=��
                       =(-8.5) - int(2.65625) * (-3.2)
                       =(-8.5) - 2 * (-3.2)
                       =(-8.5) - (-6.4)
                       =(-8.5) + 6.4
                       =-2.1 �����ƣ�*/
//                        System.out.println(-8.5 % -3.2);

                        /*8.5 - (-2) * (-3.2)
                        = 8.5 - 6.4
                        = 2.1*/
//                        System.out.println(8.5 % -3.2);

                        /*8 - int(8/3.0) * 3.0
                        =8 - 6.0
                        =2.0*/
//                        System.out.println(8 % 3.0);


//                        ��������Ϊ0
//                        Exception in thread "main" java.lang.ArithmeticException: / by zero
//                        System.out.println(6/0);

//                        �������ֵInfinity����ʾ�����
//                        System.out.println(6.5 / 0);

//                        �������ֵNaN����ʾNot a Number
//                        System.out.println(0.0 / 0);

//                        �������ֵ-Infinity����ʾ�������
//                        System.out.println(-1.0 / 0);

/*             int a = 1;
                int b = 2;
                int c = a ^ b  ^ a; //1 2 2
                int d = a ^ b  ^ b;//1 2 1
                System.out.println(c);//2
                System.out.println(d);//1*/


//     }
}