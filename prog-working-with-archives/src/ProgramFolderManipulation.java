import java.io.File;
import java.util.Scanner;

public class ProgramFolderManipulation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a folder path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		// arvore de pastas
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Folders: ");
		for (File folder : folders) {
			System.out.println(folder);
		}

		// apenas arquivos
		System.out.println("-----------------------------------");
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files");
		for (File file : files) {
			System.out.println(file);
		}

		// criando pasta no diretório informado
		System.out.println("-----------------------------------");
		boolean sucess = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created sucessfully: " + sucess);

		System.out.println("-----------------------------------");
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());

		sc.close();

	}

}
