package _13_IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class _01_ByteArrayIDEx {
	public static void main(String[] args) {
		byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		byte[] outSrc = null;
		byte[] tmp = new byte[4];

		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();

		System.out.println("input: " + Arrays.toString(inSrc));

		try {
			while (input.available() > 0) {
				// input스트림에 데이터를 tmp에 쓰고, 길이값은 length에 저장
				int length = input.read(tmp);// 입력스트림으로부터 읽어서 tmp에 넣어둠
				output.write(tmp, 0, length);// tmp에 값을 출력스트림(output)에 씀.
				outSrc = output.toByteArray();
				System.out.println("tmp: " + Arrays.toString(tmp));
				System.out.println("outSrc: " + Arrays.toString(outSrc));
			}
		} catch (IOException e) {
		}
		outSrc = output.toByteArray();
		System.out.println("input: " + Arrays.toString(inSrc));
		System.out.println("tmp: " + Arrays.toString(tmp));
		System.out.println("output: " + Arrays.toString(outSrc));
	}
}
