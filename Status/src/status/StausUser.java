/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
public class StausUser 
{
   public void statusDetail(String code)
{
switch( code.toUpperCase())
        {
            case "ZERO": System.out.println(StatusEnum.REJECTED.toString());
                break;
            case "ONE": System.out.println(StatusEnum.PENDING.toString());
                break;
            case "TWO":
                System.out.println(StatusEnum.PROCESSING.toString());
                break;
            case "THREE":
                System.out.println(StatusEnum.APPROVED.toString());
                break;
            default:
                System.out.println("NOT VALID CODE");
                break;
        }
    }
}
