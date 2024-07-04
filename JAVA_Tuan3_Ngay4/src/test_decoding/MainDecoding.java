package test_decoding;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MainDecoding {
    public static void main(String[] args) {
        List<BigDecimal> lstDouble = Arrays.asList(
            BigDecimal.valueOf(1.222222222222333333365765765),
            BigDecimal.valueOf(3.222222222222223333333343354354),
            BigDecimal.valueOf(5.622222222222287655545577)
        );

        // Tính tổng các giá trị BigDecimal
        BigDecimal sum = lstDouble.stream()
            .reduce(BigDecimal.ZERO, BigDecimal::add);

        // Tính trung bình với độ chính xác cao
        BigDecimal average = sum.divide(BigDecimal.valueOf(lstDouble.size()), 20, RoundingMode.HALF_UP);

        System.out.println("Tổng: " + sum);  // In ra tổng của các giá trị BigDecimal
        System.out.println("Trung bình: " + average);  // In ra giá trị trung bình dưới dạng BigDecimal
    }
//	public static void main(String[] args) {
//		List<String> strings = Arrays.asList("Madam", "radar", "defied");
//		Predicate<String> isPalindrome = str -> {
//			String reverseString = new StringBuilder(str).reverse().toString();
//			return str.equals(reverseString);
//		};
//		
//		strings.forEach(str -> System.out.println(str + " is a palindrome? " + isPalindrome.test(str)));
//
//	}
//	public static void main(String[] args) {
//		List<Integer> numbers = Arrays.asList(1,7,18,25,300,101);
//		Optional<Integer> smallest = numbers.stream().min(Comparator.naturalOrder());
//		Optional<Integer> largest = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
//		largest.ifPresent(secondMax -> System.out.println("Second largest element: " + secondMax));
//		smallest.ifPresent(min -> System.out.println("The smallest element: " + min));
//	}
}