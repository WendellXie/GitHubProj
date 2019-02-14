import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class BufferedDemo {
	// 借助带缓冲区的字符输出流 d:\\kd52\\简介.txt中些内容
	// 借助字符输入流将文件内容读出来显示控制台
	public static void main(String[] args) {
		Writer w = null;
		BufferedWriter bw = null;

		Reader r = null;
		BufferedReader br = null;
		try {
			// 输出
			w = new FileWriter("d:\\kd52\\简介.txt");
			bw = new BufferedWriter(w);

			bw.write("你好！");
			bw.newLine();
			bw.write("hhshsh");
			bw.newLine();
			bw.write("写入完毕！");
			bw.flush();

			// 输入
			r = new FileReader("d:\\kd52\\简介.txt");
			br = new BufferedReader(r);
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				w.close();
				bw.close();
				r.close();
				br.close();
			} catch (Exception e) {
			}
		}
	}

}
