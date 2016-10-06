package pr06_CustomEnumAnnotations;

import pr06_CustomEnumAnnotations.anotations.CustomAnnotation;
import pr06_CustomEnumAnnotations.enums.CardRank;
import pr06_CustomEnumAnnotations.enums.CardSuit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String infoFor = reader.readLine();

        Class<CardRank> clRank = CardRank.class;
        Class<CardSuit> clSuit = CardSuit.class;

        CustomAnnotation clRankAnnotation = clRank.getAnnotation(CustomAnnotation.class);
        CustomAnnotation clSuitAnnotation = clSuit.getAnnotation(CustomAnnotation.class);

        if (clRankAnnotation != null && clRankAnnotation.category().equals(infoFor)) {
            System.out.printf("Type = %s, Description = %s.%n", clRankAnnotation.type(), clRankAnnotation.description());
        }
        else if (clSuitAnnotation != null && clSuitAnnotation.category().equals(infoFor)) {
            System.out.printf("Type = %s, Description = %s.%n", clSuitAnnotation.type(), clSuitAnnotation.description());
        }
    }
}
