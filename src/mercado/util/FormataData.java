package mercado.util;

import java.time.format.DateTimeFormatter;

public class FormataData {
    public static DateTimeFormatter formatarHora = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy 'ás' HH:mm:ss");
    public static DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

}
