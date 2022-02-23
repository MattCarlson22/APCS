public class ExperimentalFarm {
    private Plot[][] farmPlots;

    public ExperimentalFarm(Plot[][] p) {
        farmPlots = p;
    }
    public Plot getHighestYield(String c) {
        int highestYield = 0;
        int highestI = 0;
        int highestJ = 0;
        int isHighest = 0;
        for (int i = 0; i < farmPlots.length; i++) {
            for (int j = 0; j < farmPlots[i].length; j++) {
                if (farmPlots[i][j].getCropYield() > highestYield && farmPlots[i][j].getCropType().equals(c)) {
                    highestYield = farmPlots[i][j].getCropYield();
                    highestI = i;
                    highestJ = j;
                    isHighest++;
                }
            }
        }
        if (isHighest > 0)
            return farmPlots[highestI][highestJ];
        return null;
    }
    public boolean sameCrop(int col) {
        String firstCrop = farmPlots[0][col].getCropType();
        for (int i = 0; i < farmPlots.length; i++) {
            if (!farmPlots[i][col].getCropType().equals(firstCrop)) {
                return false;
            }
        }
        return true;
    }

}