package com.mang;
import java.util.Random;
public class TaoBanDoTroChoiMineSweeper {
    public static void main(String[] args){
        String[][] map = {
                {"*", ".", ".", "."},
                {".", ".", ".", "."},
                {".", "*", ".", "."},
                {".", ".", ".", "."}
        };
        final int MAP_WIDTH = map[0].length;
        final int MAP_HEIGHT = map.length;
        String[][] mapReport = new String[MAP_HEIGHT][MAP_WIDTH];
        for(int yOrdinate = 0; yOrdinate < MAP_HEIGHT; yOrdinate++){
            for(int xOrdinate = 0; xOrdinate < MAP_WIDTH; xOrdinate++){
                if(map[yOrdinate][xOrdinate].equals("*")){
                    mapReport[yOrdinate][xOrdinate] = "*";
                }else{
                    final int[][] NEIGHBOUR_ORDINATE = {
                            {yOrdinate - 1, xOrdinate + 1},{yOrdinate - 1, xOrdinate-1}, {yOrdinate - 1, xOrdinate},
                            {yOrdinate, xOrdinate-1}, {yOrdinate, xOrdinate + 1},
                            {yOrdinate + 1, xOrdinate}, {yOrdinate + 1, xOrdinate - 1}, {yOrdinate + 1, xOrdinate + 1}
                    };
                    int minesAround = 0;
                    for(int i = 0; i < NEIGHBOUR_ORDINATE.length; i++){
                        int[] neighbourOrdinate = NEIGHBOUR_ORDINATE[i];
                        int xOrdinateNeighbour = neighbourOrdinate[1];
                        int yOrdinateNeighbour = neighbourOrdinate[0];
                        boolean isOutOfMapNeighbour = xOrdinateNeighbour < 0
                                                      || xOrdinateNeighbour == MAP_WIDTH
                                                      || yOrdinateNeighbour < 0
                                                      || yOrdinateNeighbour == MAP_HEIGHT;
                        if(isOutOfMapNeighbour) continue;
                        boolean isMineOwnerNeighbour = map[yOrdinateNeighbour][xOrdinateNeighbour].equals("*");
                        if(isMineOwnerNeighbour) minesAround++;
                    }
                    mapReport[yOrdinate][xOrdinate] = String.valueOf(minesAround);
                }
            }
        }
        for(int yOrdinate = 0; yOrdinate < MAP_HEIGHT; yOrdinate++){
            for(int xOrdinate = 0; xOrdinate < MAP_WIDTH; xOrdinate++){
                String currentCellReport = mapReport[yOrdinate][xOrdinate];
                System.out.print(currentCellReport);
            }
            System.out.print("\n");
        }
    }
}
