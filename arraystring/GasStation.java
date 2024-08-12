package arraystring;

public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if(totalGas < totalCost)
            return -1;

        int remainGas = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            remainGas = remainGas + (gas[i] - cost[i]);
            if(remainGas < 0) {
                start = i + 1;
                remainGas = 0;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] gas = {2,3,4};
        int[] cost = {3, 4, 3};
        System.out.println(canCompleteCircuit(gas, cost));
    }
}
