import java.util.*;
public class Testing{
	public static void main(String[] args){
		for (int n = 0; n < 30; n++) {
			System.out.print("*" + " ");
			if (n % 10 == 9)
				System.out.print(" | ");
	}
}
}