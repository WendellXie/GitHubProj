import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class BufferedDemo {
	// ���������������ַ������ d:\\kd52\\���.txt��Щ����
	// �����ַ����������ļ����ݶ�������ʾ����̨
	public static void main(String[] args) {
		Writer w = null;
		BufferedWriter bw = null;

		Reader r = null;
		BufferedReader br = null;
		try {
			// ���
			w = new FileWriter("d:\\kd52\\���.txt");
			bw = new BufferedWriter(w);

			bw.write("��ã�");
			bw.newLine();
			bw.write("hhshsh");
			bw.newLine();
			bw.write("д����ϣ�");
			bw.flush();

			// ����
			r = new FileReader("d:\\kd52\\���.txt");
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
