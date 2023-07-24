package br.com.ada.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class JFile {

    public static void main(String[] args) throws IOException {

        File diretorio = new File("c://pastaArquivo");
        diretorio.mkdir();

        File arquivo = new File("arquivo.txt");
        arquivo.createNewFile();

        FileWriter fileWriter = new FileWriter(arquivo);
        String linha = "Linha 1 \n"+
                        "Linha 2\n";
        fileWriter.write(linha);
        fileWriter.close();

        FileReader leitor = new FileReader("arquivo.txt");
        BufferedReader bufferedReader = new BufferedReader(leitor);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        List<String> linhas =  Files.readAllLines(Path.of("arquivo.txt"));
        System.out.println(linhas);

        String linhaUnica =  Files.readString(Path.of("arquivo.txt"));
        System.out.println(linhaUnica);

    }

}
