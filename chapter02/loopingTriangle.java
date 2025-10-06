/*
    Exercise: Looping A Triangle
    Write a loop that makes seven calls to console.log to output the following triangle:
    #
    ##
    ###
    ####
    #####
    ######
    #######
*/
public class Main{
    public static void main(String[] args){
        for(int i = 1; i <= 7; i++){
            int counter = 0;
            while(counter < i){
                System.out.print("#");
                counter++;
            }
            System.out.println();
        }
    }
}
